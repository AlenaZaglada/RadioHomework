package ru.netology;


public class Radio {


    private int numberCurrentStation;
    private int currentVolume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        if (numberCurrentStation < 0) {
            return;
        }
        if (numberCurrentStation > 9) {
            return;
        }
        this.numberCurrentStation = numberCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (numberCurrentStation != 9) {

            numberCurrentStation++;
        } else {
            numberCurrentStation = 0;
        }
    }

    public void prevStation() {

        if (numberCurrentStation != 0) {
            numberCurrentStation--;
        } else {
            numberCurrentStation = 9;
        }

    }

    public void nextVolume() {
        if (currentVolume < 10) {

            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void prevVolume() {

        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }

    }


}
