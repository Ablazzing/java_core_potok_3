package org.example.homework.four.ex1.car;

public abstract class Car {
    private boolean isClean = true;
    private final double width;
    private final double length;
    private final double height;

    public Car(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isClean() {
        return isClean;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
