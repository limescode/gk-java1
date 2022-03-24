package pl.limescode.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2022));
    }

    public static boolean task1(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 20);
    }

    public static void task2(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task3(int x) {
        return (x < 0);
    }

    public static void task4(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return true;
    }

}
