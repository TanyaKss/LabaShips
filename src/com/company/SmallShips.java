package com.company;

import java.sql.SQLOutput;

public class SmallShips<textShoot> extends Ship {
    private final String name;
    private final int numDecks;

    public SmallShips(String name, int numDecks) {
        super(name, numDecks, "Серый", 2);
        this.name = name;
        this.numDecks = numDecks;
    }

    public String getName() {
        return "Имя корабля - " + name;
    }

    public String getNumDecks() {
        return "Кол-во пушек - " + numDecks;
    }

    @Override
    public void sink(boolean crash) {
        String textSink = "";
        if (crash) {
            textSink = "тонет";
        } else {
            textSink = "не тонет";
        }
        System.out.println("Корабль" + textSink);
    }

    @Override
    public void shoot(int numCannonball) {
        String textShoot = "";
        if (numCannonball > 0) {
            textShoot = "Огонь!";
        } else {
            textShoot = "Нужны ядра";
        }
        System.out.println(textShoot);
    }

    @Override
    public void swimm(boolean quickly) {
        if (quickly) {
            System.out.println("Быстро плавает");
        } else {
            System.out.println("Не быстро плавает");
        }
    }

    public void swimm() {
        System.out.println("Быстро ли плавает он?");
    }
}
