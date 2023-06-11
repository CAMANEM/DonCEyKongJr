package game.assets.map.hangers;

import game.assets.Asset;
import game.assets.map.Map;

public abstract class Hanger extends Asset implements Map {

    public Hanger(Integer id, Integer[] rect, String sprite) {
        super(id, rect, sprite);
    }
}
