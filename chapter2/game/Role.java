package chapter2.game;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /*
    * 定义一个方法用于攻击别人
    * 思考：谁攻击谁
    * Role r1 = new Role();
    * Role r2 = new Role();
    * r1.攻击（r2）
    * 方法的调用者去攻击参数
    * */
    public void attack(Role role){
        //计算造成的伤害 1~20
        Random r= new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        /*
        *三元操作符也称为条件操作符  boolean-exp ? value0 : value1
        * 如果boolean-exp的结果为true，就计算value0，而且这个计算结果也就是操作符最终产生的值。
        * 如果boolean-exp的结果为false，就计算value1，同时，它的结果也就成为了操作符最终产生的值。
        * */
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下， " +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBoold + "点血");
    }
}
