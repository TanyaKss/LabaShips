package com.company;

/**
 * Класс содержит реализацию Исключения PositivNumCannonball.
 */
class PositivNumCannonball extends Exception {
    PositivNumCannonball(final int numCannonball) {
        super("Количество ядер " + numCannonball + " - не может быть отрицательным!");
    }

    PositivNumCannonball() {
        super("Введено неккоректное значение");
    }

    PositivNumCannonball(final String e) {
    }
}