package GameTiles.Unit.Enemy;

import GameTiles.GameTile;
import GameTiles.Unit.Unit;

public class Enemy extends Unit {

    public Enemy(String name, Integer health_pool, Integer health_amount, Integer attack_points, Integer defense_points, GameTile gameTile) {
        super(name, health_pool, health_amount, attack_points, defense_points, gameTile);
    }

    @Override
    public String description() {
        return "";
    }
}
