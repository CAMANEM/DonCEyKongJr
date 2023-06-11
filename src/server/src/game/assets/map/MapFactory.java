package game.assets.map;

import game.assets.map.hangers.Vine;
import game.assets.map.platforms.Land;
import game.assets.map.platforms.Trunk;
import utils.Constants;

public final class MapFactory {

    private Integer vinesGenerated = 0;
    private Integer landsGenerated = 0;
    private Integer trunksGenerated = 0;

    public Vine generateVine() {
        if ((vinesGenerated + 1) <= Constants.VINE_MAX) {
            return new Vine(++this.vinesGenerated);
        }
        return null;
    }

    public Land generateLand() {
        if ((landsGenerated + 1) <= Constants.LAND_MAX) {
            return new Land(++this.landsGenerated);
        }
        return null;
    }

    public Trunk generateTrunk() {
        if ((trunksGenerated + 1) <= Constants.TRUNK_MAX) {
            return new Trunk(++this.trunksGenerated);
        }
        return null;
    }
}
