package a02staticdemo2;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {10,20,50,34,100};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double avg = ArrayUtil.getAverage(arr);
        System.out.println(avg);

//        ArrayUtil au = new ArrayUtil();
    }
}
