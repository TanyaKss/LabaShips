/**
 * Класс кораблей, родитель.
 *
 * @author Киселева Татьяна
 * @version 1.10 29 February 2020
 */
package com.company;

public abstract class Ship implements ISwimmer {
    /**
     * Поле наименования.
     */
    private final String name;
    /**
     * Поле кол-во палуб.
     */
    private final int numDecks;
    /**
     * Поле цвет.
     */
    private final String color;
    /**
     * Поле кол-во пушек.
     */
    private final int numGuns;
    /**
     * Конструктор корабля.
     * @param nameC
     * @param numDecksC
     * @param colorC
     * @param numGunsC
     */
    public Ship(final String nameC, final int numDecksC, final String colorC, final int numGunsC) {
        this.name = nameC;
        this.numDecks = numDecksC;
        this.color = colorC;
        this.numGuns = numGunsC;
        System.out.println("Инициализация " + numDecks + "-палубного корабля <" + name + "> с " + numGuns + " пушками");
    }
    /**
     * Абстрактный метод "тонуть" - sink.
     * @param crash
     */
    public abstract void sink(boolean crash);
    /**
     * Абстрактный метод "стрелять" - shoot.
     * @param numCannonball
     */
    public abstract void shoot(int numCannonball) throws PositivNumCannonball;
    /**
     * Метод swimm.
     * @param quickly
     */
    @Override
    public void swimm(final boolean quickly) {
        System.out.println("Быстро ли плавает, не знаю...");
    }
}
