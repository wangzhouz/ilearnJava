package a08interfacedemo1;

public class Test {
    public static void main(String[] args) {
        /**接口中私有方就去的定义格式
         * 格式1：
         * private 返回值类型 方法名（参数列表）{ }
         * private void show() { }
         *
         * 格式2：
         * private static 返回值类型 方法名（参数列表）{ }
         * private static void show() { }
         * */

        InterC.show1();
        InterC.show2();

    }
}
