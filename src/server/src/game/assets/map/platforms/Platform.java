package game.assets.map.platforms;

import game.assets.Asset;

public abstract class Platform extends Asset {

    private static Integer platformsGenerated = 0;

    public Platform(Integer[] rect, String sprite) {
        super(++platformsGenerated, rect, sprite);
    }
}
