package com.designPattern.interpreter;

/**
 * @Description：上下文環境類
 * @Author： thtrt
 * @Createdate： 1/20/2018 10:03 AM
 */
public class Context {
    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
