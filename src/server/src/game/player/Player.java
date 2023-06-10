package game.player;

import game.assets.entities.fruits.Fruit;
import game.assets.junior.Junior;
import game.play.Play;
import utils.Constants;
import utils.DataTypes;

public final class Player {

    private static Integer playersGenerated = 0;

    private Integer id;
    private Integer health;
    private Integer score;
    private Integer level;
    private Boolean playing;
    private Junior junior;
    private Play play;


    public Player() {
        this.id = ++playersGenerated;
        this.health = Constants.PLAYER_HEALTH_MIN;
        this.score = 0;
        this.level = 1;
        this.playing = false;
        this.junior = new Junior(Constants.JUNIOR_RECT);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Junior getJunior() {
        return junior;
    }

    public void setJunior(Junior junior) {
        this.junior = junior;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getPlaying() {
        return playing;
    }

    public void setPlaying(Boolean playing) {
        this.playing = playing;
    }

    public void eatFruit(Fruit fruit) {
        fruit.setVisible(false);
        fruit.setState(DataTypes.FruitState.EATEN);
        this.score += fruit.getScore();
    }

    public void dropFruit(Fruit fruit) {
        fruit.setState(DataTypes.FruitState.FALLING);
        fruit.fall();
    }
}
