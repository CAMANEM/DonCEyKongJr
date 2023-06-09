package game.assets.entities.snapjaws;

public final class HangingSnapjaw extends Snapjaw {

    public HangingSnapjaw(Integer posX, Integer posY, Integer score) {
        super(posX, posY, score, SNAPJAW_HANGING_SPRITE);
    }

    public void move() {
        setPosition(this.position[0], this.position[1] + this.speed);
    }
}
