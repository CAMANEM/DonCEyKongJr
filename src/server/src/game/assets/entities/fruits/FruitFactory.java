package game.assets.entities.fruits;

import utils.Constants;

import java.util.Random;

public final class FruitFactory {

    private Integer applesGenerated = 0;
    private Integer bananasGenerated = 0;
    private Integer orangesGenerated = 0;

    public Fruit generateFruit() {
        Object fruit = Constants.FRUITS.keySet().toArray()[new Random().nextInt(Constants.FRUITS.keySet().toArray().length)];
        switch (fruit.toString()) {
            case "Apple" -> {
                return new Apple(++this.applesGenerated, Constants.FRUITS.get(fruit));
            }
            case "Banana" -> {
                return new Banana(++this.bananasGenerated, Constants.FRUITS.get(fruit));
            }
            case "Orange" -> {
                return new Orange(++this.orangesGenerated, Constants.FRUITS.get(fruit));
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(++this.applesGenerated, Constants.FRUITS.get(fruit));
            }
            case "Banana" -> {
                return new Banana(++this.bananasGenerated, Constants.FRUITS.get(fruit));
            }
            case "Orange" -> {
                return new Orange(++this.orangesGenerated, Constants.FRUITS.get(fruit));
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit, Integer score) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(++this.applesGenerated, score);
            }
            case "Banana" -> {
                return new Banana(++this.bananasGenerated, score);
            }
            case "Orange" -> {
                return new Orange(++this.orangesGenerated, score);
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit, Integer score, Integer x, Integer y) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(++this.applesGenerated, score, x, y);
            }
            case "Banana" -> {
                return new Banana(++this.bananasGenerated, score, x, y);
            }
            case "Orange" -> {
                return new Orange(++this.orangesGenerated, score, x, y);
            }
        }
        return null;
    }
}
