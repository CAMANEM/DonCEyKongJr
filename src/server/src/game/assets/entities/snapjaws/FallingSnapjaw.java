package game.assets.entities.snapjaws;

public final class FallingSnapjaw extends Snapjaw {

    public FallingSnapjaw(Integer score) {
        super(score, SNAPJAW_RECT, SNAPJAW_FALLING_RIGHT_SPRITE);
    }

    @Override
    public void move(Direction direction) {
        switch (direction) {
            case DOWN -> {
                setSprite(SNAPJAW_FALLING_DOWN_SPRITE);
                setPosition(this.rectX, this.rectY + this.speed);
            }
            case LEFT -> {
                setSprite(SNAPJAW_FALLING_LEFT_SPRITE);
                setPosition(this.rectX - this.speed, this.rectY);
            }
            case RIGHT -> {
                setSprite(SNAPJAW_FALLING_RIGHT_SPRITE);
                setPosition(this.rectX + this.speed, this.rectY);
            }
        }
    }
}
