package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void nextRadioStationWhenMax() {

        radio.setCurrentNumber(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void useConstructorNextStationWhenMax() {
        Radio radio = new Radio(20);
        radio.setCurrentNumber(19);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumber();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMin() {

        radio.setCurrentNumber(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenCurrentOverMin() {

        radio.setCurrentNumber(-5);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenMax() {

        radio.setCurrentNumber(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void useConstructorPrevStationWhenMin() {
        Radio radio = new Radio(25);
        radio.setCurrentNumber(0);
        radio.prevRadioStation();

        int expected = 24;
        int actual = radio.getCurrentNumber();
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenMin() {

        radio.setCurrentNumber(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenCurrentOverMax() {

        radio.setCurrentNumber(25);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenMax() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenMin() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenCurrentOverMax() {

        radio.setCurrentVolume(125);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenMax() {

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenMin() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentOverMin() {

        radio.setCurrentVolume(-5);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}