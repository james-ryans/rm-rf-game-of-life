# Game Of Life

The Game of Life, also known simply as Life, is a cellular automaton devised 
by the British mathematician John Horton Conway in 1970. 
It is a zero-player game, meaning that its evolution is determined 
by its initial state, requiring no further input. 
One interacts with the Game of Life by creating an initial configuration 
and observing how it evolves. It is Turing complete and can simulate 
a universal constructor or any other Turing machine.

The universe of the Game of Life is an infinite, two-dimensional orthogonal 
grid of square cells, each of which is in one of two possible states, 
live or dead, (or populated and unpopulated, respectively). 
Every cell interacts with its eight neighbours, which are the cells that are 
horizontally, vertically, or diagonally adjacent. 
At each step in time, the following transitions occur:
1. Any live cell with two or three live neighbours survives.
2. Any dead cell with three live neighbours becomes a live cell.
3. All other live cells die in the next generation. Similarly, all other dead cells stay dead.

## Prerequisites

1. Gradle 7.1
2. JDK 11.0.12
3. Junit 5.8.0

## How to Test

Use the Gradle Wrapper to run the tests.
```bash
./gradlew test
```

## How to Run

Use the Gradle Wrapper to run the app.
```bash
./gradlew run --console=plain
```

## Demo

![Glider Demo](./src/main/resources/glider-demo.gif)
