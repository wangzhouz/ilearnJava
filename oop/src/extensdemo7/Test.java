package extensdemo7;

public class Test {
    public static void main(String[] args) {
        //1、创建一个经理
        Manager m = new Manager();
        m.employeeNum = 1001;
        m.name = "特朗普";
        m.salary = 5000.1;
        m.ManagementIncentive = 100;

        m.work();
        m.lunch();

        //2、创建一个厨师
        Chef  c = new Chef();
        c.employeeNum = 1002;
        c.name = "唐牛";
        c.salary = 3000;

        c.work();
        c.lunch();

        Manager m2 = new Manager(1002,"克林顿",4000,200);

        m2.work();
        m2.lunch();

    }
}
