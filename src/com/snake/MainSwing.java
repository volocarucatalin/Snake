package com.snake;

import javax.swing.*;
import java.awt.*;

public class MainSwing {

    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame("Snake Game");
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.white);
        window.setVisible(true);
        Point point = new Point(2 , 2);
        Snake snake = new Snake(point);
        window.add(snake);
        window.addKeyListener(new ArrowKey(point));
        Controller.start(snake);



    }

}
