package org.example;

public class Manager extends Employee {
    private int Komanda;

    public Manager(String name, int age, int Komanda) {
        super(name, age, "Менеджер");
        this.Komanda = Komanda;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер команды: " + Komanda);
    }
}
