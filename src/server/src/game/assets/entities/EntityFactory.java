package game.assets.entities;

import game.assets.entities.fruits.Apple;
import game.assets.entities.fruits.Banana;
import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.Orange;
import game.assets.entities.snapjaws.FallingSnapjaw;
import game.assets.entities.snapjaws.HangingSnapjaw;
import game.assets.entities.snapjaws.Snapjaw;
import utils.DataTypes;

public class EntityFactory {
    public Entity getEntity(DataTypes.Entity entity, Integer score) {
        switch (entity) {
            case APPLE -> {
                return new Apple(score);
            }
            case BANANA -> {
                return new Banana(score);
            }
            case ORANGE -> {
                return new Orange(score);
            }
            case FALLINGSNAPJAW -> {
                return new FallingSnapjaw(score);
            }
            case HANGINGSNAPJAW -> {
                return new HangingSnapjaw(score);
            }
        }
        return null;
    }

    public Fruit getFruit(DataTypes.Entity entity, Integer score) {
        switch (entity) {
            case APPLE -> {
                return new Apple(score);
            }
            case BANANA -> {
                return new Banana(score);
            }
            case ORANGE -> {
                return new Orange(score);
            }
        }
        return null;
    }

    public Snapjaw getSnapjaw(DataTypes.Entity entity, Integer score) {
        switch (entity) {
            case FALLINGSNAPJAW -> {
                return new FallingSnapjaw(score);
            }
            case HANGINGSNAPJAW -> {
                return new HangingSnapjaw(score);
            }
        }
        return null;
    }
}
