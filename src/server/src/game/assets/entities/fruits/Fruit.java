package game.assets.entities.fruits;

import game.assets.entities.Entity;


public abstract class Fruit extends Entity {

    public Fruit(String id, Integer posX, Integer posY, Integer score) {
        super(id, posX, posY, String.valueOf(FruitState.HANGING), score);
    }

    public FruitState getStateAsFruitState() {
        return FruitState.valueOf(this.state);
    }

    public void setStateAsFruitState(FruitState state) {
        this.state = String.valueOf(state);
    }
}
