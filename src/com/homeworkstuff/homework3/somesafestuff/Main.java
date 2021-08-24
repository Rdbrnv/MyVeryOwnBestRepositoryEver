package com.homeworkstuff.homework3.somesafestuff;

public class Main {
    public static void main(String[] args) {

        Safe safe = new Safe(1111, "A512", "Green");

        System.out.println(safe.toString());

        safe.model = "M567";

        safe.color = "Black";

        safe.setPassword(5454);

        System.out.println(safe.getPassword());

        System.out.println(safe.toString());

    }
}
