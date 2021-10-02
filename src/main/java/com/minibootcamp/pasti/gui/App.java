package com.minibootcamp.pasti.gui;

import com.minibootcamp.pasti.engine.GameOfLife;

import java.awt.Point;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    final int ROWS = 32;
    final int COLS = 32;
    GameOfLife game;

    public void run() {
        initialize();
        simulate();
    }

    private void simulate() {
        try {
            while (true) {
                print(game.show());
                game.lifeCycle();

                TimeUnit.MILLISECONDS.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Application has ended!");
        }
    }

    private void initialize() {
        List<Point> initialAliveCells = List.of(
            new Point(3, 3), new Point(3, 4), new Point(3, 5)
        );
        game = new GameOfLife(ROWS, COLS, initialAliveCells);
    }

    private void print(boolean[][] cells) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                output.append(cells[i][j] ? "#" : ".");
            }
            output.append("\n");
        }

        clearScreen();
        System.out.println(output);
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
