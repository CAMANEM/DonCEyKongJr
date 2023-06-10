package game.assets.entities;

import game.assets.Asset;

public abstract class Entity extends Asset {

    protected String state;

    protected Integer score;

    public Entity(Integer score, Integer[] rect, String sprite) {
        super(rect, sprite);
        this.state = NEW_GAME_STATE;
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
