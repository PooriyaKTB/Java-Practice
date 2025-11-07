package training.examples.animals;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Baxter");
        greet(dog);

        int result = addition(10, 20);
        System.out.println(result);
    }


    /**
     * Says hello to the given animal.
     *
     * @param animal the animal to greet
     */
    private static void greet(Animal animal) {
        System.out.println("Hello " + animal.getName() + "!");
    }


    public static int addition(int a, int b) {
        return (a + b);
    }


}
