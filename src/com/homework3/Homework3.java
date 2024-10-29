package com.homework3;

public class Homework3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Generic com.homework3.Teacher", 45, "教师", 5000);
        teacher.introduce();
        Professor professor = new Professor("Alice", 50, 5000);
        professor.introduce();
        professor.article();
        ViceProfessor viceProfessor = new ViceProfessor("Alice", 50, 5000);
        viceProfessor.introduce();

    }
}
