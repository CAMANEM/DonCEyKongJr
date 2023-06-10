package game.player;

import communication.client.Client;
import game.assets.junior.Junior;
import game.play.Play;

public final class Player extends Client {

    private static Integer activePlayers = 0;

    private Integer id;
    private Integer health;
    private Integer score;
    private Integer level;
    private Boolean playing;
    private Junior junior;
    private Play play;


    public Player() {
        super();
        activePlayers++;
        this.id = activePlayers;
        this.health = PLAYER_HEALTH_MIN;
        this.score = 0;
        this.level = 1;
        this.playing = false;
        this.junior = new Junior(JUNIOR_RECT);
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
}
