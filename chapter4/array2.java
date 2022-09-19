package chapter4;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args){
        double[] samples = new double[5];

        for(int i=0; i<samples.length; ++i){
            samples[i] = 100.0*Math.random();
            System.out.println(Arrays.toString(samples));
        }
    }
}
