package a05interfacedemo1;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("刘诗雯",23);
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.speakEnglisth();
        pps.study();
    }
}
