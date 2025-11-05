package org.example.zad1;
import java.util.Map;

public class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " издает звук.");
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

    public static void printAllPetNames(Map<String,Pet> map) {
        System.out.println("Список домашних животных:");
        for (String key : map.keySet()) {
            System.out.println(" " + key);
        }
    }

    public static void printPetByName(Map<String,Pet> map, String name) {
        Pet pet = map.get(name);
        if (pet != null) {
            System.out.println("Найден: " + pet.getClass().getSimpleName());
            pet.speak();
        } else {
            System.out.println("Животное с именем \"" + name + "\" не найдено.");
        }
    }
}
