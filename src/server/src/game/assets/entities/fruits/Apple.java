package game.assets.entities.fruits;

public final class Apple extends Fruit {

    public Apple(Integer score) {
        super(score, APPLE_RECT, FRUIT_APPLE_SPRITE);
    }

    public Apple(Integer score, Integer x, Integer y) {
        super(score, new Integer[]{x, y, APPLE_RECT[2], APPLE_RECT[3]}, FRUIT_APPLE_SPRITE);
    }
}
