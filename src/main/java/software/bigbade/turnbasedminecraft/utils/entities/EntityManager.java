package software.bigbade.turnbasedminecraft.utils.entities;

import net.minecraft.server.v1_15_R1.EntityTypes;
import net.minecraft.server.v1_15_R1.EnumCreatureType;
import software.bigbade.turnbasedminecraft.utils.ReflectionManager;

public class EntityManager {
    public static EntityTypes<?> createEntityType(String name, EntityTypes.b create, float width, float height) {
        return (EntityTypes<?>) ReflectionManager.callMethod(EntityTypes.class, "a", name, EntityTypes.a.a(create, EnumCreatureType.MONSTER).a(width, height));
    }
}
