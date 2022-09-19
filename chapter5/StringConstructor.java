package chapter5;

//class StringRefInitialization{
//    String s;
//}

class StringRefInitialization{
    String s1 = "Initialized at definition";
    String s2;

    StringRefInitialization(String s2i){
        s2 = s2i;
    }
}

public class StringConstructor {
    public static void main(String[] args){
//        StringRefInitialization s1 = new StringRefInitialization();
//        System.out.println(s1.s);
//        /*
//        * null
//        * */
        StringRefInitialization si = new StringRefInitialization("Constructor Initialization");
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);

        si.s1 = "对在定义时初始化的String域进行修改";
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s1 = " + si.s1);
    }
}
