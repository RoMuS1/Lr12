package org.example.zad1;

public class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " говорит: Привет");
    }
}