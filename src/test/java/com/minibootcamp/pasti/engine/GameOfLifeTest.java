package com.minibootcamp.pasti.engine;

import org.junit.jupiter.api.Test;

import java.awt.Point;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeTest {

    @Test
    void show_Return2DArrayOfFalseBoolean_WithoutAnyAliveCells() {
        GameOfLife game = new GameOfLife(3, 3);

        boolean[][] expectedCells = new boolean[3][3];

        assertArrayEquals(expectedCells, game.show());
    }

    @Test
    void show_Return2DArrayOfTrueBoolean_WhenEveryCellsAreAlive() {
        List<Point> aliveCells = List.of(
            new Point(0, 0), new Point(0, 1), new Point(0, 2),
            new Point(1, 0), new Point(1, 1), new Point(1, 2),
            new Point(2, 0), new Point(2, 1), new Point(2, 2)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);

        boolean[][] expectedCells = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                expectedCells[i][j] = true;
            }
        }

        assertArrayEquals(expectedCells, game.show());
    }
}
