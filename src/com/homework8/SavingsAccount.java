package com.homework8;

public class SavingsAccount extends BankAccount{
    double interest = 0.01;
    int free ;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void earnMonthlyInterest(){
        System.out.println("=======================");
        this.free = 0;//重置交易次数
        super.deposit(interest*getBalance());
        System.out.println("重置交易次数" + this.free);
        System.out.println("当前余额为" + getBalance());
    }

    @Override
    public void deposit(double amount) {
        if (free < 3){
            super.deposit(amount);
            free += 1;
            System.out.println("本次存款免费");
            System.out.println("当前余额为" + getBalance());
        }else{
            super.deposit(amount - 1);
            System.out.println("存款手续费1美元");
            System.out.println("当前余额为" + getBalance());
        }

    }
}
