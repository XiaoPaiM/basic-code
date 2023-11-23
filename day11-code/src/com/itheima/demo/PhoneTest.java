package com.itheima.demo;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //创建集合来存储手机对象
        ArrayList<Phone> phones = new ArrayList<>();
        Phone xiaomi = new Phone("小米", 1000);
        Phone apple = new Phone("苹果", 8000);
        Phone hammer = new Phone("锤子", 2999);
        phones.add(xiaomi);
        phones.add(apple);
        phones.add(hammer);
        ArrayList<Phone> index = lowPrice(phones);
        for (int i = 0; i < index.size(); i++) {
            System.out.println(index.get(i).getBrand() + ", " + index.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> lowPrice(ArrayList<Phone> phones) {
        ArrayList<Phone> list = new ArrayList<>();
        for (Phone phone : phones) {
            double price = phone.getPrice();
            if (price < 3000) {
                list.add(phone);
            }
        }
        return list;
    }
}
