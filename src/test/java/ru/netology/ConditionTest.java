package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
     void testIncreaseCurrentTemperature() {
        Condition condition = new Condition();
        int maxTemperature = 35;

        int expected = condition.getCurrentTemperature();
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);

        condition.setOn(true);

        for (int i = condition.getCurrentTemperature(); i < (maxTemperature + 1); i++) {
            expected = Math.min(condition.getCurrentTemperature() + 1, maxTemperature);
            condition.increaseCurrentTemperature();
            actual = condition.getCurrentTemperature();
            assertEquals(expected, actual);
        }
    }

    @Test
    void testDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        int minTemperature = 15;

        int expected = condition.getCurrentTemperature();
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);

        condition.setOn(true);

        for (int i = condition.getCurrentTemperature(); i > (minTemperature - 1); i--) {
            expected = Math.max(condition.getCurrentTemperature() - 1, minTemperature);
            condition.decreaseCurrentTemperature();
            actual = condition.getCurrentTemperature();
            assertEquals(expected, actual);
        }
    }
}