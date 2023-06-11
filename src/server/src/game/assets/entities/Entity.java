package game.assets.entities;

import game.assets.Asset;
import utils.DataTypes;

public abstract class Entity extends Asset {

    protected Enum state;

    protected Integer score;

    public Entity(Integer num, Integer score, Integer[] rect, String sprite) {
        super(num, rect, sprite);
        this.state = JuniorState.IDLE;
        this.score = score;
    }

    public Enum getState() {
        return this.state;
    }

    public String getStateAsString() {
        return String.valueOf(this.state);
    }

    public void setState(Enum state) {
        this.state = state;
    }

    public abstract void setStateAsString(String state);

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public DataTypes.Entity getEntityDataType() {
        return DataTypes.Entity.valueOf(this.getClass().getSimpleName().toUpperCase());
    }
}
