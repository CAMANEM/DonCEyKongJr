package game.assets.entities.fruits;

import utils.Constants;

import java.util.Random;

public class FruitFactory {

    public Fruit generateFruit() {
        Object fruit = Constants.FRUITS.keySet().toArray()[new Random().nextInt(Constants.FRUITS.keySet().toArray().length)];
        switch (fruit.toString()) {
            case "Apple" -> {
                return new Apple(Constants.FRUITS.get(fruit));
            }
            case "Banana" -> {
                return new Banana(Constants.FRUITS.get(fruit));
            }
            case "Orange" -> {
                return new Orange(Constants.FRUITS.get(fruit));
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(Constants.FRUITS.get(fruit));
            }
            case "Banana" -> {
                return new Banana(Constants.FRUITS.get(fruit));
            }
            case "Orange" -> {
                return new Orange(Constants.FRUITS.get(fruit));
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit, Integer score) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(score);
            }
            case "Banana" -> {
                return new Banana(score);
            }
            case "Orange" -> {
                return new Orange(score);
            }
        }
        return null;
    }

    public Fruit generateFruit(String fruit, Integer score, Integer x, Integer y) {
        switch (fruit) {
            case "Apple" -> {
                return new Apple(score, x, y);
            }
            case "Banana" -> {
                return new Banana(score, x, y);
            }
            case "Orange" -> {
                return new Orange(score, x, y);
            }
        }
        return null;
    }
}
