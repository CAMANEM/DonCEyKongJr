package game.assets.entities.snapjaws;

public final class FallingSnapjaw extends Snapjaw {

    public FallingSnapjaw(Integer posX, Integer posY, Integer score) {
        super(posX, posY, score, SNAPJAW_FALLING_RIGHT_SPRITE);
    }

    @Override
    public void move(Direction direction) {
        switch (direction) {
            case DOWN -> {
                setSprite(SNAPJAW_FALLING_DOWN_SPRITE);
                setPosition(this.position[0], this.position[1] + this.speed);
            }
            case LEFT -> {
                setSprite(SNAPJAW_FALLING_LEFT_SPRITE);
                setPosition(this.position[0] - this.speed, this.position[1]);
            }
            case RIGHT -> {
                setSprite(SNAPJAW_FALLING_RIGHT_SPRITE);
                setPosition(this.position[0] + this.speed, this.position[1]);
            }
        }
    }
}
