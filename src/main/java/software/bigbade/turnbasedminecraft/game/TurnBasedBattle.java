package software.bigbade.turnbasedminecraft.game;

import org.bukkit.entity.Entity;

import java.util.List;

public class TurnBasedBattle {
    private List<Entity> first;
    private List<Entity> second;

    private BattleState state = BattleState.STARTING;

    public TurnBasedBattle(List<Entity> first, List<Entity> second) {
        this.first = first;
        this.second = second;
    }

    public void start(Entity firstStrike) {
        
    }
}
