package extensdemo8;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("m001", "王五", 5000, 1000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() +
                "," + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("e001");
        c.setName("赵六");
        c.setSalary(4000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}
