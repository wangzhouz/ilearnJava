package a03staticdemo3;

import a03staticdemo3.Student;

import java.util.ArrayList;

public class compareAgeUtil {
    private compareAgeUtil(){
    }

    public static int compareAgeStu(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            //���ٳ��򷴸�����list.get(i).getAge()�������Ч�ʡ�
            int tempAge = list.get(i).getAge();
            if ( tempAge > maxAge){
                maxAge = tempAge;
            }
        }
        return maxAge;
    }

}
