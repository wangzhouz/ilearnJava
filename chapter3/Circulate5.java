package chapter3;

public class Circulate5 {
    enum Season{spring, summer, fall, winter}

    public static void main(String[] args){
        for(Season season : Season.values()){
            System.out.println("The season is now" + season);
        }
    }
}
