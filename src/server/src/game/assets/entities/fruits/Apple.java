package game.assets.entities.fruits;

public final class Apple extends Fruit {

    public Apple(Integer score, Integer posX, Integer posY) {
        super(Apple.class.getSimpleName(), posX, posY, score);
        this.sprite = FRUIT_APPLE_SPRITE;
    }
}
