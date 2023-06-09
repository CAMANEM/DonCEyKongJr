package game.assets.entities.fruits;

public final class Orange extends Fruit {

    public Orange(Integer score, Integer posX, Integer posY) {
        super(Orange.class.getSimpleName(), posX, posY, score);
        this.sprite = FRUIT_ORANGE_SPRITE;
    }
}
