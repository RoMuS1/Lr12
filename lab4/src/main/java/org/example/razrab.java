package org.example;

public class razrab extends Employee {
    private String progIaz;

    public razrab(String name, int age, String progIaz) {
        super(name, age, "Разработчик");
        this.progIaz = progIaz;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Язык программирования: " + progIaz);
    }
}
