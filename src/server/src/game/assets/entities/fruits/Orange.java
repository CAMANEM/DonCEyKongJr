package game.assets.entities.fruits;

public final class Orange extends Fruit {

    public Orange(Integer id, Integer score) {
        super(id, score, ORANGE_RECT, FRUIT_ORANGE_SPRITE);
    }

    public Orange(Integer id, Integer score, Integer x, Integer y) {
        super(id, score, new Integer[]{x, y, ORANGE_RECT[2], ORANGE_RECT[3]}, FRUIT_ORANGE_SPRITE);
    }
}
