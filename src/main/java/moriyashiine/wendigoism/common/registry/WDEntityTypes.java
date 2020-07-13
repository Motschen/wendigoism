package moriyashiine.wendigoism.common.registry;

import moriyashiine.wendigoism.Wendigoism;
import moriyashiine.wendigoism.common.entity.WendigoEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributeContainer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class WDEntityTypes {
	public static final Map<EntityType<? extends LivingEntity>, EntityAttributeContainer> ATTRIBUTES = new HashMap<>();
	public static final EntityType WENDIGO = createEntity(WendigoEntity.class, WendigoEntity::new);

	private static EntityType createEntity(Class<? extends Entity> entityClass, Function<? super World, ? extends Entity> entityInstance) {
		String name = "wendigo";
		Identifier id = new Identifier(Wendigoism.MODID, name);
		EntityType entityType = Registry.register(Registry.ENTITY_TYPE, id, net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder.create(EntityCategory.CREATURE, entityInstance).size(EntityDimensions.fixed(1, 2.8F)).trackable(10, 1).build());

		return entityType;
	}
}