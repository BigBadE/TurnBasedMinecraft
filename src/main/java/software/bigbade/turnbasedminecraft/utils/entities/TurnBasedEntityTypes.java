package software.bigbade.turnbasedminecraft.utils.entities;

import net.minecraft.server.v1_15_R1.EntityTypes;
import software.bigbade.turnbasedminecraft.entities.TurnBasedZombie;

public enum TurnBasedEntityTypes {
    ZOMBIE(EntityManager.createEntityType("zombie", TurnBasedZombie::new, 0.6F, 1.95F));

    private EntityTypes<?> type;

    TurnBasedEntityTypes(EntityTypes<?> type) {
        this.type = type;
    }

    public EntityTypes<?> getType() {
        return type;
    }
}
