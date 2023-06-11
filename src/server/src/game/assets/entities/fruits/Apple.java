package game.assets.entities.fruits;

public final class Apple extends Fruit {

    public Apple(Integer id, Integer score) {
        super(id, score, APPLE_RECT, FRUIT_APPLE_SPRITE);
    }

    public Apple(Integer id, Integer score, Integer x, Integer y) {
        super(id, score, new Integer[]{x, y, APPLE_RECT[2], APPLE_RECT[3]}, FRUIT_APPLE_SPRITE);
    }
}
