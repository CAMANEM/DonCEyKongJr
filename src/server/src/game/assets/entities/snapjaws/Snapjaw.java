package game.assets.entities.snapjaws;

import game.assets.entities.Entity;

public abstract class Snapjaw extends Entity {

    protected Integer speed;

    public Snapjaw(Integer id, Integer score, Integer[] rect, String sprite) {
        super(id, score, rect, sprite);
        this.speed = SNAPJAW_SPEED_MIN;
    }

    public void setStateAsString(String state) {
        this.state = SnapjawState.valueOf(state);
    }

    public void speedUp(Integer level) {
        this.speed = (this.speed * level);
    }

    public abstract void move(Direction direction);
}
