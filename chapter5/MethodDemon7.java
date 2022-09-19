package chapter5;

//设计一个方法求数组的最大值，并将最大值返回。
public class MethodDemon7 {
    public static void main(String[] args) {
        //1、定义一个数组。
        int[] arr = {2,34,5,3,2};

        //2、调用方法求最大值。
        int max = getMax(arr);

        //3、打印
        System.out.println(max);
    }

    //1、我要干什么？  求最大值
    //2、干这件事，需要什么才能完成。  数组
    //3、是否反回值。  返回
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
