package chapter2;

public class Test010 {

    public static void main(String[] args){
        if(args.length < 3 ){
            System.out.println("参数不够，请输入3个参数");
            return;
        }else {
            for(int i = 0; i< 3; i++){
                System.out.println("args[" + i + "]=" + args[i]);
            }
        }
    }
}
