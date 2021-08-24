package com.homeworkstuff.homework2.somecalendarstuff;

public enum DayOfWeek {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY, // Day off
    SUNDAY; // Day off

    public DayOfWeek getNextDay() {
        return DayOfWeek.values()[(this.ordinal() + 1) % DayOfWeek.values().length];
    }
}
