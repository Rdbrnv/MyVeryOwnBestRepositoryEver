package com.homeworkstuff.homework2.somecalendarstuff;

public class Calendar {
    public static void main(String[] args) {

        DayOfWeek current = DayOfWeek.MONDAY;

        for (Month month : Month.values()) {
            for (int i = 1; i <= month.getNumberOfDays(); i++) {
                StringBuilder builder = new StringBuilder();
                builder.append(String.format("%s - %s - %d ", month, current, i));
                if ((current.equals(DayOfWeek.SATURDAY) || current.equals(DayOfWeek.SUNDAY))) {
                    builder.append("- Day off ");
                }
                current = current.getNextDay();
                System.out.println(builder.toString());
            }
        }
    }
}
