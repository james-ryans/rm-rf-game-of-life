package com.minibootcamp.pasti.grid;

import java.util.List;

public class Cell {
    private boolean isAlive;
    private List<Cell> neighbours;

    public Cell() {
        isAlive = false;
        neighbours = List.of();
    }

    public void setNeighbours(List<Cell> neighbours) {
        this.neighbours = neighbours;
    }

    public List<Cell> getNeighbours() {
        return neighbours;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void populate() {
        isAlive = true;
    }

    public void die() {
        isAlive = false;
    }
}
