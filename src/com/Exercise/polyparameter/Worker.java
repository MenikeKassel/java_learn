package com.Exercise.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("work");
    }

    @Override
    public double getAnnual() {
        System.out.println("Worker的工资为：");
        return super.getAnnual();
    }
}
