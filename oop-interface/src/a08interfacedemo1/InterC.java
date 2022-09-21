package a08interfacedemo1;

public interface InterC {
    public static void show1(){
        System.out.println("show1方法开始执行了");
        //System.out.println("记录程序在运行中的各种细节");
        show3();
    }

    public static void show2(){
        System.out.println("show2方法开始执行了");
        //System.out.println("记录程序在运行中的各种细节");
        show3();
    }

    //静态的私有方法，给静态方法服务的。
    private static void show3(){
        System.out.println("记录程序在运行中的各种细节");
    }
}
