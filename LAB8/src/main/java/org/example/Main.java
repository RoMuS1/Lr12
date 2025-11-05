package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Тимоша");
        Animal cat = new Cat("Маркиза");

        dog.makeSound();
        cat.makeSound();

    }
}
