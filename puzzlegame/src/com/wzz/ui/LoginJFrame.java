package com.wzz.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面
    public LoginJFrame(){
        //创建登录界面的时候，同时给这个界面设置一些信息
        //比如宽、高直接展示出来。
        this.setSize(488, 430);
        this.setTitle("拼图登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }
}
