package com.example;

public class Stajor extends Employes {
    private int internshipDuration;

    public Stajor(String name, int age, int internshipDuration) {
        super(name, age, "Стажёр");
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Срок стажировки: " + internshipDuration + " мес.");
    }
}
