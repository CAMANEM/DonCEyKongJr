package game.assets.entities.snapjaws;

public final class HangingSnapjaw extends Snapjaw {

    public HangingSnapjaw(Integer posX, Integer posY, Integer score) {
        super(posX, posY, score, SNAPJAW_HANGING_RIGHT_SPRITE);
    }

    @Override
    public void move(Direction direction) {
        switch (direction) {
            case UP -> {
                setSprite(SNAPJAW_HANGING_UP_SPRITE);
                setPosition(this.position[0], this.position[1] - this.speed);
            }
            case DOWN -> {
                setSprite(SNAPJAW_HANGING_DOWN_SPRITE);
                setPosition(this.position[0], this.position[1] + this.speed);
            }
            case LEFT -> {
                setSprite(SNAPJAW_HANGING_LEFT_SPRITE);
                setPosition(this.position[0] - this.speed, this.position[1]);
            }
            case RIGHT -> {
                setSprite(SNAPJAW_HANGING_RIGHT_SPRITE);
                setPosition(this.position[0] + this.speed, this.position[1]);
            }
        }
    }
}
