package com.itheima.demo;

public class Door {
    boolean flag = true;//门的状态数据，true表示开门，false表示关门

    public void open() {
        System.out.println("Open the door");
    }

    public void close() {
        System.out.println("Close the door");
    }
}
