package com.example.examplemod;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILlamaFollowCaravan;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.AbstractChestHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLlamaSpit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.Vec3d;

public class EntityVicuna extends AbstractChestHorse implements IRangedAttackMob
{
    private static final DataParameter<Integer> DATA_STRENGTH_ID = EntityDataManager.<Integer>createKey(EntityVicuna.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> DATA_COLOR_ID = EntityDataManager.<Integer>createKey(EntityVicuna.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> DATA_VARIANT_ID = EntityDataManager.<Integer>createKey(EntityVicuna.class, DataSerializers.VARINT);
    private boolean didSpit;
    @Nullable
    private EntityVicuna caravanHead;
    @Nullable
    private EntityVicuna caravanTail;

    public EntityVicuna(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 1.87F);
    }

    private void setStrength(int strengthIn)
    {
        this.dataManager.set(DATA_STRENGTH_ID, Integer.valueOf(Math.max(1, Math.min(5, strengthIn))));
    }

    private void setRandomStrength()
    {
        int i = this.rand.nextFloat() < 0.04F ? 5 : 3;
        this.setStrength(1 + this.rand.nextInt(i));
    }

    public int getStrength()
    {
        return ((Integer)this.dataManager.get(DATA_STRENGTH_ID)).intValue();
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Variant", this.getVariant());
        compound.setInteger("Strength", this.getStrength());

        if (!this.horseChest.getStackInSlot(1).isEmpty())
        {
            compound.setTag("DecorItem", this.horseChest.getStackInSlot(1).writeToNBT(new NBTTagCompound()));
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        this.setStrength(compound.getInteger("Strength"));
        super.readEntityFromNBT(compound);
        this.setVariant(compound.getInteger("Variant"));

        if (compound.hasKey("DecorItem", 10))
        {
            this.horseChest.setInventorySlotContents(1, new ItemStack(compound.getCompoundTag("DecorItem")));
        }

        this.updateHorseSlots();
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIRunAroundLikeCrazy(this, 1.2D));
        this.tasks.addTask(3, new EntityAIAttackRanged(this, 1.25D, 40, 20.0F));
        this.tasks.addTask(3, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(4, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.7D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));

  
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(DATA_STRENGTH_ID, Integer.valueOf(0));
        this.dataManager.register(DATA_COLOR_ID, Integer.valueOf(-1));
        this.dataManager.register(DATA_VARIANT_ID, Integer.valueOf(0));
    }

    public int getVariant()
    {
        return MathHelper.clamp(((Integer)this.dataManager.get(DATA_VARIANT_ID)).intValue(), 0, 3);
    }

    public void setVariant(int variantIn)
    {
        this.dataManager.set(DATA_VARIANT_ID, Integer.valueOf(variantIn));
    }

    protected int getInventorySize()
    {
        return this.hasChest() ? 2 + 3 * this.getInventoryColumns() : super.getInventorySize();
    }

    public void updatePassenger(Entity passenger)
    {
        if (this.isPassenger(passenger))
        {
            float f = MathHelper.cos(this.renderYawOffset * 0.017453292F);
            float f1 = MathHelper.sin(this.renderYawOffset * 0.017453292F);
            float f2 = 0.3F;
            passenger.setPosition(this.posX + (double)(0.3F * f1), this.posY + this.getMountedYOffset() + passenger.getYOffset(), this.posZ - (double)(0.3F * f));
        }
    }

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
        return (double)this.height * 0.67D;
    }

    /**
     * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
     * by a player and the player is holding a carrot-on-a-stick
     */
   
    

    /**
     * Called only once on an entity when first time spawned, via egg, mob spawner, natural spawning etc, but not called
     * when entity is reloaded from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setRandomStrength();
        int i;

        if (livingdata instanceof EntityVicuna.GroupData)
        {
            i = ((EntityVicuna.GroupData)livingdata).variant;
        }
        else
        {
            i = this.rand.nextInt(2);
            livingdata = new EntityVicuna.GroupData(i);
        }

        this.setVariant(i);
        return livingdata;
    }

    

    protected SoundEvent getAngrySound()
    {
        return SoundEvents.ENTITY_LLAMA_ANGRY;
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_LLAMA_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_LLAMA_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_LLAMA_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_LLAMA_STEP, 0.15F, 1.0F);
    }

    protected void playChestEquipSound()
    {
        this.playSound(SoundEvents.ENTITY_LLAMA_CHEST, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
    }

    public void makeMad()
    {
        SoundEvent soundevent = this.getAngrySound();

        if (soundevent != null)
        {
            this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
        }
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_LLAMA;
    }

   
    {

    }

    /**
     * Called by InventoryBasic.onInventoryChanged() on a array that is never filled.
     */
   
    

    /**
     * Updates the items in the saddle and armor slots of the horse's inventory.
     */
    
    


    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        return otherAnimal != this && otherAnimal instanceof EntityVicuna && this.canMate() && ((EntityVicuna)otherAnimal).canMate();
    }

    public EntityVicuna createChild(EntityAgeable ageable)
    {
        EntityVicuna entityllama = new EntityVicuna(this.world);
        this.setOffspringAttributes(ageable, entityllama);
        EntityVicuna entityllama1 = (EntityVicuna)ageable;
        int i = this.rand.nextInt(Math.max(this.getStrength(), entityllama1.getStrength())) + 1;

        if (this.rand.nextFloat() < 0.03F)
        {
            ++i;
        }

        entityllama.setStrength(i);
        entityllama.setVariant(this.rand.nextBoolean() ? this.getVariant() : entityllama1.getVariant());
        return entityllama;
    }

  

    

           
    

   

    protected void followMother()
    {
        if (!this.isChild())
        {
            super.followMother();
        }
    }

    public boolean canEatGrass()
    {
        return false;
    }

    /**
     * Attack the specified entity using a ranged attack.
     */
    
   


            /**
             * Returns whether the EntityAIBase should begin execution.
             */
           
            

           

            /**
             * Returns whether an in-progress EntityAIBase should continue executing
             */
          

    static class GroupData implements IEntityLivingData
        {
            public int variant;

            private GroupData(int variantIn)
            {
                this.variant = variantIn;
            }
        }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSwingingArms(boolean swingingArms) {
		// TODO Auto-generated method stub
		
	}
	
}