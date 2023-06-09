package game.assets.entities.snapjaws;

import game.assets.entities.Entity;

public abstract class Snapjaw extends Entity {

    protected Integer speed;

    public Snapjaw(Integer posX, Integer posY, Integer score, String sprite) {
        super(posX, posY, score, sprite);
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
