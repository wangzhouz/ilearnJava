package chapter4;

public class Listcharacters {
    public static void main(String[] args){
        for(char c=0; c<128; c++)
            if(Character.isLowerCase(c))
                System.out.print("value: " + (int)c + " character: " + c + "\n");
    }
}
