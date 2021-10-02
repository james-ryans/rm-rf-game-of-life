package com.minibootcamp.pasti.engine;

import java.awt.Point;
import java.io.IOException;
import java.util.List;

public class GameOfLifeFactory {

    public static List<Point> generatePattern(int pattern) throws IOException {
        switch (pattern) {
            case 1:
                return block();
            case 2:
                return beeHive();
            case 3:
                return loaf();
            case 4:
                return boat();
            case 5:
                return tub();
            default:
                throw new IOException("Number not recognized.");
        }
    }

    private static List<Point> block() {
        return List.of(
            new Point(10, 10), new Point(10, 11),
            new Point(11, 10), new Point(11, 11)
        );
    }

    private static List<Point> beeHive() {
        return List.of(
            new Point(10, 11), new Point(10, 12),
            new Point(11, 10), new Point(11, 13),
            new Point(12, 11), new Point(12, 12)
        );
    }

    private static List<Point> loaf() {
        return List.of(
            new Point(10, 11), new Point(10, 12),
            new Point(11, 10), new Point(11, 13),
            new Point(12, 11), new Point(12, 13),
            new Point(13, 12)
        );
    }

    private static List<Point> boat() {
        return List.of(
            new Point(10, 10), new Point(10, 11),
            new Point(11, 10), new Point(11, 12),
            new Point(12, 11)
        );
    }

    private static List<Point> tub() {
        return List.of(
            new Point(10, 11),
            new Point(11, 10), new Point(11, 12),
            new Point(12, 11)
        );
    }
}
