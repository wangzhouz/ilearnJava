package chapter2;

public class test04 {
    public static void main(String[] args) {
        int bonze1 = 150;
        int bonze2 = 210;
        int bonze3 = 162;

        int compareHigh = (bonze1 > bonze2 ? bonze1 : bonze2)  > bonze3 ? (bonze1 > bonze2 ? bonze1 : bonze2) : bonze3;
        System.out.println(compareHigh);
    }
}


