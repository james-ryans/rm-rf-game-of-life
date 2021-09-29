package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellTest {

    @Test
    void isAlive_ReturnFalse_WhenCellIsConstructed() {
        Cell cell = new Cell();

        assertFalse(cell.isAlive());
    }

    @Test
    void isAlive_ReturnTrue_WhenCellIsSetToAlive() {
        Cell cell = new Cell();
        cell.populate();

        assertTrue(cell.isAlive());
    }
}
