package game.assets.entities;

import game.assets.Asset;

public abstract class Entity extends Asset {

    protected String state;

    protected Integer score;

    public Entity(Integer posX, Integer posY, Integer score, String sprite, String state) {
        super(posX, posY, sprite);
        this.state = state;
        this.score = score;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
