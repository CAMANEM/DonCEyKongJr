package game.assets.entities.fruits;

import game.assets.entities.Entity;


public abstract class Fruit extends Entity {

    public Fruit(Integer score, Integer[] rect, String sprite) {
        super(score, rect, sprite);
    }

    public void setStateAsString(String state) {
        this.state = FruitState.valueOf(state);
    }

    public void fall() {
        setPosition(this.rectX, this.rectY + FRUIT_FALL_SPEED);
    }
}
