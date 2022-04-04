package pl.limescode.lesson6;

public class Lesson6 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.run(300);
        dog1.swim(8);

        Dog dog2 = new Dog();
        dog2.run(600);
        dog2.swim(12);

        Cat cat1 = new Cat();
        cat1.run(150);
        cat1.swim(40);

        Cat cat2 = new Cat();
        cat2.run(250);
        cat2.swim(70);

        System.out.println("Общее количество животных: " + Animal.getCounter());
    }

}
