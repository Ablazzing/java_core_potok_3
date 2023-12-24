package org.example.homework.four.ex1.car;

public class Bus extends Car {
    private int maxCountPassengers;

    public Bus(double width, double length, double height, int maxCountPassengers) {
        super(width, length, height);
        this.maxCountPassengers = maxCountPassengers;
    }
}
