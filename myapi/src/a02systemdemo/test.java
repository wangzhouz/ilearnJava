package a02systemdemo;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
        int i = r1.availableProcessors();
        System.out.println(i);

        Runtime.getRuntime().exec("notepad");
    }
}
