package com.example;
import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary: $" + emp.getSalary());


        Manager m = new Manager("Никита", 35, 10);
        Razrab d = new Razrab("Рома", 22, "Java");
        Stajor i = new Stajor("Илья", 19, 3);

        m.displayInfo();
        System.out.println();
        d.displayInfo();
        System.out.println();
        i.displayInfo();
    }
}
