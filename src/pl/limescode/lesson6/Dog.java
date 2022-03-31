package pl.limescode.lesson6;

public class Dog extends Animal {

    @Override
    public void run(int length) {
        if (length > 500)
            System.out.println("Собака не может пробежать больше 500 м.");
        else
            super.run(length);
    }

    @Override
    public void swim(int length) {
        if (length > 10)
            System.out.println("Собака не может проплыть больше 10 м.");
        else
            super.swim(length);
    }
}
