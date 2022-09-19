package chapter2;

/*
* 定义一个数组，遍历数组得到每一个元素，求数组里面所有的数据和。
* */
public class arrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0 ;

        //自动生成“数组名.fori”
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("数组和为：" + sum);
    }
}


