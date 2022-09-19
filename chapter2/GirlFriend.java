package chapter2;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        //“局部变量”表示测试类中调用方法传递过来的数据。
        //等号的左边：就表示成员位置的name。
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //set
    public void setAge(int a){
        if (a>=18 && a<=50){
            age = a;
        }else{
            System.out.println("非法数据");
        }
    }

    //get
    public int getAge(){
        return age;
    }


    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }




}
