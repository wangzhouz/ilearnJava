package RegisterSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RegisterSystem {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------");
            System.out.println("请选择操作，1：登录，2：注册，3:忘记密码，4：退出");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    System.out.println("登录");
                    login(list);
                    break;
                case "2":
                    System.out.println("注册");
                    registerUser(list);
                    break;
                case "3":
                    System.out.println("忘记密码");
                    resetPassword(list);
                    break;
                case "4":
                    System.out.println("退出");
                    System.exit(0);
                    break;
                case "5":
                    System.out.println("管理员模式");
                    viewUsers(list);
                    break;
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    //管理员模式----------------------------------------------------------------(end)
    public static void viewUsers(ArrayList<user> list) {
        if (list.size() == 0) {
            System.out.println("没有用户注册");
        } else {
            for (int i = 0; i < list.size(); i++) {
                user u = new user();
                u = list.get(i);
                System.out.println(u.getName() + "," + u.getPassword() + "," + u.getIdentifyNumber() + "," + u.getPhoneNumber());
            }

        }
    }

    //登录--------------------------------------------------------------------(end)
    /*public static void login(ArrayList<user> list) {//我写的
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名与密码登录系统");
            String name = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (getIndex(list, name) >= 0) {
                if (list.get(getIndex(list, name)).getPassword().equals(password)) {
                    System.out.println("登录系统······");
                    StudentSystem sty = new StudentSystem();
                    break;
                } else {
                    System.out.println("密码错误");
                }
            } else {
                System.out.println("用户名错误");
            }
        }
    }*/
    public static void login(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册，请先注册再登录");
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前验证码为：" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            //验证用户名和密码是否正确
            //定义一个方法验证用户名和密码是否正确
            //注意：这里的封装思想的应用
            //可以把一些零散的数据，封装成一个对象;
            //这样传递参数据时候，只要传递一个整体就可以了，不需要管这些零散的数据。
            user userInfo = new user(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功，可以开始使用学生管理");
                StudentSystem ss = new StudentSystem();
                ss.startStudent();
                break;
            } else {
                System.out.println("登录失败，用户名和密码错误");
                if (i == 2) {
                    System.out.println("当前账号：" + username + "被锁定，请联系客服XXX-XXXXXX");
                    return;
                } else {
                    System.out.println("用户名和密码错误，还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    //注册--------------------------------------------------------------------(end)
    public static void registerUser(ArrayList<user> list) {
        //user u = new user();
        Scanner sc = new Scanner(System.in);
        /**要求：键盘录入用户名
         * 1、用户名唯一
         * 2、用户名长度必须在3~15之间；
         * 3、只能是字母加数字的组合，但是不能是纯数字。
         * */
        /*String name = null;//我写的
        while (true) {
            System.out.println("请输入用户姓名");
            name = sc.next();
            boolean flag = contains(list, name);
            if (flag) {
                System.out.println("用户名已存在，请重新输入");
            } else {
                if (name.length() > 3 && name.length() < 15) {
                    if (checkNumber(name, 3)) {
                        System.out.println("用户名不能全为数字");
                    } else {
                        u.setName(name);
                        break;
                    }
                } else {
                    System.out.println("用户名长度必须在3~15之间");
                }
            }
        }*/
        String username;
        while (true) {
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("格式条件，继续判断是否唯一");
                continue;
            }

            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                //不存在，表示当前用户可用，可以继续操作
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        /**要求：键盘录入密码
         * 1、密码键盘输入两次，两次一致才可以进行注册。
         * */
        /*int count = 0;//我写的
        while (true) {
            System.out.println("请输入用户的密码");
            String password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                u.setPassword(password);
                break;
            } else {
                count++;
                if (count == 2) {
                    System.exit(0);
                }
                System.out.println("两次密码不一致，请重新输入");
            }
        }*/
        String password;
        while (true) {
            System.out.println("请输入用户密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次输入的密码不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
        }


        /**要求：键盘录入身份证号码
         * 1、长度为18位；
         * 2、不能以0为开头
         * 3、前17位，必须都是数字。
         * 4、最后一位可以是数字，也可以是大写X和小写x
         * */
        /*while (true) {
            System.out.println("请输入身份证号码");
            String id = sc.next();
            if (id.charAt(0) != '0' && id.length() == 18) {
                if (checkNumber(id, 18)) {
                    u.setIdentifyNumber(id);
                    System.out.println("正确");
                    break;
                } else if (checkNumber(id, 17)) {
                    if (id.charAt(id.length() - 1) == 'x' | id.charAt(id.length() - 1) == 'X') {
                        u.setIdentifyNumber(id);
                        System.out.println("正确");
                        break;
                    } else {
                        System.out.println("最后一个字符必须为x");
                    }
                } else {
                    System.out.println("前17位非数字");
                }
            } else {
                System.out.println("第1位不能为0或号码长度不等于18位");
            }
        }*/
        String personID;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误");
                continue;
            }
        }


        /**要求：键盘录入手机号码
         * 1、长度为11位；
         * 2、不能以0为开头；
         * 3、必须都是数字。
         * */
        /*while (true) {我写的
            System.out.println("输入用户的手机号码");
            String phoneNumber = sc.next();
            if (phoneNumber.charAt(0) != '0' && phoneNumber.length() == 11) {
                if (checkNumber(phoneNumber, 11)) {
                    u.setPhoneNumber(phoneNumber);
                    break;
                }
            } else {
                System.out.println("请输入正确的手机号");
            }
        }*/
        String phoneNumber;
        while (true) {
            System.out.println("输入用户的手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }


        user u = new user(username, password, personID, phoneNumber);
        list.add(u);

        System.out.println("用户" + u.getName() + "注册成功");
    }


    //忘记密码-----------------------------------------------------------------(end)
    public static void resetPassword(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要重置的用户账号");
        String userName = sc.next();
        /*if (getIndex(list, resetName) >= 0) {
            System.out.println("需验证用户电话号码");
            String phone = sc.next();
            if (phone.equals(list.get(getIndex(list, resetName)).getPhoneNumber())) {
                System.out.println("手机号验证通过，请输入新的密码");
                String password = sc.next();
                list.get(getIndex(list, resetName)).setPassword(password);
            } else {
                System.out.println("输入的验证手机号不对");
            }
        } else {
            System.out.println("没有这个用户");
        }*/
        boolean flag = contains(list, userName);
        if (!flag) {
            System.out.println("当前用户" + userName + "未注册，请先注册");
            return;
        }

        //键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        //比较用户对象中的手机号码和身份证号码是否相同
        //需要把用户对象通过索引先获取出来
        int index = findIndex(list, userName);
        user user = list.get(index);
        //比较判断用户对象中的手机号码和身份证号码是否相同
        if (!(user.getIdentifyNumber().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证号码或手机号码输入有误，不能修改密码");
            return;
        }

        //当代码执行到这里，表示所有的数据全部验证成功，真接修改即可
        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请再次输入新的密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次输入的密码一致");
                break;
            } else {
                System.out.println("两次密码输入的不一致，请重新输入");
                continue;
            }
        }

        //直接修改
        user.setPassword(password);
        System.out.println("密码修改成功");
    }


    //判断用户集合中是否包含已有的用户名-----------------------------------------------------
    public static boolean contains(ArrayList<user> list, String name) {
        if (getIndex(list, name) >= 0) {
            return true;
        }
        return false;
    }

    //获取用户集合的索引------------------------------------------------------------------
    public static int getIndex(ArrayList<user> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if (u.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //判断字符串是否为数字----------------------------------------------------------------
    public static boolean checkNumber(String str, int setLength) {
        for (int i = 0; i < setLength; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                //System.out.println(x);
            } else {
                return false;
            }
        }
        return true;
    }

    //判断字符串是否为字母----------------------------------------------------------------
    public static boolean checkChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
            } else {
                if (c >= 'A' && c <= 'Z') {
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    //老师写的--------------------------------------------------------------------------
    //校验用户名
    private static boolean checkUsername(String username) {
        //校验长度。
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //校验字符，由字母、数字组成。
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                return false;
            }
        }
        //校验是否由全数字组成。
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;//当用户名中有一个字母，就表达用户合格，这样可以提高效率。
            }
        }
        return count > 0;
    }


    //老师写的--------------------------------------------------------------------------
    //校验身份证号码
    private static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            return false;
        }

        boolean flag = personID.startsWith("0");
        if (personID.startsWith("0")) {
            //如果以0开头，那么返回false。
            return false;
        }

        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar >= 'x') || (endChar <= 'X')) {
            return true;
        } else {
            return false;
        }
    }


    //老师写的--------------------------------------------------------------------------
    //校验电话号码
    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //老师写的--------------------------------------------------------------------------
    //生成一个验证码
    private static String getCode() {
        //1、创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //System.out.println(list);
        //[a, A, b, B, c, C, d, D, e, E, f, F, g, G, h, H, i, I, j, J, k, K, l, L, m, M,
        // n, N, o, O, p, P, q, Q, r, R, s, S, t, T, u, U, v, V, w, W, x, X, y, Y, z, Z]

        StringBuilder sb = new StringBuilder();
        //2、要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            sb.append(c);
        }

        //3、把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);
        //System.out.println(sb);

        //4、如果我们要修改字符串的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        //最大索引指向的元素，跟随机索引指向的元索交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

    //老师写的--------------------------------------------------------------------------
    //验证用户
    private static boolean checkUserInfo(ArrayList<user> list, user userInfo) {
        for (int i = 0; i < list.size(); i++) {
            user user = list.get(i);
            if (user.getName().equals(userInfo.getName()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //老师写的--------------------------------------------------------------------------
    //把对象从list拿出来
    private static int findIndex(ArrayList<user> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            user user = list.get(i);
            if (user.getName().equals(username)) {
                return i;
            }
        }
        return -1;
    }

}
