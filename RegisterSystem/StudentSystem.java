package RegisterSystem;




import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudent() {
        ArrayList<student2> list = new ArrayList<>();

        loop:
        while (true) {
            System.out.println("-----------------学生管理系统-----------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            System.out.println("请输入您的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5": {
                    System.out.println("退出");
                    //break loop;//第一种退出循环的方法
                    System.exit(0);//停止虚拟机运行
                }
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<student2> list) {
        student2 s = new student2();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已经存在，请重新录入");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年岭");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println(s.getId() + ":" + s.getName() + ",添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<student2> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        //查询id在集合中的索引
        int index = getIndex(list, id);
        //对index进行判断
        //如果-1，表示不存在，结束方法，回到初始菜单
        if (index >= 0) {
            //如果大于等于0,表示存在，直接删除
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<student2> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        int index = getIndex(list, id);

        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }

        student2 stu = list.get(index);

        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<student2> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }

        System.out.println("id\t\t姓名\t\t年龄\t\t 家庭住址");
        for (int i = 0; i < list.size(); i++) {
            student2 stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() +
                    "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<student2> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            //拿到学生对象后，获取id进行判断
            student2 stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //通过id获取索引的方支
    public static int getIndex(ArrayList<student2> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            student2 stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}



