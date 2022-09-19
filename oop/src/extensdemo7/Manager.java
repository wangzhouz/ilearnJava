package extensdemo7;

public class Manager extends Employee {
    double ManagementIncentive;

    public Manager() {
    }


    public Manager(int employeeNum, String name, double salary,double managementIncentive) {
        super(employeeNum, name, salary);
        this.ManagementIncentive = managementIncentive;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
