package game.assets.entities;

import game.assets.Asset;

public abstract class Entity extends Asset {

    protected String state;

    protected Integer score;

    public Entity(Integer posX, Integer posY, Integer score, String sprite, String state) {
        this.id = this.getClass().getSimpleName();
        this.visible = true;
        this.position = new Integer[]{posX, posY};
        this.sprite = sprite;
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
