package com.snake;

public class Table {
    final int ROW_MAX = 9;
    final int COL_MAX = 9;
    private String matrix[][] = new String[ROW_MAX][COL_MAX];

    public int getROW_MAX() {
        return ROW_MAX;
    }

    public int getCOL_MAX() {
        return COL_MAX;
    }

    public Table() {
        init();

    }

    private void init() {
        for (int i = 0; i < ROW_MAX; i++) {
            for (int j = 0; j < COL_MAX; j++) {
                matrix[i][j] = "* ";
            }
        }

    }

    public void drow() {
        for (int i = 0; i < ROW_MAX; i++) {
            for (int j = 0; j < COL_MAX; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void addPoint(Point point) {
        matrix[point.getY()][point.getX()] = "1 ";

    }
}
