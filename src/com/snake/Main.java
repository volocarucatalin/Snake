package com.snake;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();
        Point point = new Point(1, 1);

        Controller.start(table, point);
        Controller.drowTable(table);

    }
}
