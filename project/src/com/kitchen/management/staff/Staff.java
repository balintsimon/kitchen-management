package com.kitchen.management.staff;

public abstract class Staff {
    protected String name;

    protected int birthDate;
    protected int salary;
    public void printTaxReport() {
        System.out.println(name + " should pay " + salary*0.99 + " in taxes.");
    }

    Staff(String name, int birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
