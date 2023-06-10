package game.assets.entities.fruits;

import game.assets.entities.Entity;


public abstract class Fruit extends Entity {

    private static Integer fruitsGenerated = 0;

    public Fruit(Integer score, Integer[] rect, String sprite) {
        super(++fruitsGenerated, score, rect, sprite);
    }

    public void setStateAsString(String state) {
        this.state = FruitState.valueOf(state);
    }

    public void fall() {
        while (this.rectY < GAME_WINDOW_SIZE[1]) {
            setPosition(this.rectX, this.rectY + FRUIT_FALL_SPEED);
        }
    }
}
