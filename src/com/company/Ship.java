package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Ship implements ISwimmer {
    public final String name;
    public final int numDecks;
    public final String color;
    public final int numGuns;

    public Ship(String name, int numDecks, String color, int numGuns ) {
        this.name = name;
        this.numDecks = numDecks;
        this.color = color;
        this.numGuns = numGuns;
        System.out.println("Инициализация " + numDecks + "-палубного корабля <" + name + "> с " + numGuns + " пушками");
    }

    public abstract void sink(boolean crash);

    public abstract void shoot(int numCannonball);

    @Override
    public void swimm(boolean quickly) {
        System.out.println("Быстро ли плавает, не знаю...");
    }
}
