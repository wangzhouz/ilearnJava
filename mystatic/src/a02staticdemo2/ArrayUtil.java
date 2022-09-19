package a02staticdemo2;

public class ArrayUtil {
    //˽�л����췽��
    //Ŀ�ģ�������紴�����Ķ���
    private ArrayUtil() {

    }

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

}
