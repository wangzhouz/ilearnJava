package chapter9;

public class StringBuilderPractice4 {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";//deabc和1deabc


        int count = 0;

        if (str1.length() != str2.length()) {
            System.out.println("两个字符串不相等");
        } else {
            if (compareChar(str1, str2)) {

            } else {
                String temp = str2;
                for (int i = 0; i < str2.length(); i++) {
                    temp = rollChar(temp);
                    if(compareChar(str1, temp)){
                        System.out.println("字符串循环了"+count+"次后,两个字符串相等。");
                        break;
                    }
                }
            }

        }


        /*for (int i = 0; i < str1.length(); i++) {
            if (i < str2.length()) {
                count++;
                temp = rollChar(temp);
                System.out.println(temp);
                if (compareChar(str1, temp)){
                    System.out.println("字符串循环了"+count+"次后,两个字符串相等。");
                    break;
                }
            }
        }*/
    }

    public static boolean compareChar(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String rollChar(String str) {
        StringBuilder sb = new StringBuilder();
        String rollStr = sb.append(str.substring(1)).append(str.charAt(0)).toString();
        return rollStr;
    }
}


