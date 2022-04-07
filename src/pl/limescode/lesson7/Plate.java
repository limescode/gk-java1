package pl.limescode.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("В тарелке недостаточно корма");
            return false;
        } else {
            food -= n;
            System.out.println("Из тарелки было съедено " + n + " единиц корма");
            return true;
        }
    }

    public void info() {
        System.out.println("В тарелке находится " + food + " единиц корма");
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        this.food += food;
        System.out.println("Тарелка пополнилась " + food + " единицами корма");
    }
}
