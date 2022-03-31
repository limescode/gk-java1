package pl.limescode.lesson6;

public class Cat extends Animal {

    @Override
    public void run(int length) {
        if (length > 200)
            System.out.println("Кот не может пробежать больше 200 м.");
        else
            super.run(length);
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать.");
    }
}
