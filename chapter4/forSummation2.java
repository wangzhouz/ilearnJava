package chapter4;

//求1-100之间的偶数和
public class forSummation2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2 == 0){
                sum =sum + i;
            }
        }
        System.out.println(sum);//2550
    }
}


