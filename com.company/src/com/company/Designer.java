package com.company;

public class Designer extends Employee {

    public Designer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is designing graphics.");
    }

    @Override
    public void describeRole() {
        System.out.println("Role description: Designer creates visual elements.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Role description: Designer, " + extraInfo);
    }
}
