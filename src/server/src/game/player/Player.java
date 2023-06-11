package game.player;

import utils.Constants;

import java.util.List;

public final class Player {

    private String username;
    private Integer health;
    private Integer score;
    private Integer level;
    private Boolean playing;

    public Player(String username) {
        this.username = username;
        this.health = Constants.PLAYER_HEALTH_MIN;
        this.score = 0;
        this.level = 1;
        this.playing = false;
    }

    public Integer getId(List<Player> players) {
        return players.indexOf(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
