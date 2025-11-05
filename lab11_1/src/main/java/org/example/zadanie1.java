package org.example;

import java.io.*;

public class zadanie1 {
    public static void main(String[] args) {
        String filePath = "obo_mne.txt";
        String soderj = "Имя: Рома\nГород: Минск\nкто: программист";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(soderj);
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }

        File file = new File(filePath);
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Файл существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно записывать: " + file.canWrite());

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}
