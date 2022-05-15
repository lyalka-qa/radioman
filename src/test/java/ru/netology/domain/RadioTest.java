package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextRadioStationWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenCurrentOverMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-5);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStationWhenCurrentOverMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(25);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenCurrentOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}