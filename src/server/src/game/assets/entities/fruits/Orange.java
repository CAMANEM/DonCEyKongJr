package game.assets.entities.fruits;

public final class Orange extends Fruit {

    public Orange(Integer score) {
        super(score, ORANGE_RECT, FRUIT_ORANGE_SPRITE);
    }

    public Orange(Integer score, Integer x, Integer y) {
        super(score, new Integer[]{x, y, ORANGE_RECT[2], ORANGE_RECT[3]}, FRUIT_ORANGE_SPRITE);
    }
}
