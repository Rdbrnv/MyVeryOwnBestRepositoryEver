package com.homeworkstuff.homework3.somesafestuff;

public class Safe {
    private int password;
    protected String model;
    String color;

    public Safe(int password, String model, String color) {
        this.password = password;
        this.model = model;
        this.color = color;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Safe info{" +
                "password=" + password +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
