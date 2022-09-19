package chapter5;

class Rock{
    //构造器采用与类相同的名称，考虑到在初始化期间自动调用构造器。
    //不接受任何参数的构造器叫做“默认构造器”也叫“无参构造器”
    Rock(){
        System.out.println("Rock ");
    }
}

class Rock2{
    //带参数的构造器
    Rock2(int i){
        System.out.println("Rock " + i + " ");
    }
}


public class SimpleConstructor {
    public static void main(String[] args){
//        for(int i=0; i<10; i++){
//            new Rock();
//        }
        for(int i=0; i<10; i++){
            new Rock2(i);
        }
    }
}
