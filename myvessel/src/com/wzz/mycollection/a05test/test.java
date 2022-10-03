package com.wzz.mycollection.a05test;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        /*
        * 需求：
        *                 定义一个继承结构：
        *                     动物
        *         |                           |
        *         猫                          狗
        *     |      |                    |      |
        *   波斯猫   狸花猫                泰迪   哈士奇
        *
        * 属性：名字，年龄
        * 行为：吃东西
        * 波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
        * 狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
        * 泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
        * 哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家
        *
        * 测试类中定义一个方法用于饲养动物
        * public static void keepPet(ArrayList<???> list){
        *       遍历集合，调用动物的eat方法
        * }
        * 要求1：该方法能养所有品种的猫，但是不能养狗       keepPet1
        * 要求2：该方法能养所有品种的狗，但是不能养猫       keepPet2
        * 要求3：该方法能养所有的动物，但是不能传递其他类型    keepPet3
        * */
        ArrayList<Animal> list = new ArrayList<>();

        ArrayList<PersianCat> list1 = new ArrayList<>();
        list1.add(new PersianCat("小昭", 1));
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        list2.add(new LiHuaCat("小狸", 2));
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        list3.add(new TeddyDog("阿泰", 3));
        ArrayList<HuskieDog> list4 = new ArrayList<>();
        list4.add(new HuskieDog("二哈", 4));


        //迭代器遍历
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
            Animal a = it.next();
//            System.out.println(a.getName()+ ","+ a.getAge());
        }

        //增加for遍历
        for (Animal a : list) {
//            System.out.println(a.getName()+ ","+ a.getAge());
        }

        //public static void keepPet1(ArrayList<? extends Dog> list){}
//        keepPet1(list1);
//        keepPet1(list2);
        keepPet1(list3);
        keepPet1(list4);

        //public static void keepPet2(ArrayList<? extends Cat> list) {
        keepPet2(list1);
        keepPet2(list2);
//        keepPet2(list3);
//        keepPet2(list4);

        //public static void keepPet3(ArrayList<? extends Animal> list) {
        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);

    }

    public static void keepPet1(ArrayList<? extends Dog> list) {
        for (Animal a : list) {
            System.out.println(a.getName() + "," + a.getAge());
            a.eat();
        }

    }

    public static void keepPet2(ArrayList<? extends Cat> list) {
        for (Animal a : list) {
            System.out.println(a.getName() + "," + a.getAge());
            a.eat();
        }

    }

    public static void keepPet3(ArrayList<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a.getName() + "," + a.getAge());
            a.eat();
        }

    }

}
