package pl.limescode.lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        Cat cat1 = new Cat("Барсик", 5);
        cat1.toString();
        cat1.eat(plate);
        cat1.showStatus();

        Cat cat2 = new Cat("Обжора", 100);
        cat2.toString();
        cat2.eat(plate);
        cat2.showStatus();

        plate.addFood(10);

        Cat cat3 = new Cat("Пушистик", 20);
        cat3.toString();

        Cat cat4 = new Cat("Маруся", 30);
        cat4.toString();

        Cat[] cats = new Cat[2];
        cats[0] = cat3;
        cats[1] = cat4;
        Lesson7.feedCats(cats, plate);

        plate.info();
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.showStatus();
        }
    }

}
