package com.example;

public class Razrab extends Employes {
    private String progIaz;

    public Razrab(String name, int age, String progIaz) {
        super(name, age, "Разработчик");
        this.progIaz = progIaz;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Язык программирования: " + progIaz);
    }
}
