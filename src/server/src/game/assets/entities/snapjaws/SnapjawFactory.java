package game.assets.entities.snapjaws;

import utils.Constants;

import java.util.Random;

public class SnapjawFactory {

    public Snapjaw generateSnapjaw() {
        Object snapjaw = Constants.SNAPJAWS.keySet().toArray()[new Random().nextInt(Constants.SNAPJAWS.keySet().toArray().length)];
        switch (snapjaw.toString()) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(Constants.SNAPJAWS.get(snapjaw));
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(Constants.SNAPJAWS.get(snapjaw));
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(Constants.SNAPJAWS.get(snapjaw));
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(Constants.SNAPJAWS.get(snapjaw));
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw, Integer score) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(score);
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(score);
            }
        }
        return null;
    }

    public Snapjaw generateSnapjaw(String snapjaw, Integer score, Integer x, Integer y) {
        switch (snapjaw) {
            case "FallingSnapjaw" -> {
                return new FallingSnapjaw(score, x, y);
            }
            case "HangingSnapjaw" -> {
                return new HangingSnapjaw(score, x, y);
            }
        }
        return null;
    }
}
