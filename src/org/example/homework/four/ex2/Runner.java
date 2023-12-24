package org.example.homework.four.ex2;

import org.example.homework.four.ex2.exceptions.FlyException;
import org.example.homework.four.ex2.flyables.Airplane;
import org.example.homework.four.ex2.flyables.Duck;
import org.example.homework.four.ex2.flyables.Flyable;

public class Runner {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(false),
                new Duck(true),
                new Airplane(20),
                new Airplane(-1),
        };
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
