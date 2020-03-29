package com.snake;

import java.awt.*;

public class Point extends Canvas {
    private int x;
    private int y;
    private String lastMove;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;

    }

    public void paint(Graphics g) {
        int with = x * 40;
        int height = y * 40;
        g.fillRect(with, height, 40, 40);
        g.setColor(Color.BLACK);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    public void moveUp() {
        this.y = y - 1;
        if (y == -1) {
            y = 9;
        }
        this.repaint();
        this.lastMove = "W";
    }

    public void moveDown() {
        this.y = y + 1;
        if (y == 10) {
            y = 0;
        }
        this.repaint();
        this.lastMove = "S";

    }

    public void moveRight() {
        this.x = x + 1;
        if (x == 10) {
            x = 0;
        }
        this.repaint();
        this.lastMove = "D";
    }

    public void moveLeft() {
        this.x = x - 1;
        if (x == -1) {
            x = 9;
        }
        this.repaint();
        this.lastMove = "A";

    }

    public void moveAtLasDirection() {
        switch (lastMove) {
            case "S": {
                moveDown();
                break;
            }
            case "W": {
                moveUp();
                break;
            }
            case "D": {
                moveRight();
                break;
            }
            case "A": {
                moveLeft();
                break;
            }
            default:
                System.err.println("Wrong Key");
        }


    }

    public void addDirection(String direction) {
        lastMove = direction;
    }

    public String getDirection() {
        return lastMove;
    }
}
