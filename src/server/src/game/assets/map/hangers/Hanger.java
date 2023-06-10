package game.assets.map.hangers;

import game.assets.Asset;

public abstract class Hanger extends Asset {

    private static Integer hangersGenerated = 0;

    public Hanger(Integer[] rect, String sprite) {
        super(++hangersGenerated, rect, sprite);
    }
}
