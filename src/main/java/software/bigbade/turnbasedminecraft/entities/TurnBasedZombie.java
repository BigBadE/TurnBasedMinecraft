package software.bigbade.turnbasedminecraft.entities;

import net.minecraft.server.v1_15_R1.EntityTypes;
import net.minecraft.server.v1_15_R1.EntityZombie;
import net.minecraft.server.v1_15_R1.World;

public class TurnBasedZombie extends EntityZombie {
    public TurnBasedZombie(EntityTypes<? extends EntityZombie> entitytypes, World world) {
        super(entitytypes, world);
    }
}
