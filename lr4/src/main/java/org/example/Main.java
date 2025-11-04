package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Дмитрий");

        Tester t1 = new Tester("Иван");
        Tester t2 = new Tester("Мария", "Петрова");
        Tester t3 = new Tester("Анна", "Сидорова", 5, "C1", 120000.0);

        t1.printInfo();
        t2.printInfo("Junior QA");
        t3.printInfo("Senior QA", true);

        double bonusSalary = Tester.calculateBonus("Алексей", 50000, 5);

        System.out.printf("Рассчитанная зарплата с бонусом: %.2f%n", bonusSalary);
    }
}
