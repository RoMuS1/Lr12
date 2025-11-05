package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Никита", 35, 10);
        razrab d = new razrab("Рома", 22, "Java");
        stajor i = new stajor("Илья", 19, 3);

        m.displayInfo();
        System.out.println();
        d.displayInfo();
        System.out.println();
        i.displayInfo();
    }
}
