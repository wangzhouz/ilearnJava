package a01staticdemo1;

public class myArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {10,20,50,34,100};
        String str = myArrayUtil.printArr(arr);
        System.out.println(str);

        double result = myArrayUtil.getAerage(arr);
        System.out.println(result);
    }
}
