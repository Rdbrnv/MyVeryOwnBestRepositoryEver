package com.homeworkstuff.homework3.someinheritancestuff;

public class Juul<T extends Cartridge> {

    private String bodyColor;
    private T cartridge;

    public Juul(String bodyColor, T cartridge) {
        this.bodyColor = bodyColor;
        this.cartridge = cartridge;
    }

    public T getCartridge() {
        return cartridge;
    }

    public String getBodyColor() {
        return bodyColor;
    }
}
