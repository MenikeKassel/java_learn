package com.inner2;

public class InnerExercise {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("Bell");
            }
        });
        }
    }
interface Bell{
    void ring();
}

class Phone {
    void alarmclock(Bell bell){
        System.out.println("alarm clock");
    }
}