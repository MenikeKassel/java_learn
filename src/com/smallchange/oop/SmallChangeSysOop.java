package com.smallchange.oop;

import java.util.Scanner;
import java.time.LocalDateTime;  // 用于处理日期和时间
import java.time.format.DateTimeFormatter;  // 用于格式化日期时间
import java.util.ArrayList;

public class SmallChangeSysOop {
    // 属性
    ArrayList<String> details = new ArrayList<>();  // 存储明细
    int money = 0;  // 余额
    boolean exit = false;  // 用于控制退出

    Scanner scanner = new Scanner(System.in);  // 输入流
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  // 日期格式化器

    // 主菜单方法
    public void mainMenu() {
        while (!exit) {
            System.out.println("-------零钱通菜单----------");
            System.out.println("1 零钱通明细");
            System.out.println("2 收益入账");
            System.out.println("3 消费");
            System.out.println("4 退出");
            System.out.print("请选择(1-4): ");

            int menu = scanner.nextInt();  // 读取用户输入的选项

            switch (menu) {
                case 1:
                    this.detail();  // 调用查看明细方法
                    break;
                case 2:
                    this.income();  // 调用收益入账方法
                    break;
                case 3:
                    this.pay();  // 调用消费方法
                    break;
                case 4:
                    System.out.println("退出程序");
                    exit = true;  // 设置退出标志，结束循环
                    break;
                default:
                    System.out.println("无效的选择，请重新输入！");
            }
        }

        scanner.close();  // 关闭扫描器
        System.out.println("程序已退出。");
    }

    // 查看零钱通明细方法
    public void detail() {
        System.out.println("-------零钱通明细----------");
        System.out.println("当前余额：" + money);
        if (details.isEmpty()) {
            System.out.println("暂无明细记录");
        } else {
            for (String detail : details) {
                System.out.println(detail);  // 打印每条明细
            }
        }
    }

    // 收益入账方法
    public void income() {
        System.out.print("请输入收益金额: ");
        int earnings = scanner.nextInt();  // 输入收益金额
        money += earnings;  // 增加余额

        // 获取当前日期和时间，并添加到明细中
        LocalDateTime nowEarnings = LocalDateTime.now();
        details.add("收益入账: + " + earnings + " 元\t" + nowEarnings.format(formatter) + "\t余额: " + money);
        System.out.println("收益入账成功，当前余额：" + money);
    }

    // 消费方法
    public void pay() {
        System.out.print("请输入消费金额: ");
        int consume = scanner.nextInt();  // 输入消费金额

        if (consume > money) {
            System.out.println("余额不足，消费失败！");
        } else {
            money -= consume;  // 减少余额

            // 获取当前日期和时间，并添加到明细中
            LocalDateTime nowConsume = LocalDateTime.now();
            details.add("消费: - " + consume + " 元\t" + nowConsume.format(formatter) + "\t余额: " + money);
            System.out.println("消费成功，当前余额：" + money);
        }
    }


}
