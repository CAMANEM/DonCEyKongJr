package game.assets.entities.snapjaws;

import game.assets.entities.Entity;

public abstract class Snapjaw extends Entity {

    private static Integer snapjawsGenerated = 0;

    protected Integer speed;

    public Snapjaw(Integer score, Integer[] rect, String sprite) {
        super(++snapjawsGenerated, score, rect, sprite);
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
