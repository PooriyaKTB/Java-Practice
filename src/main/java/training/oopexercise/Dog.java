package training.oopexercise;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! 🐾");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
}
