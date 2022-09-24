package com.wzz.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        //设置界面的宽高
        jFrame.setSize(603,680);

        //设置界面的标题
        jFrame.setTitle("事件演示");

        //设界面置顶
        jFrame.setAlwaysOnTop(true);

        //设置界面居中
        jFrame.setLocationRelativeTo(null);

        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);


        //创建一个按纽对象
        JButton jtb = new JButton("点我啊");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb.addActionListener(new MyActionListener());
        //注意：这里的MyActionListener只被用到了一次，没有必要单独的去定义一个类。
        //可采用匿名内部类的对象
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了");
            }
        });

        //把按钮添加到界面当中
        jFrame.getContentPane().add(jtb);


        jFrame.setVisible(true);
    }
}
