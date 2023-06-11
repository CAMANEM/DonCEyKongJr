package game.assets.map.platforms;

import game.assets.Asset;
import game.assets.map.Map;

public abstract class Platform extends Asset implements Map {

    public Platform(Integer id, Integer[] rect, String sprite) {
        super(id, rect, sprite);
    }
}
