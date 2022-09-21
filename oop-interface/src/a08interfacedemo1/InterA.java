package a08interfacedemo1;

public interface InterA {
    public default void show1(){
        System.out.println("show1方法开始执行了");
        //System.out.println("记录程序在运行中的各种细节");
        show3();
    }

    public default void show2(){
        System.out.println("show2方法开始执行了");
        //System.out.println("记录程序在运行中的各种细节");
        show3();
    }

    //普通的私有方法，给默认方法服务的。
    private void show3(){
        System.out.println("记录程序在运行中的各种细节");
    }
}
