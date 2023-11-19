package com.itheima.demo;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个对象数组
        Phone[] arr = new Phone[3];

        //2.创建手机对象
        Phone p1 = new Phone("OPPO", 100, "blue");
        Phone p2 = new Phone("ViVO", 200, "white");
        Phone p3 = new Phone("小米", 300, "black");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        double avg = sum / arr.length;
        System.out.println("三部手机的平均价格：" + avg);
    }
}
