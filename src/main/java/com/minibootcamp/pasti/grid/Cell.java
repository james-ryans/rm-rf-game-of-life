package com.minibootcamp.pasti.grid;

public class Cell {
    private boolean isAlive;

    public Cell() {
        isAlive = false;
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
