package org.example.homework.four.ex1;

import org.example.homework.four.ex1.car.Bus;
import org.example.homework.four.ex1.car.Car;
import org.example.homework.four.ex1.car.LightCar;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[9];
        for (int i = 0; i < 9; i++) {
            if (i < 4) {
                cars[i] = new LightCar(1.9, 5, 2.2, true);
            } else {
                cars[i] = new Bus(2.2, 7, 3, 20);
            }
        }
        CarWash carWash = new CarWash();
        System.out.println("Стоимость помывки машин мэрии: " + carWash.wash(cars));
    }
}
