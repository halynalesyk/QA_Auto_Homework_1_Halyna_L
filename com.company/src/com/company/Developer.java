package com.company;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is writing code.");
    }

    @Override
    public void describeRole() {
        System.out.println("Role description: Developer writes and maintains code.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role description: Developer, " + extraInfo);
    }
}
