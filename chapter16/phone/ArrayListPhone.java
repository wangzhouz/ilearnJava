package chapter16.phone;

import java.util.ArrayList;

public class ArrayListPhone {
    public static void main(String[] args) {
        ArrayList<phone> phoneList = new ArrayList<>();

        phone p1 = new phone("小米", 1000);
        phone p2 = new phone("苹果", 8000);
        phone p3 = new phone("锤子", 2999);

        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);

        /*StringBuilder x = comparePrice(phoneList,3000);
        System.out.println(x);*/

        ArrayList<phone> phoneInfoList = getPhoneInfo(phoneList,3000);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }
    }

    public static StringBuilder comparePrice(ArrayList<phone> phoneList, int price) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phoneList.size(); i++) {
            phone cp = phoneList.get(i);
            if (cp.getPrice() < price){
               sb.append("[").append(cp.getBrand()).append(",").append(cp.getPrice()).append("]");
            }
        }
        return sb;
    }

    //如果需要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回。
    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> phoneList, int price) {
        //定义一个集合用存储价格低于3000的手机对象信息
        ArrayList<phone> resultList = new ArrayList<phone>();
        for (int i = 0; i < phoneList.size(); i++) {
            phone gp = phoneList.get(i);
            if (gp.getPrice() < price){
                resultList.add(gp);
            }
        }
        return resultList;
    }
}
