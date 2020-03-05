/**
 * Класс маленьких кораблей.
 *
 * @author Киселева Татьяна
 * @version 1.10 29 February 2020
 */
package com.company;

public class SmallShips extends Ship {
    /**
     * Параметр "имя".
     */
    private final String name;
    /**
     * Параметр "кол-во палуб".
     */
    private final int numDecks;

    /**
     * Конструктор маленьких кораблей.
     *
     * @param nameC
     * @param numDecksC
     */
    public SmallShips(final String nameC, final int numDecksC) {
        super(nameC, numDecksC, "Серый", 2);
        this.name = nameC;
        this.numDecks = numDecksC;
    }

    /**
     * Метод.
     *
     * @return имя корабля
     */
    public String getName() {
        return "Имя корабля - " + name;
    }

    /**
     * Метод.
     *
     * @return ко-во палуб
     */
    public String getNumDecks() {
        return "Кол-во палуб - " + numDecks;
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
    public void shoot(final int numCannonball) throws PositivNumCannonball {
        String textShoot = "";
        if (numCannonball > 0) {
            textShoot = "Огонь!";
        } else if (numCannonball < 0) {
            throw new PositivNumCannonball("Введено некорректное значение!");
        } else {
            textShoot = "Нужны ядра";
        }
        System.out.println(textShoot);
    }

    /**
     * Метод "плавать".
     */
    @Override
    public void swimm(final boolean quickly) {
        if (quickly) {
            System.out.println("Быстро плавает");
        } else {
            System.out.println("Не быстро плавает");
        }
    }

    /**
     * Метод "плавать 2.0".
     */
    public void swimm() {
        System.out.println("Быстро ли плавает он?");
    }
}
