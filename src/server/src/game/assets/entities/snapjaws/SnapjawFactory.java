package game.assets.entities.snapjaws;

import utils.Constants;

import java.util.Random;

public final class SnapjawFactory {

    private Integer fallingSnapjawsGenerated = 0;
    private Integer hangingSnapjawsGenerated = 0;

    public Snapjaw generateSnapjaw() {
        Object snapjaw = Constants.SNAPJAWS.keySet().toArray()[new Random().nextInt(Constants.SNAPJAWS.keySet().toArray().length)];
        switch (snapjaw.toString()) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(++this.fallingSnapjawsGenerated, Constants.SNAPJAWS.get(snapjaw));
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(++this.hangingSnapjawsGenerated, Constants.SNAPJAWS.get(snapjaw));
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(++this.fallingSnapjawsGenerated, Constants.SNAPJAWS.get(snapjaw));
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(++this.hangingSnapjawsGenerated, Constants.SNAPJAWS.get(snapjaw));
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw, Integer score) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(++this.fallingSnapjawsGenerated, score);
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(++this.hangingSnapjawsGenerated, score);
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw, Integer score, Integer x, Integer y) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(++this.fallingSnapjawsGenerated, score, x, y);
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(++this.hangingSnapjawsGenerated, score, x, y);
            }
        }
        return null;
    }
}
