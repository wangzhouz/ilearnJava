package chapter3;

class name{
    String DogClass;
    String s;
}

class says{
    String DogSays;
    String n;
}

public class Dogs {
    public static void main(String[] args){
        name d1 = new name();
        name d2 = new name();
        d1.DogClass = "sport";
        d2.DogClass = "scruffy";

        says s1 = new says();
        says s2 = new says();
        s1.DogSays = "Ruff!";
        s2.DogSays = "Wurf!";

        d1.s = s1.DogSays;
        d2.s = s2.DogSays;

        System.out.println(d1.DogClass + " " + d1.s);
        System.out.println(d2.DogClass + " " + d2.s);
    }
}

//sport Ruff!
//scruffy Wurf!