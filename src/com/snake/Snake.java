package com.snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake extends Canvas {
    private List<Point> pointList;

    public Snake(Point point) {
        pointList = new ArrayList<Point>();
        pointList.add(point);
    }

    public void moveUp() {

        String lastMove = pointList.get(0).getDirection();
        pointList.get(0).moveUp();
        updateSnake(lastMove);

    }
    public void moveDown(){

    }

    private void updateSnake(String lastMove) {
        for(int i = 1; i < pointList.size(); i++){
           String last = pointList.get(i).getDirection();
            pointList.get(i).addDirection(lastMove);
            lastMove = last;

        }
    }

    public void moveAtLasDirection() {
        for(Point point: pointList){
            point.moveAtLasDirection();
        }
    }
}
