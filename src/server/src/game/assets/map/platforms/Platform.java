package game.assets.map.platforms;

import game.assets.Asset;
import game.assets.map.Map;

public abstract class Platform extends Asset implements Map {

    private static Integer platformsGenerated = 0;

    public Platform(Integer[] rect, String sprite) {
        super(++platformsGenerated, rect, sprite);
    }
}
