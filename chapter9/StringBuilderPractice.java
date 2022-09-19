package chapter9;


public class StringBuilderPractice {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        if (arr.length < 2) {
            result = sb.append("[").append(arr[0]).append("]").toString();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    result = sb.append("[").append(arr[i]).toString();
                } else if (i == arr.length - 1) {
                    result = sb.append(",").append(arr[i]).append("]").toString();
                } else {
                    result = sb.append(",").append(arr[i]).toString();
                }
            }
        }
        return result;
    }
}




