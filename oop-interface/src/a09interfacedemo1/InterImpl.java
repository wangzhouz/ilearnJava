package a09interfacedemo1;

public class InterImpl extends InterAdapter{
    //需要用到那个方法，就重写那个方法就要吧了。
    @Override
    public void method5() {
        System.out.println("只要用第5个方法");
    }
}
