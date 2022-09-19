package extensdemo7;

public class Employee {
    int employeeNum;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int employeeNum, String name, double salary) {
        this.employeeNum = employeeNum;
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("工作");
    }

    public void lunch(){
        System.out.println("吃饭（吃米饭）");
    }
}
