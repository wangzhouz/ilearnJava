package chapter5;

class Sphere {
    //关键字static将变量PI设定为一个"类变量"而不是一个实例变量。
    static final double PI = 3.14;
    static int count = 0;

//    double xCenter;
//    double yCenter;
//    double zCenter;
//    double radius;

    //Instance Variables
    double radius = 5.0;
    double xCenter = 10.0;
    double yCenter = 10.0;
    double zCenter = 10.0;

    static int getCount(){
        return count;
    }

    //volume()是一个实例方法，因为它没有声明static。
    double volum(){
        return 4.0/3.0 * PI *radius * radius * radius;
    }

}
