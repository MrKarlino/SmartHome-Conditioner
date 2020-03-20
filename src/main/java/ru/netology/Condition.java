package ru.netology;

public class Condition {
    private int maxTemperature = 35;
    private int minTemperature = 15;
    private int currentTemperature = 20;
    private boolean on;

    void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (!on) return;
        if (currentTemperature < maxTemperature) {
            currentTemperature++;
        }
        else {
            currentTemperature = maxTemperature;
        }
    }

    public void decreaseCurrentTemperature() {
        if (!on) return;
        if (currentTemperature > minTemperature) {
            currentTemperature--;
        }
        else {
            currentTemperature = minTemperature;
        }
    }
}
