package extensdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        //1、创建布偶猫
        Ragdoll rd=  new Ragdoll();
        rd.drink();
        rd.eat();
        rd.catchMouse();

        //1、创建哈士奇
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.destroyHome();
    }
}
