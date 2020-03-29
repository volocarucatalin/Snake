package com.snake;


public class Controller {

    public static void start(Table table, Point point) {
        table.addPoint(point);
    }

    public static void drowTable(Table table) {
        table.drow();
    }

    public static void start(Snake snake) throws InterruptedException {
        snake.moveUp();
        while (true) {
            Thread.sleep(500);
            snake.moveAtLasDirection();
        }

    }


}
