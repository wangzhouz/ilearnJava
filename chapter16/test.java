package chapter16;

import java.util.ArrayList;


/*
* boolean add(E e)  添加
*
* boolean remove(E e)   删除
* e remove(int index)
*
* E set(int index, E e) 修改
*
* E get(int index)  查询
* int size()        获取长度
* */

public class test {
    public static void main(String[] args) {
        //1、创建集合对象
        //泛型：限定集合中存储数据的类型。
        ArrayList<String> list = new ArrayList<>();

        //2、添加元素
        boolean result = list.add("aaa");
        System.out.println(result); //true
        System.out.println(list);//[aaa]
        //只直使用方法添加元素
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);//[aaa, bbb, ccc, ddd]

        //2.1、遍历;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        //3、删除元素
        list.remove("aaa");
        System.out.println(result);//true
        System.out.println(list);//[bbb, ccc, ddd]

        //采用“索引”删除时，他会把被删除的元素返回。
        String str = list.remove(0);
        System.out.println(str);//bbb
        System.out.println(list);//[ccc, ddd]

        //4、修改元素
        String result1 = list.set(1,"eee");
        System.out.println(result1);//ddd
        System.out.println(list);//[ccc, eee]

        //5、查询元素
        String s = list.get(0);
        System.out.println(s);//ccc
    }
}
