package game.assets.entities.snapjaws;

public final class FallingSnapjaw extends Snapjaw {

    public FallingSnapjaw(Integer score, Integer posX, Integer posY) {
        super(FallingSnapjaw.class.getSimpleName(), posX, posY, score);
        this.sprite = SNAPJAW_FALLING_SPRITE;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> setPosition(this.position[0], this.position[1] - this.speed);
            case DOWN -> setPosition(this.position[0], this.position[1] + this.speed);
        }
    }
}
