package org.example;

import java.io.*;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        String filePath = "temperatures.txt";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            System.out.println("Введите 15 температур (по одной на строку):");
            for (int i = 0; i < 15; i++) {
                double temp = scanner.nextDouble();
                writer.write(temp + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            double sum = 0;
            int schot = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double temp = Double.parseDouble(line.trim());
                    sum += temp;
                    schot++;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное значение: " + line);
                }
            }
            double avg = (schot > 0) ? sum / schot : 0;
            System.out.printf("Средняя температура: %.2f°C\n", avg);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
