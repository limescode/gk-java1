package pl.limescode.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    private static final int SIZE = 3;
    private static final char MARK_X = 'X';
    private static final char MARK_O = '0';
    private static final char EMPTY_CELL = '∙';
    private static final char[][] BOARD = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initBoard();
        printBoard();
        while (true) {

            humanTurn();
            if (isVictory(MARK_X)) {
                System.out.println("Пользователь победил");
                break;
            } else if (isDraw()) {
                break;
            }

            computerTurn();
            if (isVictory(MARK_O)) {
                System.out.println("Компьютер победил");
                break;
            } else if (isDraw()) {
                break;
            }
        }
    }

    private static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(BOARD[i], EMPTY_CELL);
        }
    }

    private static void printBoard() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(BOARD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isDraw() {
        if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно");
            } else if (BOARD[x][y] != EMPTY_CELL) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);
        BOARD[x][y] = MARK_X;
        printBoard();
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            System.out.println("Компьютер подобрал координаты: " + (x + 1) + " " + (y + 1));
        } while (BOARD[x][y] != EMPTY_CELL);
        BOARD[x][y] = MARK_O;
        System.out.println();
        printBoard();
    }

    private static boolean isVictory(char symbol) {
        int diagonalLeft = 0;
        int diagonalRight = 0;
        for (int i = 0; i < SIZE; i++) {
            int counterHorizontal = 0;
            int counterVertical = 0;
            for (int j = 0; j < SIZE; j++) {
                if (BOARD[i][j] == symbol) {
                    counterHorizontal++;
                }
                if (BOARD[j][i] == symbol) {
                    counterVertical++;
                }
                if (i == j && BOARD[i][j] == symbol) {
                    diagonalLeft++;
                }
                if (i + j + 1 == SIZE && BOARD[i][j] == symbol) {
                    diagonalRight++;
                }
            }
            if (counterHorizontal == SIZE || counterVertical == SIZE || diagonalLeft == SIZE || diagonalRight == SIZE) {
                return true;
            }
        }
        return false;
    }

}
