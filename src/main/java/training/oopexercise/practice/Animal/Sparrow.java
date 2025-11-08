package training.oopexercise.practice.Animal;

public class Sparrow extends Bird implements Flyable{
    String name = "Sparrow";

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
