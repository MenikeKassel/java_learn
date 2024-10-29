package com.Exercise;

public class ChainCall {
    int value;

    public ChainCall setValue(int value) {
        this.value = value;
        System.out.println("Setting value to: " + this.value);

        return this;  // 返回当前对象，允许链式调用
    }

    public ChainCall incrementValue() {
        this.value++;
        System.out.println("Incrementing value: " + this.value);
        return this;  // 返回当前对象，允许链式调用
    }

    public void displayValue() {
        System.out.println("Final value: " + this.value);
    }

    public static void main(String[] args) {
        ChainCall chain = new ChainCall();

        // 链式调用
        chain.setValue(10)
                .incrementValue()
                .incrementValue()
                .displayValue();
    }
}
