package org.example.zad3;

public class FixedSalaryEmployee extends Employee {
    private double fixedSalary;

    public FixedSalaryEmployee(String fullName, double fixedSalary) {
        super(fullName);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getMonthlySalary() {
        return fixedSalary;
    }
}