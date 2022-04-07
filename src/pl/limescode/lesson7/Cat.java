package pl.limescode.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean bellyful;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            bellyful = true;
        }
    }

    public void showStatus() {
        if (bellyful) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
