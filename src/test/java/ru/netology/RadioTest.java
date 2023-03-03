package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void stationTestPozitive() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(5);

        int expected = 5;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestNegative() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(-5);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestMoreMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(25);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesBelowZero() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesZero() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(0);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesOne() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(1);

        int expected = 1;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesEight() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(8);

        int expected = 8;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesNine() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(9);

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationTestLimitValuesTen() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestPozitive() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestNegative() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-7);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesNine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesTen() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTestLimitValuesEleven() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testNextStationMax() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationMin() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationMax() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationMin() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.nextVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.prevVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }















    }


