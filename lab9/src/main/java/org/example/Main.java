package org.example;
import org.example.zad1.Cat;
import org.example.zad1.Dog;
import org.example.zad1.Parrot;
import org.example.zad1.Pet;
import org.example.zad2.Student;
import org.example.zad3.Employee;
import org.example.zad3.FixedSalaryEmployee;
import org.example.zad3.HourlySalaryEmployee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1 животные");
        System.out.println("2 студенты");
        System.out.println("3 сотрудники");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Map<String, Pet> petMap = new HashMap<>();
                petMap.put("Кот", new Cat("Маркиз"));
                petMap.put("Собака", new Dog("Тимоша"));
                petMap.put("Попугай", new Parrot("Кеша"));

                Pet.printAllPetNames(petMap);
                System.out.println(petMap);

                System.out.print("\nВведите имя животного: ");
                String key = scanner.nextLine();
                Pet.printPetByName(petMap, key);
                break;

            case 2:
                List<Student> students = new ArrayList<>();
                students.add(new Student("Никита", "т-1", 1, Arrays.asList(4, 5, 3)));
                students.add(new Student("Игорь", "т-2", 2, Arrays.asList(2, 3, 2)));
                students.add(new Student("Леша", "т-1", 2, Arrays.asList(5, 5, 4)));
                students.add(new Student("Максим", "т-3", 3, Arrays.asList(3, 4, 6)));
                students.add(new Student("Рома", "т-3", 2, Arrays.asList(3, 5, 6)));
                Student.processStudents(students);

                System.out.print("Введите курс для отображения студентов: ");
                int course = scanner.nextInt();
                Student.printStudents(students, course);
                break;

            case 3:
                Employee[] staff = {
                        new FixedSalaryEmployee("Радевич Роман", 43435.3),
                        new HourlySalaryEmployee("Новик Никита", 1234.11),
                        new FixedSalaryEmployee("Вельможин Роман", 980),
                        new FixedSalaryEmployee("Сухолольский Илья", 4332.8),
                        new HourlySalaryEmployee("Лепешов Максим", 123),
                        new FixedSalaryEmployee("Илюкевич Арсений", 4332.8)
                };

                List<Employee> employees = new ArrayList<>(Arrays.asList(staff));

                employees.sort((e1, e2) -> {
                    double s1 = e2.getMonthlySalary();
                    double s2 = e1.getMonthlySalary();
                    if (Double.compare(s1, s2) != 0) {
                        return Double.compare(s2, s1);
                    }
                    return e2.getFullName().compareTo(e1.getFullName());
                });

                System.out.println("Сотрудники (по убыванию зарплаты):");
                for (Employee e : employees) {
                    System.out.println("ID: " + e.getId() + ", Имя: " + e.getFullName() + ", Зарплата: " + e.getMonthlySalary());
                }

                System.out.println("\nПервые 5 имён:");
                for (int i = 0; i < Math.min(5, employees.size()); i++) {
                    System.out.println(employees.get(i).getFullName());
                }

                System.out.println("\nПоследние 3 ID:");
                int n = employees.size();
                for (int i = Math.max(0, n - 3); i < n; i++) {
                    System.out.println(employees.get(i).getId());
                }
                break;



            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
        }
    }
}
