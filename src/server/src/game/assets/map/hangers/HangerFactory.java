package game.assets.map.hangers;

import game.assets.map.Map;
import game.assets.map.MapAbstractFactory;

public final class HangerFactory extends MapAbstractFactory {

    @Override
    public Map getMap(String asset) {
        switch (asset) {
            case "Vine" -> {
                return new Vine();
            }
        }
        return null;
    }
}
