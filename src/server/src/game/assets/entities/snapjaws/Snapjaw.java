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

    public void move(Direction direction) {
        switch (direction) {
            case UP -> setPosition(this.position[0], this.position[1] - this.speed);
            case DOWN -> setPosition(this.position[0], this.position[1] + this.speed);
            case LEFT -> setPosition(this.position[0] - this.speed, this.position[1]);
            case RIGHT -> setPosition(this.position[0] + this.speed, this.position[1]);
        }
    }

    public void speedUp(Integer level) {
        this.speed = (this.speed * level);
    }
}
