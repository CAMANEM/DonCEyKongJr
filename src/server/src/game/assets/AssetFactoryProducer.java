package game.assets;

import game.assets.entities.EntityAbstractFactory;
import game.assets.entities.fruits.FruitFactory;
import game.assets.entities.snapjaws.SnapjawFactory;
import game.assets.map.MapAbstractFactory;
import game.assets.map.hangers.HangerFactory;
import game.assets.map.platforms.PlatformFactory;

public final class AssetFactoryProducer {
    public static EntityAbstractFactory getEntityFactory(String asset) {
        switch (asset) {
            case "Fruit" -> {
                return new FruitFactory();
            }
            case "Snapjaw" -> {
                return new SnapjawFactory();
            }
        }
        return null;
    }

    public static MapAbstractFactory getMapFactory(String asset) {
        switch (asset) {
            case "Hanger" -> {
                return new HangerFactory();
            }
            case "Platform" -> {
                return new PlatformFactory();
            }
        }
        return null;
    }
}
