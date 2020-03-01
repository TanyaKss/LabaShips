package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SmallShips small = new SmallShips("Bublik",3);
        small.shoot(3);
        small.swimm(true);
        Helper.shoot(small.getName());
        small.swimm();
        small.swimm(true);
        small.getName();
    }
}
