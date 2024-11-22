package com.abstract_;

public class Manager extends Empolyee {
    private double bonus;
    public Manager(String name, String id, double salary) {
        super(name, id, salary);

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("work"+getName()+getBonus());
    }
}
