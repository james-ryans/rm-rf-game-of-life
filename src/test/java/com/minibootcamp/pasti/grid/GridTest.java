package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class GridTest {

    @Test
    void grid_HasOneDeadCell_WhenConstructed() {
        Grid grid = new Grid();

        assertFalse(grid.cell.isAlive());
    }
}
