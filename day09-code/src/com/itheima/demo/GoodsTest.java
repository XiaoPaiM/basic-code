package com.itheima.demo;

public class GoodsTest {
    public static void main(String[] args) {
        //对象数组
        Goods[] arr = new Goods[3];

        //创建三个商品对象，实例化类
        Goods g1 = new Goods("001", "华为P40", 2599.00, 100);
        Goods g2 = new Goods("002", "保温杯", 229.00, 50);
        Goods g3 = new Goods("003", "枸杞", 9.99, 70);

        //把三个商品对象的地址值赋给对象数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
