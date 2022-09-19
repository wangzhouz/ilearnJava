package chapter2;

/*
 * 需求：已知数组元素为{33,5,22,44,55}
 * 请找出数组中最大值并打印在控制台
 * */
public class arrayTest6 {
    public static void main(String[] args) {
        int[] arr = {77,55, 5, 22, 100,44, 33, 66,88};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
//                System.out.println(number);
            }
        }
        System.out.println(max);
    }
}


