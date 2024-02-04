package com.boiler.dwarf.boilersmod.entity.custom;

import com.boiler.dwarf.boilersmod.item.ModItems;
import com.boiler.dwarf.boilersmod.entity.ModEntities;
import com.boiler.dwarf.boilersmod.soundregistries.ModSounds;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import org.jetbrains.annotations.Nullable;

public class Trilobite extends AnimalEntity {

    public AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public Trilobite(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();;
        if(this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.3D));
        this.goalSelector.add(2, new TemptGoal(this, 1.1D, Ingredient.ofItems(ModItems.shrimp_chip), false));
        this.goalSelector.add(3, new WanderAroundGoal(this, 1.0D));
        this.goalSelector.add(4, new LookAtEntityGoal(this, CreeperEntity.class, 1.5f));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 1.2f));
        this.goalSelector.add(6, new LookAroundGoal(this));
    }


    public static DefaultAttributeContainer.Builder createTrilobiteAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f)
                .add(EntityAttributes.GENERIC_ARMOR, 5f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0);
    }


    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.TRILOBITE.create(world);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.TRILOBITE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.TRILOBITE_DEATH;
    }
}
