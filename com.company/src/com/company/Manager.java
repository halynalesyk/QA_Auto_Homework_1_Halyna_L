package com.company;

public class Manager extends Employee {

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is managing the team.");
    }

    @Override
    public void describeRole() {
        System.out.println("Role description: Manager oversees the team.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role description: Manager, " + extraInfo);
    }
}
