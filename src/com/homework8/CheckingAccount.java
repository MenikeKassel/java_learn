package com.homework8;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);  // 调用父类的 deposit 方法，减去 1 美元手续费
        System.out.println("存款手续费1美元");
        System.out.println("当前余额为: " + getBalance());  // 使用父类的 getBalance 方法获取余额
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);  // 调用父类的 withdraw 方法，加上 1 美元手续费
        System.out.println("取款手续费1美元");
        System.out.println("当前余额为: " + getBalance());  // 使用父类的 getBalance 方法获取余额
    }

}
