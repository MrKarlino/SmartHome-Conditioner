package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;

class ConditionTest {

    @Test
    void testIncreaseCurrentTemperature() {
        Condition condition = new Condition();
        int maxTemperature = 35;

        condition.setOn(true);

        for (int i = condition.getCurrentTemperature(); i < (maxTemperature + 1); i++) {
            int expected = Math.min(condition.getCurrentTemperature() + 1, maxTemperature);
            condition.increaseCurrentTemperature();
            int actual = condition.getCurrentTemperature();
            assertEquals(expected, actual);
        }
    }

    @Test
    void testIncreaseCurrentTemperatureConditionerOff() {
        Condition condition = new Condition();

        int expected = condition.getCurrentTemperature();
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }


    @Test
    void testDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        int minTemperature = 15;

        condition.setOn(true);

        for (int i = condition.getCurrentTemperature(); i > (minTemperature - 1); i--) {
            int expected = Math.max(condition.getCurrentTemperature() - 1, minTemperature);
            condition.decreaseCurrentTemperature();
            int actual = condition.getCurrentTemperature();
            assertEquals(expected, actual);
        }
    }

    @Test
    void testDecreaseCurrentTemperatureConditionerOff() {
        Condition condition = new Condition();

        int expected = condition.getCurrentTemperature();
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}
