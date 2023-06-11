package game.assets.entities.snapjaws;

import game.assets.entities.Entity;
import game.assets.entities.EntityAbstractFactory;

public final class SnapjawFactory extends EntityAbstractFactory {

    @Override
    public Entity getEntity(String entity, Integer score) {
        switch (entity) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(score);
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(score);
            }
        }
        return null;
    }
}
