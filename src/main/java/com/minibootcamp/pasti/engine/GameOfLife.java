package com.minibootcamp.pasti.engine;

public class GameOfLife {
    private int rows, cols;

    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public boolean[][] show() {
        return new boolean[rows][cols];
    }
}
