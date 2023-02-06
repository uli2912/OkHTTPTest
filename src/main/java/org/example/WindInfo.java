package org.example;

public class WindInfo {
    private String direction;
    private double speed;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "WindInfo{" +
                "direction='" + direction + '\'' +
                ", speed=" + speed +
                '}';
    }

}
