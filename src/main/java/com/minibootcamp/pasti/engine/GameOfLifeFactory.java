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
            case 6:
                return blinker();
            case 7:
                return toad();
            case 8:
                return beacon();
            case 9:
                return pulsar();
            case 10:
                return pentaDecathlon();
            case 11:
                return glider();
            case 12:
                return lightweightSpaceship();
            case 13:
                return middleweightSpaceship();
            case 14:
                return heavyweightSpaceship();
            case 15:
                return theRPentomino();
            case 16:
                return diehard();
            case 17:
                return acorn();
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

    private static List<Point> blinker() {
        return List.of(
            new Point(11, 10), new Point(11, 11), new Point(11, 12)
        );
    }

    private static List<Point> toad() {
        return List.of(
            new Point(11, 11), new Point(11, 12), new Point(11, 13),
            new Point(12, 10), new Point(12, 11), new Point(12, 12)
        );
    }

    private static List<Point> beacon() {
        return List.of(
            new Point(10, 10), new Point(10, 11),
            new Point(11, 10), new Point(11, 11),
            new Point(12, 12), new Point(12, 13),
            new Point(13, 12), new Point(13, 13)
        );
    }

    private static List<Point> pulsar() {
        return List.of(
            new Point(11, 13), new Point(11, 14), new Point(11, 15),
            new Point(11, 19), new Point(11, 20), new Point(11, 21),
            new Point(13, 11), new Point(13, 16),
            new Point(13, 18), new Point(13, 23),
            new Point(14, 11), new Point(14, 16),
            new Point(14, 18), new Point(14, 23),
            new Point(15, 11), new Point(15, 16),
            new Point(15, 18), new Point(15, 23),
            new Point(16, 13), new Point(16, 14), new Point(16, 15),
            new Point(16, 19), new Point(16, 20), new Point(16, 21),
            new Point(18, 13), new Point(18, 14), new Point(18, 15),
            new Point(18, 19), new Point(18, 20), new Point(18, 21),
            new Point(19, 11), new Point(19, 16),
            new Point(19, 18), new Point(19, 23),
            new Point(20, 11), new Point(20, 16),
            new Point(20, 18), new Point(20, 23),
            new Point(21, 11), new Point(21, 16),
            new Point(21, 18), new Point(21, 23),
            new Point(23, 13), new Point(23, 14), new Point(23, 15),
            new Point(23, 19), new Point(23, 20), new Point(23, 21)
        );
    }

    private static List<Point> pentaDecathlon() {
        return List.of(
            new Point(13, 14),
            new Point(14, 13), new Point(14, 15),
            new Point(15, 12), new Point(15, 16),
            new Point(16, 12), new Point(16, 16),
            new Point(17, 12), new Point(17, 16),
            new Point(18, 12), new Point(18, 16),
            new Point(19, 12), new Point(19, 16),
            new Point(20, 12), new Point(20, 16),
            new Point(21, 13), new Point(21, 15),
            new Point(22, 14)
        );
    }

    private static List<Point> glider() {
        return List.of(
            new Point(10, 12),
            new Point(11, 10), new Point(11, 12),
            new Point(12, 11), new Point(12, 12)
        );
    }

    private static List<Point> lightweightSpaceship() {
        return List.of(
            new Point(10, 10), new Point(10, 13),
            new Point(11, 14),
            new Point(12, 10), new Point(12, 14),
            new Point(13, 11), new Point(13, 12), new Point(13, 13),
            new Point(13, 14)
        );
    }

    private static List<Point> middleweightSpaceship() {
        return List.of(
            new Point(10, 12),
            new Point(11, 10), new Point(11, 14),
            new Point(12, 15),
            new Point(13, 10), new Point(13, 15),
            new Point(14, 11), new Point(14, 12), new Point(14, 13),
            new Point(14, 14), new Point(14, 15)
        );
    }

    private static List<Point> heavyweightSpaceship() {
        return List.of(
            new Point(10, 12), new Point(10, 13),
            new Point(11, 10), new Point(11, 15),
            new Point(12, 16),
            new Point(13, 10), new Point(13, 16),
            new Point(14, 11), new Point(14, 12), new Point(14, 13),
            new Point(14, 14), new Point(14, 15), new Point(14, 16)
        );
    }

    private static List<Point> theRPentomino() {
        return List.of(
            new Point(10, 11), new Point(10, 12),
            new Point(11, 10), new Point(11, 11),
            new Point(12, 11)
        );
    }

    private static List<Point> diehard() {
        return List.of(
            new Point(10, 16),
            new Point(11, 10), new Point(11, 11),
            new Point(12, 11),
            new Point(12, 15), new Point(12, 16), new Point(12, 17)
        );
    }

    private static List<Point> acorn() {
        return List.of(
            new Point(10, 11),
            new Point(11, 13),
            new Point(12, 10), new Point(12, 11),
            new Point(12, 14), new Point(12, 15), new Point(12, 16)
        );
    }
}
