package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Куки","Лабрадор");
        Dog dog2 =  new Dog("тимоша","дворняга");
        Animal cat = new Cat();

        dog2.printInfo();
        dog.printInfo();

        Cat cat2 = new Cat();
        dog.makeSound();
        cat2.makeSound();
    }
}