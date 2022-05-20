package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int currentNumber;
    //private int maxNumber = 9;
    private int minNumber;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;
    private int amountOfRadioStations = 10;


    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minNumber) {
            return;
        }
        if (currentNumber > amountOfRadioStations - 1) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void nextRadioStation() {
        if (currentNumber < amountOfRadioStations - 1) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
        setCurrentNumber(currentNumber);
    }

    public void prevRadioStation() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = amountOfRadioStations - 1;
        }
        setCurrentNumber(currentNumber);
    }

    public Radio(int amountOfRadioStations) {
        this.amountOfRadioStations = amountOfRadioStations;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }
}
