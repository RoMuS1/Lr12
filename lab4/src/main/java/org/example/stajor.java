package org.example;

public class stajor extends Employee {
    private int internshipDuration;

    public stajor(String name, int age, int internshipDuration) {
        super(name, age, "Стажёр");
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Срок стажировки: " + internshipDuration + " мес.");
    }
}
