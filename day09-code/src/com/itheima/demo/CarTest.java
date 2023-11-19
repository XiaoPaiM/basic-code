package com.itheima.demo;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建对象数组
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();//千万不要把这句写在外面，不然会一直重复更新第一个对象的数据
            System.out.println("对象的地址值：" + c);
            System.out.printf("请输入第%d辆车的品牌：", i + 1);
            String brand = sc.next();
            c.setBrand(brand);

            System.out.printf("请输入第%d辆车的价格：", i + 1);
            double price = sc.nextDouble();
            c.setPrice(price);

            System.out.printf("请输入第%d辆车的颜色：", i + 1);
            String color = sc.next();
            c.setColor(color);
            System.out.println();

            //把汽车对象添加到数组当中
            arr[i] = c;
        }
        //三部手机的总价
        for (Car car : arr) {
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}