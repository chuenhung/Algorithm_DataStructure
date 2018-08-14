package com.designPattern.memento;

/**
 * @Description：備忘錄模式：保存一个对象的某个状态，以便在适当的时候恢复对象
 * @Author： thtrt
 * @Createdate： 1/18/2018 11:20 AM
 */
public class mementoTest {
    public static void main(String[] args) {
        // 创建原始类
        Original origi = new Original("egg");

        // 创建备忘录
        Storage storage = new Storage(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
