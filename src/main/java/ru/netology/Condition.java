package ru.netology;

public class Condition {
    protected final static int MAX_TEMPERATURE = 35;
    protected final static int MIN_TEMPERATURE = 15;
    private int currentTemperature = 20;
    private boolean on;

    void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    protected void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (!on) return;
        if (currentTemperature < MAX_TEMPERATURE) {
            currentTemperature++;
        }
        else {
            currentTemperature = MAX_TEMPERATURE;
        }
    }

    public void decreaseCurrentTemperature() {
        if (!on) return;
        if (currentTemperature > MIN_TEMPERATURE) {
            currentTemperature--;
        }
        else {
            currentTemperature = MIN_TEMPERATURE;
        }
    }
}
