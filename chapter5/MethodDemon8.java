package chapter5;

//定义一个方法，判断数组中的某一个数是否存在，并将结果返回给调用处。
public class MethodDemon8 {
    public static void main(String[] args) {
        //1、定义一个数组
        int[] arr = {23,4,2,1,3,5,111};

        //2、调用方法
        boolean flag = contains(arr,2);
        System.out.println(flag);
    }

    //1、我要干什么？  判断数字在数组中是否存在。
    //2、我干这件事情，需要什么才能完成？    数组，数字
    //3、调用处是否需要继续使用结果？  返回true, false
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        //什么时候才能断定2，在数组中是否存在？
        //当数组里面所有的数据全部比较完毕之后。
        return false;
    }
}
