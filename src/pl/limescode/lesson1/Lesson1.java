package pl.limescode.lesson1;

public class Lesson1 {

    public static void main(String[] args) {
        System.out.println();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        printHeaderInfo("printThreeWords");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        printHeaderInfo("checkSumSign");
        int x = 7;
        int y = 8;
        int sum = x + y;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        printHeaderInfo("printColor");
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        printHeaderInfo("compareNumbers");
        int a = 23;
        int b = 37;
        if (a > b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void printHeaderInfo(String methodName) {
        System.out.println("===============================================");
        System.out.println(methodName + "() result:");
    }
}
