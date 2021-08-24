package com.homeworkstuff.homework2.somecalendarstuff;

public enum Month {

    JANUARY(31), //31
    FEBRUARY(28), //28
    MARCH(31), //31
    APRIL(30), //30
    MAY(31), //31
    JUNE(30), //30
    JULY(31), //31
    AUGUST(31), //31
    SEPTEMBER(30), //30
    OCTOBER(31), //31
    NOVEMBER(30), //30
    DECEMBER(31); //31

    private int numberOfDays;

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
