package a01staticdemo1;

public class myArrayUtil {
    public static String printArr(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(array[0]);
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            sb = sb.append(",").append(n);
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAerage(int[] array) {
        double d = 0;
        for (int i = 0; i < array.length; i++) {
            double n = array[i];
            d += n;
        }
        return d / array.length;
    }

}
