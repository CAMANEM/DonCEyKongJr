package game.global;

public interface DataTypes {

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum JuniorState {
        IDLE,
        JUMPING_LEFT,
        JUMPING_RIGHT,
        RUNNING_LEFT,
        RUNNING_RIGHT,
        HANGING,
        HANGING_LEFT,
        HANGING_RIGHT
    }

    enum FruitState {
        IDLE,
        EATEN,
        FALLING
    }

    enum SnapjawState {
        IDLE,
        CHASING
    }

}
