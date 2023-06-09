package game.assets.entities;

import game.assets.Asset;

public abstract class Entity extends Asset {

    protected String state;

    protected Integer score;

    public Entity(String id, Integer posX, Integer posY, String state, Integer score) {
        super(id, posX, posY);
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
