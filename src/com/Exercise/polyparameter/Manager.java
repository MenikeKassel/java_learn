package com.Exercise.polyparameter;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){

        System.out.println("manager");
    }

    @Override
    public double getAnnual() {
        System.out.println("Manager的工资为：");
        return super.getAnnual() + bonus;
    }
}
