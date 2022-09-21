package a05interfacedemo1;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教如何打乒乓球");
    }

    @Override
    public void speakEnglisth() {
        System.out.println("乒乓教练在学习如何说英语");
    }
}
