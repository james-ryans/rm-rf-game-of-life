package com.minibootcamp.pasti.grid;

import java.util.Collection;
import java.util.List;

public class Grid {
    Cell[][] cells;

    public Grid(int rows, int cols) {
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Collection<Cell> getNeighbours(int row, int col) {
        return List.of(
            cells[row - 1][col - 1], cells[row - 1][col], cells[row - 1][col + 1],
            cells[row][col - 1], cells[row][col + 1],
            cells[row + 1][col - 1], cells[row + 1][col], cells[row + 1][col + 1]
        );
    }
}
