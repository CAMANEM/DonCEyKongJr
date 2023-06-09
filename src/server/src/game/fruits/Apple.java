package game.fruits;

public final class Apple extends Fruit {

    public Apple(Integer score, Integer posX, Integer posY) {
        super(Apple.class.getSimpleName(), score, posX, posY);
    }
}
