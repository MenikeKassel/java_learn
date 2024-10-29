package com.homework4;

public class Employee {
    private String name;
    private double daySalary;
    private int workDays;
    private double grade;

    public Employee(double daySalary, String name, int workDays, double grade) {
        this.daySalary = daySalary;
        this.name = name;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSal(){
        System.out.println("工资情况：");
        System.out.println(" name "+name+" Salary: "+ daySalary*workDays*grade);
    }

}
