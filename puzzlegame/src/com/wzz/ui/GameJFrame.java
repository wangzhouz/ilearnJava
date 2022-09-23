package com.wzz.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏的主界面
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化图片
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    //初始化图片
    private void initImage() {
        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\" + number + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                this.getContentPane().add(jLabel);
                //添加一次之后number需要自增，表示下一次加载后一张图片
                number++;
            }
        }

        //指定图片位置 - 第1列
        /*//创建一个图片ImageIcon的对象
        ImageIcon icon1 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\1.jpg");

        //创建一个JLabel的对象（管理容器）
        JLabel jLabel1 = new JLabel(icon1);

        //指定图片位置
        jLabel1.setBounds(0, 0, 105, 105);

        ImageIcon icon2 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\2.jpg");
        JLabel jLabel2 = new JLabel(icon2);
        jLabel2.setBounds(105, 0, 105, 105);

        ImageIcon icon3 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\3.jpg");
        JLabel jLabel3 = new JLabel(icon3);
        jLabel3.setBounds(210, 0, 105, 105);

        ImageIcon icon4 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\4.jpg");
        JLabel jLabel4 = new JLabel(icon4);
        jLabel4.setBounds(315, 0, 105, 105);*/
        /*for (int i = 0; i < 4; i++) {
            //创建一个JLabel的对象（管理容器）
            JLabel jLabel = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\1.jpg"));
            //指定图片位置
            jLabel.setBounds(105 * i, 0, 105, 105);
            this.getContentPane().add(jLabel);
        }*/

        //指定图片位置 - 第2列
        /*ImageIcon icon5 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\5.jpg");
        JLabel jLabel5 = new JLabel(icon5);
        jLabel5.setBounds(0, 105, 105, 105);
        ImageIcon icon6 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\6.jpg");
        JLabel jLabel6 = new JLabel(icon6);
        jLabel6.setBounds(105, 105, 105, 105);
        ImageIcon icon7 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\7.jpg");
        JLabel jLabel7 = new JLabel(icon7);
        jLabel7.setBounds(210, 105, 105, 105);
        ImageIcon icon8 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\8.jpg");
        JLabel jLabel8 = new JLabel(icon8);
        jLabel8.setBounds(315, 105, 105, 105);*/
        /*for (int i = 0; i < 4; i++) {
            //创建一个JLabel的对象（管理容器）
            JLabel jLabel = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\1.jpg"));
            //指定图片位置
            jLabel.setBounds(105 * i, 105, 105, 105);
            this.getContentPane().add(jLabel);
        }*/

        //指定图片位置 - 第3列
        /*ImageIcon icon9 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\9.jpg");
        JLabel jLabel9 = new JLabel(icon9);
        jLabel9.setBounds(0, 210, 105, 105);
        ImageIcon icon10 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\10.jpg");
        JLabel jLabel10 = new JLabel(icon10);
        jLabel10.setBounds(105, 210, 105, 105);
        ImageIcon icon11 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\11.jpg");
        JLabel jLabel11 = new JLabel(icon11);
        jLabel11.setBounds(210, 210, 105, 105);
        ImageIcon icon12 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\12.jpg");
        JLabel jLabel12 = new JLabel(icon12);
        jLabel12.setBounds(315, 210, 105, 105);*/
        /*for (int i = 0; i < 4; i++) {
            //创建一个JLabel的对象（管理容器）
            JLabel jLabel = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\1.jpg"));
            //指定图片位置
            jLabel.setBounds(105 * i, 210, 105, 105);
            this.getContentPane().add(jLabel);
        }*/

        //指定图片位置 - 第4列
        /*ImageIcon icon13 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\13.jpg");
        JLabel jLabel13 = new JLabel(icon13);
        jLabel13.setBounds(0, 315, 105, 105);
        ImageIcon icon14 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\14.jpg");
        JLabel jLabel14 = new JLabel(icon14);
        jLabel14.setBounds(105, 315, 105, 105);
//        ImageIcon icon15 = new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\15.jpg");
//        JLabel jLabel15= new JLabel(icon15);
//        jLabel15.setBounds(210,315,105,105);
        JLabel jLabel15 = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\15.jpg"));
        jLabel15.setBounds(210, 315, 105, 105);*/
        /*for (int i = 0; i < 4; i++) {
            //创建一个JLabel的对象（管理容器）
            JLabel jLabel = new JLabel(new ImageIcon("D:\\00_code\\learing\\ilearnJava\\puzzlegame\\image\\animal\\animal3\\1.jpg"));
            //指定图片位置
            jLabel.setBounds(105 * i, 315, 105, 105);
            this.getContentPane().add(jLabel);
        }*/


        //把管理容器添加到界面中
//        this.add(jLabel);
        /*this.getContentPane().add(jLabel1);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jLabel3);
        this.getContentPane().add(jLabel4);
        this.getContentPane().add(jLabel5);
        this.getContentPane().add(jLabel6);
        this.getContentPane().add(jLabel7);
        this.getContentPane().add(jLabel8);
        this.getContentPane().add(jLabel9);
        this.getContentPane().add(jLabel10);
        this.getContentPane().add(jLabel11);
        this.getContentPane().add(jLabel12);
        this.getContentPane().add(jLabel13);
        this.getContentPane().add(jLabel14);
        this.getContentPane().add(jLabel15);*/

    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();


        //创建菜单上面的两个选项的对象（功能、关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("关于我们");


        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);


        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
    }
}
