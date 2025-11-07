package training.oopexercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        Cat cat1 = new Cat("Mimi");

        dog1.makeSound();
        cat1.makeSound();

        dog1.eat("bone");
        cat1.eat("fish");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);

        System.out.println("\n--- All animals make sounds ---");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
