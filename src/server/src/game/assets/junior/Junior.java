package game.assets.junior;

import game.assets.Asset;

public final class Junior extends Asset {
    private JuniorState state;

    public Junior(Integer[] rect) {
        super(rect, JUNIOR_IDLE_SPRITE);
        this.state = JuniorState.IDLE;
    }

    public JuniorState getState() {
        return state;
    }

    public void setState(JuniorState state) {
        this.state = state;
    }

    public String getStateAsString() {
        return String.valueOf(this.state);
    }

    public void setStateAsString(String state) {
        this.state = JuniorState.valueOf(state);
    }

    public void move(Direction direction) {
        Integer speed = JUNIOR_NORMAL_SPEED;
        if (this.state == JuniorState.HANGING) {
            speed = JUNIOR_HANGING_SPEED;
        }
        switch (direction) {
            case UP -> setPosition(this.rectX, this.rectY - speed);
            case DOWN -> setPosition(this.rectX, this.rectY + speed);
            case LEFT -> setPosition(this.rectX - speed, this.rectY);
            case RIGHT -> setPosition(this.rectX + speed, this.rectY);
        }
    }

    public void updateSprite() {
        switch (this.state) {
            case IDLE -> setSprite(JUNIOR_IDLE_SPRITE);
            case JUMPING_LEFT -> setSprite(JUNIOR_JUMPING_LEFT_SPRITE);
            case JUMPING_RIGHT -> setSprite(JUNIOR_JUMPING_RIGHT_SPRITE);
            case RUNNING_LEFT -> setSprite(JUNIOR_RUNNING_LEFT_SPRITE);
            case RUNNING_RIGHT -> setSprite(JUNIOR_RUNNING_RIGHT_SPRITE);
            case HANGING -> setSprite(JUNIOR_HANGING_SPRITE);
            case HANGING_LEFT -> setSprite(JUNIOR_HANGING_LEFT_SPRITE);
            case HANGING_RIGHT -> setSprite(JUNIOR_HANGING_RIGHT_SPRITE);
        }
    }
}