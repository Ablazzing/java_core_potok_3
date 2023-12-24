package org.example.homework.four.ex1.car;

public class LightCar extends Car {
    private boolean hasCruiseControl;

    public LightCar(double width, double length, double height, boolean hasCruiseControl) {
        super(width, length, height);
        this.hasCruiseControl = hasCruiseControl;
    }
}
