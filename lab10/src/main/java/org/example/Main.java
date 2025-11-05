package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Проверка OkladException
        try {
            Sotrudnik s1 = new Sotrudnik("Иванов И.И.", "Бухгалтер", -50000);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
            try {
                Sotrudnik s2 = new Sotrudnik("Иванов И.И.", "Бухгалтер", 50000);
                System.out.println("Сотрудник создан: " + s2.getFio());
            } catch (OkladException ex) {
                System.out.println("Ошибка при повторном создании: " + ex.getMessage());
            }
        }

        // Проверка PremiyaException
        try {
            ShtatnySotrudnik s3 = new ShtatnySotrudnik("Петров П.П.", "Менеджер", 60000, -10000);
            System.out.println("Зарплата: " + s3.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println("Ошибка оклада: " + e.getMessage());
        }

        // Контрактный сотрудник
        try {
            KontraktnySotrudnik s4 = new KontraktnySotrudnik("Сидоров С.С.", "Разработчик", 70000);
            System.out.println("Зарплата по контракту: " + s4.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println("Ошибка оклада: " + e.getMessage());
        }
    }
}