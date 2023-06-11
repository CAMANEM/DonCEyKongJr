package game.assets.entities.snapjaws;

public final class HangingSnapjaw extends Snapjaw {

    public HangingSnapjaw(Integer score) {
        super(score, SNAPJAW_RECT, SNAPJAW_HANGING_RIGHT_SPRITE);
    }

    public HangingSnapjaw(Integer score, Integer x, Integer y) {
        super(score, new Integer[]{x, y, SNAPJAW_RECT[2], SNAPJAW_RECT[3]}, SNAPJAW_HANGING_RIGHT_SPRITE);
    }

    @Override
    public void move(Direction direction) {
        switch (direction) {
            case UP -> {
                setSprite(SNAPJAW_HANGING_UP_SPRITE);
                setPosition(this.rectX, this.rectY - this.speed);
            }
            case DOWN -> {
                setSprite(SNAPJAW_HANGING_DOWN_SPRITE);
                setPosition(this.rectX, this.rectY + this.speed);
            }
            case LEFT -> {
                setSprite(SNAPJAW_HANGING_LEFT_SPRITE);
                setPosition(this.rectX - this.speed, this.rectY);
            }
            case RIGHT -> {
                setSprite(SNAPJAW_HANGING_RIGHT_SPRITE);
                setPosition(this.rectX + this.speed, this.rectY);
            }
        }
    }
}
