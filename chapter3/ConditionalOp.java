package chapter3;

public class ConditionalOp {
    public static void main(String[] args){
        int nHats = 1;
        System.out.println("I have " + nHats + " hat"  + (nHats == 1 ? "." : "s."));
        nHats++;
        System.out.print("I have" + nHats + " hat" + (nHats == 1 ? "." : "s."));
    }
}
