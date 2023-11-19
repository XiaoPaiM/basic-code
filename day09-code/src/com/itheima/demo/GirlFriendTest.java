package com.itheima.demo;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建一个对象数组
        GirlFriend[] arr = new GirlFriend[4];
        //创建女朋友对象，对象实例化
        GirlFriend gf1 = new GirlFriend("小红", 19, '女', "羽毛球");
        GirlFriend gf2 = new GirlFriend("小绿", 21, '女', "足球");
        GirlFriend gf3 = new GirlFriend("小紫", 23, '女', "篮球");
        GirlFriend gf4 = new GirlFriend("小粉", 25, '女', "兵乓球");
        //把对象的地址值赋给对象数组的元素
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //求和
        int sum = 0;
        for (GirlFriend gf : arr) {
            //引用数据类型
            sum += gf.getAge();
        }
        double avg = sum * 1.0 / arr.length;
        System.out.println("四个女朋友的年冷平均值：" + avg);
        //统计数量
        int count = 0;
        for (GirlFriend gf : arr) {
            if (avg > gf.getAge()) {
                count++;
            }
        }
        System.out.printf("%d个女朋友的年龄低于平均值！", count);
    }
}
