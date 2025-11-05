package org.example.zad3;

 public class HourlySalaryEmployee extends Employee {
    private double hourlyRate;

    public HourlySalaryEmployee(String fullName, double hourlyRate) {
        super(fullName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}