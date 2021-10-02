package com.minibootcamp.pasti.grid;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    int rows, cols;
    public Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.cells = new Cell[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.cells[i][j] = new Cell();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.cells[i][j].setNeighbours(getNeighbours(i, j));
            }
        }
    }

    private List<Cell> getNeighbours(int row, int col) {
        List<Integer> neighbourX = List.of(-1,-1,-1, 0, 0, 1, 1, 1);
        List<Integer> neighbourY = List.of(-1, 0, 1,-1, 1,-1, 0, 1);

        List<Cell> neighbours = new ArrayList<>(List.of());
        for (int i = 0; i < 8; i++) {
            int x = (row + neighbourX.get(i) + rows) % rows;
            int y = (col + neighbourY.get(i) + cols) % cols;
            neighbours.add(cells[x][y]);
        }

        return neighbours;
    }
}
