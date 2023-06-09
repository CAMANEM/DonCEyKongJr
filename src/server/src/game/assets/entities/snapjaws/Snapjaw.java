package game.assets.entities.snapjaws;

import game.assets.entities.Entity;
import game.global.Constants;

public abstract class Snapjaw extends Entity {

    protected Integer speed;

    public Snapjaw(String id, Integer posX, Integer posY, Integer score) {
        super(id, posX, posY, String.valueOf(SnapjawState.IDLE), score);
        this.speed = Constants.SNAPJAW_SPEED_MIN;
    }

    public SnapjawState getStateAsSnapjawState() {
        return SnapjawState.valueOf(this.state);
    }

    public void setStateAsSnapjawState(SnapjawState state) {
        this.state = String.valueOf(state);
    }

    public void speedUp(Integer level) {
        this.speed = (this.speed * level);
    }
}
