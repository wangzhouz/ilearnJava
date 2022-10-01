package a08RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo6 {
    public static void main(String[] args) {
        /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern:表示正则表达式
        //Matcher：文本匹配器，作用按照正则表达式的规则读取字符串，从头开始读取。

        //1、获取正则表达式的对象。
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //2、获取文本匹配器的对象
        Matcher m = p.matcher(str);

        //3、拿着文本匹配器从头开始读取，寻找是否有满足规则的的子串。
        //如果没有，方法返回false；
        //如果有，返回true。并在底层记录子串的超始索引和结束索引+1。
        boolean b = m.find();

        //4、.group()方法根据find()方法记录的索引进行字符串的截取。
        //会把截取的小串进行返回
        //String s1 = m.group();
        //System.out.println(s1);//Java
        while(m.find()){
            String s1 = m.group();
            System.out.println(s1);
        }

    }
}
