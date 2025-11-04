package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    public static double p;


    public Tester(String name) {
        this(name, "Unknown", 0, "A1", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Tester: " + name + " " + surname);
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + ": "  + name + " " + surname + " (" + experienceInYears + " years)");
        System.out.println(p);
    }

    public void printInfo(String prefix, boolean detailed) {
        if (detailed) {
            System.out.printf("%s: %s %s | Exp: %d years | English: %s | Salary: %.2f%n",
                    prefix, name, surname, experienceInYears, englishLevel, salary);
        } else {
            printInfo(prefix);
        }
    }

    public static double calculateBonus(double baseSalary, int experienceYears) {
        double bonus = baseSalary * (1 + experienceYears * 0.05);
        // System.out.println("Сотрудник: " + name + ", Бонус: " + bonus);
        return bonus;
    }
}