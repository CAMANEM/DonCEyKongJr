package game.assets.entities.fruits;

import game.assets.entities.Entity;
import game.assets.entities.EntityAbstractFactory;

public final class FruitFactory extends EntityAbstractFactory {

    @Override
    public Entity getEntity(String entity, Integer score) {
        switch (entity) {
            case "Apple" -> {
                return new Apple(score);
            }
            case "Banana" -> {
                return new Banana(score);
            }
            case "Orange" -> {
                return new Orange(score);
            }
        }
        return null;
    }
}
