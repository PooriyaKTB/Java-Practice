package training.oopexercise.practice.Animal;

public class Chicken extends Bird{
    String name = "Chicken";

    @Override
    public void fly() {
        System.out.println("Not able to fly");
    }
}
