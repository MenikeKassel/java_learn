package com.homework13;

interface Computer {
    void work();
}

public class CellPhone {
    // 修改方法以接受 Computer 类型的参数
    void tesWork(Computer computer) {
        computer.work();  // 调用传入的 Computer 对象的 work 方法
    }

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.tesWork(new Computer() {
            @Override
            public void work() {  // 注意：添加了 public 访问修饰符
                System.out.println("test");
            }
        });
    }
}
