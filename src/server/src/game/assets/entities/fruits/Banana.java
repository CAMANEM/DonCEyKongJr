package game.assets.entities.fruits;

public final class Banana extends Fruit {

    public Banana(Integer id, Integer score) {
        super(id, score, BANANA_RECT, FRUIT_BANANA_SPRITE);
    }

    public Banana(Integer id, Integer score, Integer x, Integer y) {
        super(id, score, new Integer[]{x, y, BANANA_RECT[2], BANANA_RECT[3]}, FRUIT_BANANA_SPRITE);
    }
}
