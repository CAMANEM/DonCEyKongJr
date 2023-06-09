package game.assets.entities.snapjaws;

public final class HangingSnapjaw extends Snapjaw {

    public HangingSnapjaw(Integer score, Integer posX, Integer posY) {
        super(HangingSnapjaw.class.getSimpleName(), posX, posY, score);
        this.sprite = SNAPJAW_HANGING_SPRITE;
    }

    public void move() {
        setPosition(this.position[0], this.position[1] + this.speed);
    }
}
