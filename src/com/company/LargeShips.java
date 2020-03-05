package com.company;

/**
 * Класс больших кораблей.
 *
 * @author Киселева Татьяна
 * @version 1.10 29 February 2020
 */
public class LargeShips extends Ship {
    /**
     * Конструктор больших караблей.
     *
     * @param name
     * @param numDecks
     */
    public LargeShips(final String name, final int numDecks) {
        super(name, numDecks, "Красный", 8);
    }
    /**
     * Метод "тонуть".
     */
    @Override
    public void sink(final boolean crash) {
        String textSink = "";
        if (crash) {
            textSink = "тонет";
        } else {
            textSink = "не тонет";
        }
        System.out.println("Корабль" + textSink);
    }
    /**
     * Метод "стрелять".
     */
    @Override
    public void shoot(final int numCannonball) {
        String textShoot = "";
        if (numCannonball > 0) {
            textShoot = "Огонь!";
        } else {
            textShoot = "Нужны ядра";
        }
        System.out.println(textShoot);
    }
}
