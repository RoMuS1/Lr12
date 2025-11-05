package com.example;

public class Employes {
    protected String name;
    protected int age;
    protected String Dolzchnost;

    public Employes(String name, int age, String Dolzchnost) {
        this.name = name;
        this.age = age;
        this.Dolzchnost = Dolzchnost;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + Dolzchnost);
    }
}
