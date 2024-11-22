package com.inner;

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone() ;
        phone1.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("dddd");
            }
        });
    }
}


interface Bell {
    void ring();
}

class CellPhone  {

    public void alarmclock(Bell bell) {
        bell.ring();
}
    }


