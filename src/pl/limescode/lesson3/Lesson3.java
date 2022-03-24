package pl.limescode.lesson3;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(10, 13);
        task6();
        int[] array7 = {1, 1, 1, 2, 1};
        System.out.println("Task7 | Result: " + task7(array7));
    }

    public static void task1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray("Task1 | Array before", array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0)
                array[i] = 1;
        }
        printArray("Task1 | Array after", array);
    }

    public static void task2() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++)
            array[i] = i + 1;
        printArray("Task2 | Generated array", array);
    }

    public static void task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray("Task3 | Array before", array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        printArray("Task3 | Array after", array);
    }

    public static void task4() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j + 1 == matrix.length)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }
        printMatrix("Task4 | Generated matrix", matrix);
    }

    public static int[] task5(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        printArray("Task5 | Generated array", array);
        return array;
    }

    public static void task6() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        printArray("Task6 | Array", array);
        System.out.println("Task6 | Max value: " + max);
        System.out.println("Task6 | Min value: " + min);
    }

    public static boolean task7(int[] array) {
        int totalSum = Arrays.stream(array).sum();
        int aggregatedSum = 0;
        for (int i = 0; i < array.length; i++) {
            aggregatedSum += array[i];
            if (aggregatedSum * 2 == totalSum) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(String message, int[] array) {
        System.out.println(message + ": " + Arrays.toString(array));
    }

    public static void printMatrix(String message, int[][] matrix) {
        System.out.println(message + ": ");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

}
