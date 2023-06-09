package game.fruits;

import game.global.DataTypes.FruitState;

public abstract class Fruit {

    private final String name;

    private String state;

    private Integer score;

    private Integer[] position;

    public Fruit(String name, Integer score, Integer posX, Integer posY) {
        this.name = name;
        this.score = score;
        this.position = new Integer[]{posX, posY};
        this.state = String.valueOf(FruitState.HANGING);
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setState(FruitState state) {
        this.state = String.valueOf(state);
    }

    public FruitState getStateAsFruitState() {
        return FruitState.valueOf(this.state);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer[] getPosition() {
        return position;
    }

    public void setPosition(Integer posX, Integer posY) {
        this.position[0] = posX;
        this.position[1] = posY;
    }
}
