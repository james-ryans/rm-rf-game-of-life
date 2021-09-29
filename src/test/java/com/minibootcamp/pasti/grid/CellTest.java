package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellTest {

    @Test
    void isAlive_ReturnFalse_WhenCellIsConstructed() {
        Cell cell = new Cell();

        assertFalse(cell.isAlive());
    }
}
