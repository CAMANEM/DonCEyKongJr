package game.assets.map.hangers;

import game.assets.Asset;
import game.assets.map.Map;

public abstract class Hanger extends Asset implements Map {

    private static Integer hangersGenerated = 0;

    public Hanger(Integer[] rect, String sprite) {
        super(++hangersGenerated, rect, sprite);
    }
}
