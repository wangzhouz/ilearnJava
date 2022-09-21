package a06interfacedemo1;

public interface Inter {
    //抽象方法
    public abstract void method();

    //默认方法
    public default void show(){
        System.out.println("接口中的默认方法 --- show");
    }
}
