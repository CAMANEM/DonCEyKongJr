package game.assets.map.platforms;

import game.assets.map.Map;
import game.assets.map.MapAbstractFactory;

public final class PlatformFactory extends MapAbstractFactory {

    @Override
    public Map getMap(String asset) {
        switch (asset) {
            case "Land" -> {
                return new Land();
            }
            case "Trunk" -> {
                return new Trunk();
            }
        }
        return null;
    }
}
