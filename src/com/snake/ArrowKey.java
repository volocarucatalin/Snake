package com.snake;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKey implements KeyListener {
    private Point point;

    public ArrowKey(Point point) {
        this.point = point;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                point.addDirection("W");
                break;
            case KeyEvent.VK_DOWN:
                point.addDirection("S");
                break;
            case KeyEvent.VK_RIGHT:
                point.addDirection("D");
                break;
            case KeyEvent.VK_LEFT:
                point.addDirection("A");
                break;

        }

    }


    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

}
