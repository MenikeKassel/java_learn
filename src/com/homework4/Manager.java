package com.homework4;

public class Manager extends Employee {
    private double bonus;
    //奖金多少不确定
    //通过setBouns


    public Manager(double daySalary, String name, int workDays, double grade) {
        super(daySalary, name, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void printSal(){
        //和父类方法不一样，所以可以重写
        System.out.println("经理" + getName() + "工资是=" + (getWorkDays() * getDaySalary() * getGrade() + bonus) );
    }

}
