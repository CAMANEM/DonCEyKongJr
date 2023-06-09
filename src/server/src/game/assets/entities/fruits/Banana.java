package game.assets.entities.fruits;

public final class Banana extends Fruit {

    public Banana(Integer score, Integer posX, Integer posY) {
        super(Banana.class.getSimpleName(), posX, posY, score);
        this.sprite = FRUIT_BANANA_SPRITE;
    }
}
