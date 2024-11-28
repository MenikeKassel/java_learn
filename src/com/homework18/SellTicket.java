package com.homework18;

public class SellTicket {

    public static void main(String[] args) {
        Sell sell = new Sell();

        Thread thread1 = new Thread(sell);

        Thread thread2 = new Thread(sell);

        Thread thread3 = new Thread(sell);


        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class Sell extends Thread{
    private static int tickets = 10;

    @Override
    public void run() {
        while (true){
            if(tickets <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程" + Thread.currentThread().getName() + "售票1张" + "余票为"+ --tickets);

            }
        }
    }
class SellRun implements Runnable{
    private static int tickets = 10;

    @Override
    public void run() {
        while (true){
            if(tickets <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程" + Thread.currentThread().getName() + "售票1张" + "余票为"+ --tickets);

        }
    }
}
