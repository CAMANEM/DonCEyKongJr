package game.assets.junior;

import game.assets.Asset;
import game.assets.entities.fruits.Fruit;
import game.player.Player;
import utils.DataTypes;

public final class Junior extends Asset {
    private JuniorState state;

    public Junior(Integer[] rect) {
        super(null, rect, JUNIOR_IDLE_SPRITE);
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
            case DYING -> setSprite(JUNIOR_DYING_SPRITE);
        }
    }

    public void eatFruit(Player player, Fruit fruit) {
        fruit.setVisible(false);
        fruit.setState(DataTypes.FruitState.EATEN);
        player.setScore(player.getScore() + fruit.getScore());
    }

    public void dropFruit(Fruit fruit) {
        fruit.setState(DataTypes.FruitState.FALLING);
        fruit.fall();
    }
}