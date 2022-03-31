package pl.limescode.lesson6;

abstract class Animal {

    private static int counter = 0;

    public Animal() {
        counter++;
    }

    public void run(int length) {
        System.out.println("Животное класса " + this.getClass().getSimpleName() + " пробежало " + length + " м.");
    }

    public void swim(int length) {
        System.out.println("Животное класса " + this.getClass().getSimpleName() + " проплыло " + length + " м.");
    }

    public static int getCounter() {
        return counter;
    }

}
