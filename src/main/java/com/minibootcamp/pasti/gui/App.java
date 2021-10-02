package com.minibootcamp.pasti.gui;

import com.minibootcamp.pasti.engine.GameOfLife;
import com.minibootcamp.pasti.engine.GameOfLifeFactory;

import java.awt.Point;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    final int ROWS = 32;
    final int COLS = 32;
    GameOfLife game;

    public void run() {
        try {
            initialize();
            simulate();
        } catch (IOException e) {
            System.out.println("Number not recognized.");
        }
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

    private void initialize() throws IOException {
        List<Point> initialPattern = welcomingInput();
        game = new GameOfLife(ROWS, COLS, initialPattern);
    }

    private List<Point> welcomingInput() throws IOException {
        clearScreen();
        System.out.println("Welcome to Conway's Game Of Life!");
        System.out.println("Press Ctrl+C to stop.");
        System.out.println();
        System.out.println("Still lifes");
        System.out.println("1. Block");
        System.out.println("2. Bee-hive");
        System.out.println("3. Loaf");
        System.out.println("4. Boat");
        System.out.println("5. Tub");
        System.out.println();
        System.out.println("Oscillators");
        System.out.println("6. Blinker");
        System.out.println("7. Toad");
        System.out.println("8. Beacon");
        System.out.println("9. Pulsar");
        System.out.println("10. Penta-decathlon");
        System.out.println();
        System.out.println("Spaceships");
        System.out.println("11. Glider");
        System.out.println("12. Light-weight Spaceship");
        System.out.println("13. Middle-weight Spaceship");
        System.out.println("14. Heavy-weight Spaceship");
        System.out.println();
        System.out.println("Methuselahs (Chaos)");
        System.out.println("15. The R-pentomino");
        System.out.println("16. Diehard");
        System.out.println("17. Acorn");
        System.out.println();
        System.out.print("Pick a number: ");

        Scanner scanner = new Scanner(System.in);
        int initialNumber = scanner.nextInt();
        scanner.close();

        return GameOfLifeFactory.generatePattern(initialNumber);
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
