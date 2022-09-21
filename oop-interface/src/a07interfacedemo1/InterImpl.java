package a07interfacedemo1;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }
}
