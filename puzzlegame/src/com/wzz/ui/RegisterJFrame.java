package com.wzz.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册主界面
    public RegisterJFrame(){
        this.setSize(488, 500);
        this.setTitle("拼图注册");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }
}
