package com.Exercise.polyparameter;

public class Employee {
    String name;
    private double salary;
    public  double getAnnual(){
        return salary * 12;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
