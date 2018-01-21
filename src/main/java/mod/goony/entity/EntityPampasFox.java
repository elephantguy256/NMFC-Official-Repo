package mod.goony.entity;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import mod.goony.entity.EntityVicuna.EntityAIPanic;
import mod.goony.sounds.SoundEvents2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class EntityPampasFox extends EntityTameable
{
    public class AIAvoidEntity extends EntityAIBase {

		public AIAvoidEntity(EntityPampasFox entityPampasFox, Class<EntityPuma> class1, float f, double d, double e) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean shouldExecute() {
			// TODO Auto-generated method stub
			return false;
		}

	}

	public class AISpiderTarget extends EntityAIBase {

		public AISpiderTarget(EntityPampasFox entityPuma, Class<EntityPlayer> class1) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean shouldExecute() {
			// TODO Auto-generated method stub
			return false;
		}

	}

	private static final DataParameter<Integer> OCELOT_VARIANT = EntityDataManager.<Integer>createKey(EntityPampasFox.class, DataSerializers.VARINT);
    private EntityAIAvoidEntity<EntityPlayer> avoidEntity;
    /** The tempt AI task for this mob, used to prevent taming while it is fleeing. */
    private EntityAITempt aiTempt;

    public EntityPampasFox(World worldIn)
    {
        super(worldIn);
        this.setSize(1.4F, 1.4F);
    }

    protected void initEntityAI()
    {
       
        this.tasks.addTask(4, new EntityAILeapAtTarget(this, 0.4F));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIOcelotAttack(this));
        this.tasks.addTask(12, new EntityPampasFox.AIAvoidEntity(this, EntityPuma.class, 8.0F, 2.2D, 2.2D));
        this.tasks.addTask(9, new EntityAIMate(this, 0.8D));
        this.tasks.addTask(10, new EntityAIWanderAvoidWater(this, 0.8D, 1.0000001E-5F));
        this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.targetTasks.addTask(1, new EntityAITargetNonTamed(this, EntityChicken.class, false, (Predicate)null));
        this.targetTasks.addTask(1, new EntityAITargetNonTamed(this, EntityRabbit.class, false, (Predicate)null));
        this.targetTasks.addTask(1, new EntityAITargetNonTamed(this, EntityGuineaPig.class, false, (Predicate)null));
        this.targetTasks.addTask(1, new EntityAITargetNonTamed(this, EntityChinchilla.class, false, (Predicate)null));
        this.targetTasks.addTask(1, new EntityAITargetNonTamed(this, EntityAndeanGoose.class, false, (Predicate)null));
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(OCELOT_VARIANT, Integer.valueOf(0));
    }

    public void updateAITasks()
    {
        if (this.getMoveHelper().isUpdating())
        {
            double d0 = this.getMoveHelper().getSpeed();

            if (d0 == 0.6D)
            {
                this.setSneaking(true);
                this.setSprinting(false);
            }
            else if (d0 == 1.33D)
            {
                this.setSneaking(false);
                this.setSprinting(true);
            }
            else
            {
                this.setSneaking(false);
                this.setSprinting(false);
            }
        }
        else
        {
            this.setSneaking(false);
            this.setSprinting(false);
        }
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return !this.isTamed() && this.ticksExisted > 2400;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
    }

    public void fall(float distance, float damageMultiplier)
    {
    }

    public static void registerFixesOcelot(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityPampasFox.class);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("CatType", this.getTameSkin());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.setTameSkin(compound.getInteger("CatType"));
    }

    @Nullable
    protected SoundEvent getAmbientSound()
    {
        if (this.isTamed())
        {
            if (this.isInLove())
            {
                return SoundEvents.ENTITY_WOLF_AMBIENT;
            }
            else
            {
                return this.rand.nextInt(4) == 0 ? SoundEvents.ENTITY_WOLF_AMBIENT : SoundEvents.ENTITY_WOLF_AMBIENT;
            }
        }
        else
        {
            return SoundEvents.ENTITY_WOLF_AMBIENT;
        }
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_WOLF_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 8.0F);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else
        {
            if (this.aiSit != null)
            {
                this.aiSit.setSitting(false);
            }

            return super.attackEntityFrom(source, amount);
        }
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_OCELOT;
    }

    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (this.isTamed())
        {
            if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack))
            {
                this.aiSit.setSitting(!this.isSitting());
            }
        }
        else if ((this.aiTempt == null || this.aiTempt.isRunning()) && itemstack.getItem() == Items.FISH && player.getDistanceSqToEntity(this) < 9.0D)
        {
            if (!player.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            if (!this.world.isRemote)
            {
                if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player))
                {
                    this.setTamedBy(player);
                    this.setTameSkin(1 + this.world.rand.nextInt(3));
                    this.playTameEffect(true);
                    this.aiSit.setSitting(true);
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(player, hand);
    }

    public EntityPampasFox createChild(EntityAgeable ageable)
    {
        EntityPampasFox entityocelot = new EntityPampasFox(this.world);

        if (this.isTamed())
        {
            entityocelot.setOwnerId(this.getOwnerId());
            entityocelot.setTamed(true);
            entityocelot.setTameSkin(this.getTameSkin());
        }

        return entityocelot;
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack stack)
    {
        return stack.getItem() == Items.FISH;
    }

    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        if (otherAnimal == this)
        {
            return false;
        }
        else if (!this.isTamed())
        {
            return false;
        }
        else if (!(otherAnimal instanceof EntityPampasFox))
        {
            return false;
        }
        else
        {
            EntityPampasFox entityocelot = (EntityPampasFox)otherAnimal;

            if (!entityocelot.isTamed())
            {
                return false;
            }
            else
            {
                return this.isInLove() && entityocelot.isInLove();
            }
        }
    }

    public int getTameSkin()
    {
        return ((Integer)this.dataManager.get(OCELOT_VARIANT)).intValue();
    }

    public void setTameSkin(int skinId)
    {
        this.dataManager.set(OCELOT_VARIANT, Integer.valueOf(skinId));
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.world.rand.nextInt(3) != 0;
    }

    /**
     * Checks that the entity is not colliding with any blocks / liquids
     */
    public boolean isNotColliding()
    {
        if (this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this) && this.world.getCollisionBoxes(this, this.getEntityBoundingBox()).isEmpty() && !this.world.containsAnyLiquid(this.getEntityBoundingBox()))
        {
            BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);

            if (blockpos.getY() < this.world.getSeaLevel())
            {
                return false;
            }

            IBlockState iblockstate = this.world.getBlockState(blockpos.down());
            Block block = iblockstate.getBlock();

            if (block == Blocks.GRASS || block.isLeaves(iblockstate, this.world, blockpos.down()))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Get the name of this object. For players this returns their username
     */
    public String getName()
    {
        if (this.hasCustomName())
        {
            return this.getCustomNameTag();
        }
        else
        {
            return this.isTamed() ? I18n.translateToLocal("entity.Cat.name") : super.getName();
        }
    }

    protected void setupTamedAI()
    {
        if (this.avoidEntity == null)
        {
            this.avoidEntity = new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 16.0F, 0.8D, 1.33D);
        }

        this.tasks.removeTask(this.avoidEntity);

        if (!this.isTamed())
        {
            this.tasks.addTask(4, this.avoidEntity);
        }
    }

    /**
     * Called only once on an entity when first time spawned, via egg, mob spawner, natural spawning etc, but not called
     * when entity is reloaded from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        livingdata = super.onInitialSpawn(difficulty, livingdata);

        if (this.getTameSkin() == 0 && this.world.rand.nextInt(7) == 0)
        {
            for (int i = 0; i < 2; ++i)
            {
                EntityPampasFox entityocelot = new EntityPampasFox(this.world);
                entityocelot.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
                entityocelot.setGrowingAge(-24000);
                this.world.spawnEntity(entityocelot);
            }
        }

        return livingdata;
    }

	public float getGallopTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	public class EntityAIAvoidEntity<T extends Entity> extends EntityAIBase
	{
	    private final Predicate<Entity> canBeSeenSelector;
	    /** The entity we are attached to */
	    protected EntityCreature entity;
	    private final double farSpeed;
	    private final double nearSpeed;
	    protected T closestLivingEntity;
	    private final float avoidDistance;
	    /** The PathEntity of our entity */
	    private Path entityPathEntity;
	    /** The PathNavigate of our entity */
	    private final PathNavigate entityPathNavigate;
	    /** Class of entity this behavior seeks to avoid */
	    private final Class<T> classToAvoid;
	    private final Predicate <? super T > avoidTargetSelector;

	    public EntityAIAvoidEntity(EntityCreature entityIn, Class<T> classToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn)
	    {
	        this(entityIn, classToAvoidIn, Predicates.alwaysTrue(), avoidDistanceIn, farSpeedIn, nearSpeedIn);
	    }

	    public EntityAIAvoidEntity(EntityCreature entityIn, Class<T> classToAvoidIn, Predicate <? super T > avoidTargetSelectorIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn)
	    {
	        this.canBeSeenSelector = new Predicate<Entity>()
	        {
	            public boolean apply(@Nullable Entity p_apply_1_)
	            {
	                return p_apply_1_.isEntityAlive() && EntityAIAvoidEntity.this.entity.getEntitySenses().canSee(p_apply_1_) && !EntityAIAvoidEntity.this.entity.isOnSameTeam(p_apply_1_);
	            }
	        };
	        this.entity = entityIn;
	        this.classToAvoid = classToAvoidIn;
	        this.avoidTargetSelector = avoidTargetSelectorIn;
	        this.avoidDistance = avoidDistanceIn;
	        this.farSpeed = farSpeedIn;
	        this.nearSpeed = nearSpeedIn;
	        this.entityPathNavigate = entityIn.getNavigator();
	        this.setMutexBits(1);
	    }

	    /**
	     * Returns whether the EntityAIBase should begin execution.
	     */
	    public boolean shouldExecute()
	    {
	        List<T> list = this.entity.world.<T>getEntitiesWithinAABB(this.classToAvoid, this.entity.getEntityBoundingBox().grow((double)this.avoidDistance, 3.0D, (double)this.avoidDistance), Predicates.and(EntitySelectors.CAN_AI_TARGET, this.canBeSeenSelector, this.avoidTargetSelector));

	        if (list.isEmpty())
	        {
	            return false;
	        }
	        else
	        {
	            this.closestLivingEntity = list.get(0);
	            Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, 16, 7, new Vec3d(this.closestLivingEntity.posX, this.closestLivingEntity.posY, this.closestLivingEntity.posZ));

	            if (vec3d == null)
	            {
	                return false;
	            }
	            else if (this.closestLivingEntity.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < this.closestLivingEntity.getDistanceSqToEntity(this.entity))
	            {
	                return false;
	            }
	            else
	            {
	                this.entityPathEntity = this.entityPathNavigate.getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);
	                return this.entityPathEntity != null;
	            }
	        }
	    }

	    /**
	     * Returns whether an in-progress EntityAIBase should continue executing
	     */
	    public boolean shouldContinueExecuting()
	    {
	        return !this.entityPathNavigate.noPath();
	    }

	    /**
	     * Execute a one shot task or start executing a continuous task
	     */
	    public void startExecuting()
	    {
	        this.entityPathNavigate.setPath(this.entityPathEntity, this.farSpeed);
	    }

	    /**
	     * Reset the task's internal state. Called when this task is interrupted by another one
	     */
	    public void resetTask()
	    {
	        this.closestLivingEntity = null;
	    }

	    /**
	     * Keep ticking a continuous task that has already been started
	     */
	    public void updateTask()
	    {
	        if (this.entity.getDistanceSqToEntity(this.closestLivingEntity) < 49.0D)
	        {
	            this.entity.getNavigator().setSpeed(this.nearSpeed);
	        }
	        else
	        {
	            this.entity.getNavigator().setSpeed(this.farSpeed);
	        }
	    }
	}
	public class EntityAIPanic extends EntityAIBase
	{
	    protected final EntityCreature creature;
	    protected double speed;
	    protected double randPosX;
	    protected double randPosY;
	    protected double randPosZ;

	    public EntityAIPanic(EntityCreature creature, double speedIn)
	    {
	        this.creature = creature;
	        this.speed = speedIn;
	        this.setMutexBits(1);
	    }

	    /**
	     * Returns whether the EntityAIBase should begin execution.
	     */
	    public boolean shouldExecute()
	    {
	        if (this.creature.getRevengeTarget() == null && !this.creature.isBurning())
	        {
	            return false;
	        }
	        else
	        {
	            if (this.creature.isBurning())
	            {
	                BlockPos blockpos = this.getRandPos(this.creature.world, this.creature, 5, 4);

	                if (blockpos != null)
	                {
	                    this.randPosX = (double)blockpos.getX();
	                    this.randPosY = (double)blockpos.getY();
	                    this.randPosZ = (double)blockpos.getZ();
	                    return true;
	                }
	            }

	            return this.findRandomPosition();
	        }
	    }

	    protected boolean findRandomPosition()
	    {
	        Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.creature, 5, 4);

	        if (vec3d == null)
	        {
	            return false;
	        }
	        else
	        {
	            this.randPosX = vec3d.x;
	            this.randPosY = vec3d.y;
	            this.randPosZ = vec3d.z;
	            return true;
	        }
	    }

	    /**
	     * Execute a one shot task or start executing a continuous task
	     */
	    public void startExecuting()
	    {
	        this.creature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
	    }

	    /**
	     * Returns whether an in-progress EntityAIBase should continue executing
	     */
	    public boolean shouldContinueExecuting()
	    {
	        return !this.creature.getNavigator().noPath();
	    }

	    @Nullable
	    private BlockPos getRandPos(World worldIn, Entity entityIn, int horizontalRange, int verticalRange)
	    {
	        BlockPos blockpos = new BlockPos(entityIn);
	        int i = blockpos.getX();
	        int j = blockpos.getY();
	        int k = blockpos.getZ();
	        float f = (float)(horizontalRange * horizontalRange * verticalRange * 2);
	        BlockPos blockpos1 = null;
	        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

	        for (int l = i - horizontalRange; l <= i + horizontalRange; ++l)
	        {
	            for (int i1 = j - verticalRange; i1 <= j + verticalRange; ++i1)
	            {
	                for (int j1 = k - horizontalRange; j1 <= k + horizontalRange; ++j1)
	                {
	                    blockpos$mutableblockpos.setPos(l, i1, j1);
	                    IBlockState iblockstate = worldIn.getBlockState(blockpos$mutableblockpos);

	                    if (iblockstate.getMaterial() == Material.WATER)
	                    {
	                        float f1 = (float)((l - i) * (l - i) + (i1 - j) * (i1 - j) + (j1 - k) * (j1 - k));

	                        if (f1 < f)
	                        {
	                            f = f1;
	                            blockpos1 = new BlockPos(blockpos$mutableblockpos);
	                        }
	                    }
	                }
	            }
	        }

	        return blockpos1;
	    }
	}
}