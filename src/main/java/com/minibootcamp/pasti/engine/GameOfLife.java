package com.minibootcamp.pasti.engine;

import com.minibootcamp.pasti.grid.Grid;

import java.awt.Point;
import java.util.List;

public class GameOfLife {
    private int rows, cols;
    private Grid grid;
    private Grid futureGrid;

    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Grid(rows, cols);
        this.futureGrid = new Grid(rows, cols);
    }

    public GameOfLife(int rows, int cols, List<Point> aliveCells) {
        this(rows, cols);

        for (Point cell : aliveCells) {
            this.grid.cells[cell.x][cell.y].populate();
        }
    }

    public boolean[][] show() {
        boolean[][] cells = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = grid.cells[i][j].isAlive();
            }
        }

        return cells;
    }

    public boolean rules(int row, int col) {
        boolean isAlive = grid.cells[row][col].isAlive();
        boolean isDead = !isAlive;
        long aliveNeighbours = grid.cells[row][col].aliveNeighbours();

        return (isAlive && 2 <= aliveNeighbours && aliveNeighbours <= 3)
            || (isDead && aliveNeighbours == 3);
    }

    public void lifeCycle() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rules(i, j)) {
                    futureGrid.cells[i][j].populate();
                } else {
                    futureGrid.cells[i][j].die();
                }
            }
        }

        swapGrid();
    }

    private void swapGrid() {
        Grid tempGrid = grid;
        grid = futureGrid;
        futureGrid = tempGrid;
    }
}
