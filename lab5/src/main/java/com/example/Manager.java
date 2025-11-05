package com.example;

public class Manager extends Employes {
    private int komanda;

    public Manager(String name, int age, int Komanda) {
        super(name, age, "Менеджер");
        this.komanda = Komanda;
    }

    public int getkomanda (){
        return komanda;
    }

    public void setkomanda (int komanda) {
        this.komanda = komanda;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер команды: " + komanda);
    }
}
