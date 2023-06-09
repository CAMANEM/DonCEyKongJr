package game.assets.entities.snapjaws;

public final class FallingSnapjaw extends Snapjaw {

    public FallingSnapjaw(Integer posX, Integer posY, Integer score) {
        super(posX, posY, score, SNAPJAW_FALLING_IDLE_SPRITE);
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> setPosition(this.position[0], this.position[1] - this.speed);
            case DOWN -> setPosition(this.position[0], this.position[1] + this.speed);
        }
    }
}
