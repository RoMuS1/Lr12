package org.example;

import java.io.*;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        String inputFile = "Chisla.txt";
        String evenFile = "chot.txt";
        String oddFile = "nechot.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("12 7 5 8 3 10 21 4 6 9 1 2 13 14 15");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (
                Scanner scanner = new Scanner(new File(inputFile));
                BufferedWriter chotChis = new BufferedWriter(new FileWriter(evenFile));
                BufferedWriter nechotChis = new BufferedWriter(new FileWriter(oddFile))
        ) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 == 0)
                    chotChis.write(num + " ");
                else
                    nechotChis.write(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
        }

        System.out.println("Файлы успешно созданы.");
    }
}

