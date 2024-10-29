package com.homework3;

public class ViceProfessor extends Teacher {
    String viceprofessor;
    public ViceProfessor(String name, int age, double salary){
        super(name, age, "Vice", salary * 1.3);
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("\tname:"+this.getName()+"\tage:"+this.getAge()+"\tpost:"+this.getPost()+"\tsalary:"+this.getSalary());
    }
}
