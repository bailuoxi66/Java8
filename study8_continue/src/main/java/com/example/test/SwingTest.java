package com.example.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/1/29 2:31 下午
 * @description
 */

public class SwingTest {
    public static void main(String[] args) {
        JFrame my_jFrame = new JFrame("my jFrame");
        JButton my_jButton = new JButton("my jButton");

        //匿名内部类，可以选择使用lambda进行替换
//        my_jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Button Pressed");
//            }
//        });

        //替换成lambda之后，actionEvent不需要定义类型。是因为java编译系统里面的类型推断，当推断不出来的时候，需要自己说明
        my_jButton.addActionListener(actionEvent -> {
            System.out.println("Button Pressed");
        });

        my_jFrame.add(my_jButton);
        my_jFrame.pack();
        my_jFrame.setVisible(true);
        my_jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
