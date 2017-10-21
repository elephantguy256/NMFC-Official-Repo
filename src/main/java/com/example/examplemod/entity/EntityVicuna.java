package com.example.examplemod.entity;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
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
import javax.annotation.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.List;
import java.util.Random;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityVicuna extends EntityAnimal
{
    public class AIEatGrass extends EntityAIBase {

		public AIEatGrass(EntityVicuna entityVicuna) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean shouldExecute() {
			// TODO Auto-generated method stub
			return false;
		}

	}





	public EntityVicuna(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 1.4F);
    }

    public static void registerFixesCow(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityVicuna.class);
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.WHEAT, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(8, new EntityVicuna.AIAvoidEntity(this, EntityPlayer.class, 8.0F, 2.2D, 2.2D));
        this.tasks.addTask(8, new EntityVicuna.AIAvoidEntity(this, EntityWolf.class, 10.0F, 2.2D, 2.2D));
        this.tasks.addTask(8, new EntityVicuna.AIAvoidEntity(this, EntityPuma.class, 10.0F, 2.2D, 2.2D));
        this.tasks.addTask(9, new EntityVicuna.AIEatGrass(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
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

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_LLAMA;
    }

   

    public EntityVicuna createChild(EntityAgeable ageable)
    {
        return new EntityVicuna(this.world);
    }

    public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.3F;
    }

    static class AIAvoidEntity<T extends Entity> extends EntityAIAvoidEntity<T>
    {
        private final EntityVicuna vicuna;

        public AIAvoidEntity(EntityVicuna vicuna, Class<T> p_i46403_2_, float p_i46403_3_, double p_i46403_4_, double p_i46403_6_)
        {
            super(vicuna, p_i46403_2_, p_i46403_3_, p_i46403_4_, p_i46403_6_);
            this.vicuna = vicuna;
        }
    }

    

    

public class EntityAIPanic extends EntityAIBase
{
    protected final EntityVicuna creature;
    protected double speed;
    protected double randPosX;
    protected double randPosY;
    protected double randPosZ;

    public EntityAIPanic(EntityVicuna creature, double speedIn)
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
    

public class EntityAIMate extends EntityAIBase
{
    private final EntityAnimal animal;
    private final Class <? extends EntityAnimal > mateClass;
    World world;
    private EntityAnimal targetMate;
    /** Delay preventing a baby from spawning immediately when two mate-able animals find each other. */
    int spawnBabyDelay;
    /** The speed the creature moves at during mating behavior. */
    double moveSpeed;

    public EntityAIMate(EntityAnimal animal, double speedIn)
    {
        this(animal, speedIn, animal.getClass());
    }

    public EntityAIMate(EntityAnimal p_i47306_1_, double p_i47306_2_, Class <? extends EntityAnimal > p_i47306_4_)
    {
        this.animal = p_i47306_1_;
        this.world = p_i47306_1_.world;
        this.mateClass = p_i47306_4_;
        this.moveSpeed = p_i47306_2_;
        this.setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.animal.isInLove())
        {
            return false;
        }
        else
        {
            this.targetMate = this.getNearbyMate();
            return this.targetMate != null;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return this.targetMate.isEntityAlive() && this.targetMate.isInLove() && this.spawnBabyDelay < 60;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask()
    {
        this.targetMate = null;
        this.spawnBabyDelay = 0;
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask()
    {
        this.animal.getLookHelper().setLookPositionWithEntity(this.targetMate, 10.0F, (float)this.animal.getVerticalFaceSpeed());
        this.animal.getNavigator().tryMoveToEntityLiving(this.targetMate, this.moveSpeed);
        ++this.spawnBabyDelay;

        if (this.spawnBabyDelay >= 60 && this.animal.getDistanceSqToEntity(this.targetMate) < 9.0D)
        {
            this.spawnBaby();
        }
    }

    /**
     * Loops through nearby animals and finds another animal of the same type that can be mated with. Returns the first
     * valid mate found.
     */
    private EntityAnimal getNearbyMate()
    {
        List<EntityAnimal> list = this.world.<EntityAnimal>getEntitiesWithinAABB(this.mateClass, this.animal.getEntityBoundingBox().grow(8.0D));
        double d0 = Double.MAX_VALUE;
        EntityAnimal entityanimal = null;

        for (EntityAnimal entityanimal1 : list)
        {
            if (this.animal.canMateWith(entityanimal1) && this.animal.getDistanceSqToEntity(entityanimal1) < d0)
            {
                entityanimal = entityanimal1;
                d0 = this.animal.getDistanceSqToEntity(entityanimal1);
            }
        }

        return entityanimal;
    }

    /**
     * Spawns a baby animal of the same type.
     */
    private void spawnBaby()
    {
        EntityAgeable entityageable = this.animal.createChild(this.targetMate);

        final net.minecraftforge.event.entity.living.BabyEntitySpawnEvent event = new net.minecraftforge.event.entity.living.BabyEntitySpawnEvent(animal, targetMate, entityageable);
        final boolean cancelled = net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
        entityageable = event.getChild();
        if (cancelled) {
            //Reset the "inLove" state for the animals
            this.animal.setGrowingAge(6000);
            this.targetMate.setGrowingAge(6000);
            this.animal.resetInLove();
            this.targetMate.resetInLove();
            return;
        }

        if (entityageable != null)
        {
            EntityPlayerMP entityplayermp = this.animal.getLoveCause();

            if (entityplayermp == null && this.targetMate.getLoveCause() != null)
            {
                entityplayermp = this.targetMate.getLoveCause();
            }

            if (entityplayermp != null)
            {
                entityplayermp.addStat(StatList.ANIMALS_BRED);
                CriteriaTriggers.BRED_ANIMALS.trigger(entityplayermp, this.animal, this.targetMate, entityageable);
            }

            this.animal.setGrowingAge(6000);
            this.targetMate.setGrowingAge(6000);
            this.animal.resetInLove();
            this.targetMate.resetInLove();
            entityageable.setGrowingAge(-24000);
            entityageable.setLocationAndAngles(this.animal.posX, this.animal.posY, this.animal.posZ, 0.0F, 0.0F);
            this.world.spawnEntity(entityageable);
            Random random = this.animal.getRNG();

            for (int i = 0; i < 7; ++i)
            {
                double d0 = random.nextGaussian() * 0.02D;
                double d1 = random.nextGaussian() * 0.02D;
                double d2 = random.nextGaussian() * 0.02D;
                double d3 = random.nextDouble() * (double)this.animal.width * 2.0D - (double)this.animal.width;
                double d4 = 0.5D + random.nextDouble() * (double)this.animal.height;
                double d5 = random.nextDouble() * (double)this.animal.width * 2.0D - (double)this.animal.width;
                this.world.spawnParticle(EnumParticleTypes.HEART, this.animal.posX + d3, this.animal.posY + d4, this.animal.posZ + d5, d0, d1, d2);
            }

            if (this.world.getGameRules().getBoolean("doMobLoot"))
            {
                this.world.spawnEntity(new EntityXPOrb(this.world, this.animal.posX, this.animal.posY, this.animal.posZ, random.nextInt(7) + 1));
            }
        }
    }

public class EntityAIWander extends EntityAIBase
{
    protected final EntityCreature entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;

    public EntityAIWander(EntityCreature creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120);
    }

    public EntityAIWander(EntityCreature creatureIn, double speedIn, int chance)
    {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.mustUpdate)
        {
            if (this.entity.getIdleTime() >= 100)
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0)
            {
                return false;
            }
        }

        Vec3d vec3d = this.getPosition();

        if (vec3d == null)
        {
            return false;
        }
        else
        {
            this.x = vec3d.x;
            this.y = vec3d.y;
            this.z = vec3d.z;
            this.mustUpdate = false;
            return true;
        }
    }

    @Nullable
    protected Vec3d getPosition()
    {
        return RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
    }

    /**
     * Makes task to bypass chance
     */
    public void makeUpdate()
    {
        this.mustUpdate = true;
    }

    /**
     * Changes task random possibility for execution
     */
    public void setExecutionChance(int newchance)
    {
        this.executionChance = newchance;
    }
    public class EntityAIEatGrass extends EntityAIBase
    {
        private final Predicate<IBlockState> IS_TALL_GRASS = BlockStateMatcher.forBlock(Blocks.TALLGRASS).where(BlockTallGrass.TYPE, Predicates.equalTo(BlockTallGrass.EnumType.GRASS));
        /** The entity owner of this AITask */
        private final EntityLiving grassEaterEntity;
        /** The world the grass eater entity is eating from */
        private final World entityWorld;
        /** Number of ticks since the entity started to eat grass */
        int eatingGrassTimer;

        public EntityAIEatGrass(EntityLiving grassEaterEntityIn)
        {
            this.grassEaterEntity = grassEaterEntityIn;
            this.entityWorld = grassEaterEntityIn.world;
            this.setMutexBits(7);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            if (this.grassEaterEntity.getRNG().nextInt(this.grassEaterEntity.isChild() ? 50 : 1000) != 0)
            {
                return false;
            }
            else
            {
                BlockPos blockpos = new BlockPos(this.grassEaterEntity.posX, this.grassEaterEntity.posY, this.grassEaterEntity.posZ);

                if (IS_TALL_GRASS.apply(this.entityWorld.getBlockState(blockpos)))
                {
                    return true;
                }
                else
                {
                    return this.entityWorld.getBlockState(blockpos.down()).getBlock() == Blocks.GRASS;
                }
            }
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void startExecuting()
        {
            this.eatingGrassTimer = 40;
            this.entityWorld.setEntityState(this.grassEaterEntity, (byte)10);
            this.grassEaterEntity.getNavigator().clearPathEntity();
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void resetTask()
        {
            this.eatingGrassTimer = 0;
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting()
        {
            return this.eatingGrassTimer > 0;
        }

        /**
         * Number of ticks since the entity started to eat grass
         */
        public int getEatingGrassTimer()
        {
            return this.eatingGrassTimer;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void updateTask()
        {
            this.eatingGrassTimer = Math.max(0, this.eatingGrassTimer - 1);

            if (this.eatingGrassTimer == 4)
            {
                BlockPos blockpos = new BlockPos(this.grassEaterEntity.posX, this.grassEaterEntity.posY, this.grassEaterEntity.posZ);

                if (IS_TALL_GRASS.apply(this.entityWorld.getBlockState(blockpos)))
                {
                    if (this.entityWorld.getGameRules().getBoolean("mobGriefing"))
                    {
                        this.entityWorld.destroyBlock(blockpos, false);
                    }

                    this.grassEaterEntity.eatGrassBonus();
                }
                else
                {
                    BlockPos blockpos1 = blockpos.down();

                    if (this.entityWorld.getBlockState(blockpos1).getBlock() == Blocks.GRASS)
                    {
                        if (this.entityWorld.getGameRules().getBoolean("mobGriefing"))
                        {
                            this.entityWorld.playEvent(2001, blockpos1, Block.getIdFromBlock(Blocks.GRASS));
                            this.entityWorld.setBlockState(blockpos1, Blocks.DIRT.getDefaultState(), 2);
                        }

                        this.grassEaterEntity.eatGrassBonus();
                    }
                }
            }
        }
    }
}
}
}
}
