package org.example.homework.four.ex3;

import org.example.homework.four.ex3.soundmakers.Bird;
import org.example.homework.four.ex3.soundmakers.Builder;
import org.example.homework.four.ex3.soundmakers.Driver;
import org.example.homework.four.ex3.soundmakers.Human;
import org.example.homework.four.ex3.soundmakers.SoundMaker;

public class Runner {
    public static void main(String[] args) {
        SoundMaker[] soundMakers = {
                new Bird(),
                new Human(),
                new Builder(),
                new Driver()
        };
        for (SoundMaker maker : soundMakers) {
            System.out.println(maker.makeSound());
        }

    }
}
