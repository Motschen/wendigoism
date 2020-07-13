package moriyashiine.wendigoism.common.entity;

import moriyashiine.wendigoism.WDConfig;
import moriyashiine.wendigoism.common.registry.WDEntityTypes;
import moriyashiine.wendigoism.common.registry.WDItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.entity.mob.WitchEntity;
import net.minecraft.entity.passive.AbstractTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.*;

public class WendigoEntity extends HostileEntity {
	public static final TrackedData<Boolean> ATTACKING = DataTracker.registerData(PlayerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

	public WendigoEntity(World world) {
		super(WDEntityTypes.WENDIGO, world);
	}

	@Override
	protected void initAttributes() {
		super.initAttributes();
		this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(WDConfig.INSTANCE.strongerWendigo ? 120 : 60);
		this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue(WDConfig.INSTANCE.strongerWendigo ? 12 : 6);
		this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.45);
		this.getAttributeInstance(EntityAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.5);
		this.getAttributeInstance(EntityAttributes.FOLLOW_RANGE).setBaseValue(48);
	}
	
	@Override
	protected void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops) {
		super.dropEquipment(source, lootingMultiplier, allowDrops);
		ItemEntity itemEntity = dropItem(WDItems.WENDIGO_HEART);
		if (itemEntity != null) {
			itemEntity.setCovetedItem();
		}
	}
	
	@Override
	public void setTarget(LivingEntity target) {
		super.setTarget(target);
		dataTracker.set(ATTACKING, target != null);
	}
	
	@Override
	public void tick() {
		super.tick();
		if (horizontalCollision && world.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
			Box box = getBoundingBox().expand(0.2);
			for (BlockPos pos : BlockPos.iterate(MathHelper.floor(box.x1), MathHelper.floor(box.y1), MathHelper.floor(box.z1), MathHelper.floor(box.x2), MathHelper.floor(box.y2), MathHelper.floor(box.z2))) {
				if (world.getBlockState(pos).getHardness(world, pos) < 0.5f) {
					world.breakBlock(pos, true);
				}
			}
		}
	}
	
	@Override
	protected void initDataTracker() {
		super.initDataTracker();
		dataTracker.startTracking(ATTACKING, false);
	}
	
	@Override
	protected void initGoals() {
		goalSelector.add(0, new SwimGoal(this));
		goalSelector.add(1, new MeleeAttackGoal(this, 1, true));
		goalSelector.add(2, new WanderAroundFarGoal(this, 1));
		goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8));
		goalSelector.add(3, new LookAroundGoal(this));
		targetSelector.add(0, new RevengeGoal(this));
		targetSelector.add(1, new FollowTargetGoal<>(this, LivingEntity.class, 10, true, false, e -> e instanceof PlayerEntity || e instanceof AbstractTraderEntity || e instanceof IllagerEntity || e instanceof WitchEntity));
	}
}