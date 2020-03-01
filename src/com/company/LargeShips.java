package com.company;

public class LargeShips extends Ship {
    public LargeShips(String name, int numDecks, String color, int numGuns) {
        super(name, numDecks, "Красный", 8);
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
}
