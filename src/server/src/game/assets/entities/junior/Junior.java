package game.assets.entities.junior;

import game.assets.entities.Entity;

public class Junior extends Entity {
    public Junior(Integer posX, Integer posY) {
        super(posX, posY, 0, JUNIOR_IDLE_SPRITE);
    }

    public JuniorState getStateAsJuniorState() {
        return JuniorState.valueOf(this.state);
    }

    public void setStateAsJuniorState(JuniorState state) {
        this.state = String.valueOf(state);
    }

    public void move(Direction direction) {
        Integer speed = JUNIOR_NORMAL_SPEED;
        if (this.state.equals(String.valueOf(JuniorState.HANGING))) {
            speed = JUNIOR_HANGING_SPEED;
        }
        switch (direction) {
            case UP -> setPosition(this.position[0], this.position[1] - speed);
            case DOWN -> setPosition(this.position[0], this.position[1] + speed);
            case LEFT -> setPosition(this.position[0] - speed, this.position[1]);
            case RIGHT -> setPosition(this.position[0] + speed, this.position[1]);
        }
    }

    public void updateSprite() {
        switch (JuniorState.valueOf(this.state)) {
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