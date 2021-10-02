package com.minibootcamp.pasti.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeTest {

    @Test
    void show_Return2DArrayOfFalseBoolean_WithoutAnyAliveCells() {
        GameOfLife game = new GameOfLife(3, 3);

        boolean[][] expectedCells = new boolean[3][3];

        assertArrayEquals(expectedCells, game.show());
    }
}
