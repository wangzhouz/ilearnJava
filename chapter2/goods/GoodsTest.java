package chapter2.goods;

import java.util.Arrays;

public class GoodsTest {
    public static void main(String[] args) {
        //1、创建一个数组
        Goods[] arr = new Goods[3];

        //2、创建一个商品
        Goods g1 = new Goods("001", "华为手机P40", 5999.9, 100);
        Goods g2 = new Goods("002", "保温杯", 277.0, 50);
        Goods g3 = new Goods("003", "枸杞", 12.7, 70);

        //3、把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4、遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getGoodsID() + '\t' + arr[i].getGoodsName() +
                    '\t' + arr[i].getGoodsPrice() + '\t' + arr[i].getGoodsStock());
        }
    }
}
