package extensdemo7;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(int employeeNum, String name, double salary) {
        super(employeeNum, name, salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}

