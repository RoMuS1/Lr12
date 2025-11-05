package org.example.zad1;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " мяукает.");
    }
}
