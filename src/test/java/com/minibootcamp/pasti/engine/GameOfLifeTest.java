package com.minibootcamp.pasti.engine;

import org.junit.jupiter.api.Test;

import java.awt.Point;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void rules_ReturnTrue_WhenCellIsAliveAndHasTwoOrThreeAliveNeighbours() {
        List<Point> aliveCells = List.of(
            new Point(0, 0), new Point(0, 1), new Point(0, 2),
            new Point(1, 1)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);

        assertTrue(game.rules(1, 1));
    }

    @Test
    void rules_ReturnFalse_WhenCellIsAliveAndHasLowerThanTwoAliveNeighbours() {
        List<Point> aliveCells = List.of(
            new Point(0, 1),
            new Point(1, 1)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);

        assertFalse(game.rules(1, 1));
    }

    @Test
    void rules_ReturnFalse_WhenCellIsAliveAndHasMoreThanThreeAliveNeighbours() {
        List<Point> aliveCells = List.of(
            new Point(0, 0), new Point(0, 1), new Point(0, 2),
            new Point(1, 0), new Point(1, 1)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);

        assertFalse(game.rules(1, 1));
    }

    @Test
    void rules_ReturnFalse_WhenCellIsDeadAndAliveNeighboursIsNotThree() {
        List<Point> aliveCells = List.of(
            new Point(0, 0), new Point(0, 1)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);

        assertFalse(game.rules(1, 1));
    }

    @Test
    void lifeCycle_SetCellsToDie_WhenHaveNoAliveNeighbours() {
        List<Point> aliveCells = List.of(new Point(1, 1));
        GameOfLife game = new GameOfLife(3, 3, aliveCells);
        game.lifeCycle();

        boolean[][] expectedCells = new boolean[3][3];

        assertArrayEquals(expectedCells, game.show());
    }

    @Test
    void lifeCycle_SetCellAccordingToRules_OnlyAtTheMiddleOfTheGrid() {
        List<Point> aliveCells = List.of(
            new Point(0, 0), new Point(0, 1), new Point(0, 2)
        );
        GameOfLife game = new GameOfLife(3, 3, aliveCells);
        game.lifeCycle();

        assertTrue(game.show()[1][1]);
    }
}
