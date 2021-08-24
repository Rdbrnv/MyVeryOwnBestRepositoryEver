package com.homeworkstuff.homework3.someinheritancestuff;

public class Main {

    public static void main(String[] args) {

        AppleCartridge apple = new AppleCartridge();
        MangoCartridge mango = new MangoCartridge();
        GrapeCartridge grape = new GrapeCartridge();

        Juul<MangoCartridge> juul = new Juul<>("Black", mango);

        Juul<GrapeCartridge> juul2 = new Juul<>("Red", grape);

        juul.getCartridge().tasteCartridge();
        juul2.getCartridge().tasteCartridge();
        System.out.println(juul2.getBodyColor());
    }
}
