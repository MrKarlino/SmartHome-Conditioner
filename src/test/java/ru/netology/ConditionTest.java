package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;

class ConditionTest {

    @Test
    void testIncreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setOn(true);
        condition.setCurrentTemperature(Condition.MIN_TEMPERATURE);
        int expected = Condition.MIN_TEMPERATURE + 1;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void testIncreaseCurrentTemperatureOverLimit() {
        Condition condition = new Condition();

        condition.setOn(true);
        condition.setCurrentTemperature(Condition.MAX_TEMPERATURE);
        int expected = Condition.MAX_TEMPERATURE;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
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

        condition.setOn(true);
        condition.setCurrentTemperature(Condition.MAX_TEMPERATURE);
        int expected = Condition.MAX_TEMPERATURE - 1;
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void testDecreaseCurrentTemperatureUnderLimit() {
        Condition condition = new Condition();

        condition.setOn(true);
        condition.setCurrentTemperature(Condition.MIN_TEMPERATURE);
        int expected = Condition.MIN_TEMPERATURE;
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
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
