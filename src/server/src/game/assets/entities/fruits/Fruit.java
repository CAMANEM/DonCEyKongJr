package game.assets.entities.fruits;

import game.assets.entities.Entity;


public abstract class Fruit extends Entity {

    public Fruit(Integer posX, Integer posY, Integer score, String sprite) {
        super(posX, posY, score, sprite);
    }

    public FruitState getStateAsFruitState() {
        return FruitState.valueOf(this.state);
    }

    public void setStateAsFruitState(FruitState state) {
        this.state = String.valueOf(state);
    }

    public void fall() {
        setPosition(this.position[0], this.position[1] + FRUIT_FALL_SPEED);
    }
}
