package com.Exercise.polyparameter;

public class PloyParameter {
    public double showEmpAnnual(Employee e){
        return e.getAnnual();
    }
    public void testWork(Employee e){
        if(e instanceof Manager){
            Manager manger = (Manager) e;
            manger.manage();
        } else if (e instanceof Worker) {
            ((Worker) e).work();
        }

    }
    public static void main(String[] args) {
        Employee manger = new Manager("kk",200,300);
        Employee worker = new Worker("worker",100);
        //System.out.println(manger.getAnnual());
        PloyParameter ployParameter = new PloyParameter();
        System.out.println(ployParameter.showEmpAnnual(manger));
        System.out.println(ployParameter.showEmpAnnual(worker));
        ployParameter.testWork(manger);
        "hello".equals("abc");
    }

}
