/* Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования.
•Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах. под форматами понимаем структуру файлов, например:
- в файле на одной строке хранится одна часть записи, пустая строка - разделитель
Создать информационную систему позволяющую работать с сотрудниками некой компании \ студентами вуза \ _учениками школы */


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Add rational or complex numbers
                    break;
                case 2:
                    // Subtract rational or complex numbers
                    break;
                case 3:
                    // Multiply rational or complex numbers
                    break;
                case 4:
                    // Divide rational or complex numbers
                    break;
                case 5:
                    System.out.println("Exiting calculator");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}

// Для телефонного справочника:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        List<String> directory = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File("phone_directory.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    directory.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // Directory is now loaded into the list, perform operations as needed
    }
}

// Для информационной системы для сотрудников /студентов:

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for name and age
}

public class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and setters for employeeId and salary
}

public class Student extends Person {
    private int studentId;
    private String major;

    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    // Getters and setters for studentId and major
}

public class InformationSystem {
    public static void main(String[] args) {
        // Create employee and student objects as needed
        // Store them in an array or list
        // Perform operations on them as needed
    }
}
