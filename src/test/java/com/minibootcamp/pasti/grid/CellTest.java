package com.minibootcamp.pasti.grid;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void isAlive_ReturnFalse_WhenCellIsSetToDie() {
        Cell cell = new Cell();
        cell.populate();
        cell.die();

        assertFalse(cell.isAlive());
    }

    @Test
    void populate_AddNeighboursAliveCount_WhenCellIsSetToAlive() {
        Cell cell1 = new Cell();
        Cell cell2 = new Cell();

        cell1.setNeighbours(List.of(cell2));
        cell2.populate();

        assertEquals(1, cell1.aliveNeighbours());
    }
}
