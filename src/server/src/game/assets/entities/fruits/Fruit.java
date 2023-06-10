package game.assets.entities.fruits;

import game.assets.entities.Entity;


public abstract class Fruit extends Entity {

    public Fruit(Integer score, Integer[] rect, String sprite) {
        super(score, rect, sprite);
    }

    public FruitState getStateAsFruitState() {
        return FruitState.valueOf(this.state);
    }

    public void setStateAsFruitState(FruitState state) {
        this.state = String.valueOf(state);
    }

    public void fall() {
        setPosition(this.rectX, this.rectY + FRUIT_FALL_SPEED);
    }
}
