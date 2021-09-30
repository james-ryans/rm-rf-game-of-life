package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GridTest {

    @Test
    void grid_HasAllDeadCell_WhenConstructed() {
        Grid grid = new Grid(1, 1);

        assertFalse(grid.cells[0][0].isAlive());
    }

    @Test
    void getNeighbours_ReturnListOfEightCells_AtMiddleCell() {
        Grid grid = new Grid(3, 3);

        List<Cell> expectedNeighbours = List.of(
            grid.cells[0][0], grid.cells[0][1], grid.cells[0][2],
            grid.cells[1][0], grid.cells[1][2],
            grid.cells[2][0], grid.cells[2][1], grid.cells[2][2]
        );

        assertEquals(expectedNeighbours, grid.getNeighbours(1, 1));
    }

    @Test
    void getNeighbours_ReturnListWithoutItsTopNeighbours_AtTopmostCell() {
        Grid grid = new Grid(3, 3);

        List<Cell> expectedNeighbours = List.of(
            grid.cells[0][0], grid.cells[0][2],
            grid.cells[1][0], grid.cells[1][1], grid.cells[1][2]
        );

        assertEquals(expectedNeighbours, grid.getNeighbours(0, 1));
    }

    @Test
    void getNeighbours_ReturnListWithoutItsBottomNeighbours_AtBottommostCell() {
        Grid grid = new Grid(3, 3);

        List<Cell> expectedNeighbours = List.of(
            grid.cells[1][0], grid.cells[1][1], grid.cells[1][2],
            grid.cells[2][0], grid.cells[2][2]
        );

        assertEquals(expectedNeighbours, grid.getNeighbours(2, 1));
    }

    @Test
    void getNeighbours_ReturnListWithoutItsLeftNeighbours_AtLeftmostCell() {
        Grid grid = new Grid(3, 3);

        List<Cell> expectedNeighbours = List.of(
            grid.cells[0][0], grid.cells[0][1],
            grid.cells[1][1],
            grid.cells[2][0], grid.cells[2][1]
        );

        assertEquals(expectedNeighbours, grid.getNeighbours(1, 0));
    }

    @Test
    void getNeighbours_ReturnListWithoutItsRightNeighbours_AtRightmostCell() {
        Grid grid = new Grid(3, 3);

        List<Cell> expectedNeighbours = List.of(
            grid.cells[0][1], grid.cells[0][2],
            grid.cells[1][1],
            grid.cells[2][1], grid.cells[2][2]
        );

        assertEquals(expectedNeighbours, grid.getNeighbours(1, 2));
    }
}
