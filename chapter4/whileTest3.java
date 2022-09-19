package chapter4;

/*
* 需要：世界最高山峰是珠穆郞玛峰（8844.53米 = 8844430毫米），
* 假如我有一张足够大的纸，它的厚度是0.1毫米。
* 请问：我折叠多少次，可以折成珠穆郞玛峰的高度？
* */
public class whileTest3 {
    public static void main(String[] args) {
        //1、定义山峰的高度
        double high = 8844430;

        //2、定义纸张初始的厚度
        double pageHigh = 0.1;

        //3、定义一个变量用来统计次数。
        int count = 0;

        /*
        *选择while的理由：由于我们不知道循环的次数也不知道循环的范围，
        * 只知道循环的结束条件，所以用while。
        * */
        while(pageHigh < high ){
            //折叠纸张
            pageHigh = pageHigh *2;
            //折叠一次，计数器++一次。
            count++;
        }
        System.out.println("这张纸需要折叠" + count +"次。");
    }
}


