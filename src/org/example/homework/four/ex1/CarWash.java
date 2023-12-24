package org.example.homework.four.ex1;

import org.example.homework.four.ex1.car.Car;

public class CarWash {
    private static final int LARGE_CAR_TARIFF = 4_000;
    private static final int SMALL_CAR_TARIFF = 2_000;
    private static final double LARGE_LENGTH_SIZE = 6;
    private static final double LARGE_HEIGHT_SIZE = 2.5;
    private static final double LARGE_WIDTH_SIZE = 2;

    public int wash(Car car) {
        car.setClean(true);
        return getTariff(car);
    }

    public int wash(Car[] cars) {
        int totalPrice = 0;
        for (Car car : cars) {
            totalPrice += wash(car);
        }
        return totalPrice;
    }

    //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
    private int getTariff(Car car) {
        if (car.getLength() > LARGE_LENGTH_SIZE
                || car.getHeight() > LARGE_HEIGHT_SIZE
                || car.getWidth() > LARGE_WIDTH_SIZE) {
            return LARGE_CAR_TARIFF;
        }
        return SMALL_CAR_TARIFF;
    }
}
