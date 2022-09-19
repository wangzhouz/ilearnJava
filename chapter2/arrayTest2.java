package chapter2;

/*
* 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
* 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字。
* */
public class arrayTest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %3 == 0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("数组里"+count+"个能被3整除的数字");
    }
}
