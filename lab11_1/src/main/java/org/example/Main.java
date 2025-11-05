package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание (1, 2 или 3):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                zadanie1.main(null);
                break;
            case 2:
                zadanie2.main(null);
                break;
            case 3:
                zadanie3.main(null);
                break;
            default:
                System.out.println("Некорректный выбор. Введите 1, 2 или 3.");
        }
    }
}
