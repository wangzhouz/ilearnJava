package com.wzz.mycollection.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a01_CollectionDemo1 {
    public static void main(String[] args) {
        /*注意点：
        * Collection是一个接口，不能直接创建他的对象。
        * 所以，现在我们学习他的方法时，只能创建他实现类的对象。
        * 实现类：ArrayList
        * */

        //目的：为了学习collection接口里面的方法。
        //自己在做一些练习的时候，还是按照之前的方式去创建对象。
        Collection<String> coll = new ArrayList<>();

        //1、添加的元素
        //细节1：如果我们要往list系列集合中添加数据，那么方法永远返回true。因为list系列的是允许元素重复的。
        //细节2：如要我们要往set系列中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
        //                                  如果当前要添加的元分析已经存在，方法返回false，表示添加失败。
        //                                  因为set系列的集合不允许重复。
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2、清空
        //coll.clear();
        //System.out.println(coll);

        //3、删除
        //注意：因为Collection里面定义的是共性的主法，所以此时不能通过索引进行删除，只能通过元素的对象进行删除。
        //细节2:方法会有一个布尔类型的返回值，删掉成功返回true，否则返回false
        coll.remove("aaa");
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //4、判断元素是否包含
        //细节：底层是依赖equals方法进行判断是否存在 。
        //所以，如果集合中存储的是自定义对象，也想通过contains来判断是否包含，那么在JavaBean类中，一定要重写equals方法。
        boolean result = coll.contains("aaa");
        System.out.println(result);//false
    }
}
