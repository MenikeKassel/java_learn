package com.exception;

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
public class Exception1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int res = a/b;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("ex");
        }
        int age = 150;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("eee");
        }
        System.out.println("ttt");

    }

}
