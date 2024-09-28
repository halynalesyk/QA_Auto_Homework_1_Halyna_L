package com.company;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Alice", 35, 90000),
                new Developer("Bob", 28, 75000),
                new Designer("Charlie", 30, 70000)
        };

        for (Employee emp : employees) {
            emp.performJob();
            emp.describeRole();
            emp.describeRole("with 5 years of experience");
            System.out.println();
        }
    }
}
