package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class GridTest {

    @Test
    void grid_HasAllDeadCell_WhenConstructed() {
        Grid grid = new Grid(1, 1);

        assertFalse(grid.cells[0][0].isAlive());
    }
}
