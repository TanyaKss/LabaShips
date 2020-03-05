package com.company;

final class Main {
        private Main() {
    }
    /**
     * Комментарий.
     *
     * @param args
     */
    public static void main(final String[] args) {

        SmallShips small = new SmallShips("Bublik", 3);
        small.swimm(true);
        try {
            small.shoot(-1);
        } catch (PositivNumCannonball e) {
            System.out.println("Введено неккоректное значение");
        }
        Helper.shoot(small.getName());
        small.swimm();
        small.swimm(true);


    }
}
