package training.oopexercise.practice.Animal;

public class Sparrow extends Bird implements Flyable{
    String name = "Sparrow";
//    public Sparrow(String name){
//        this.name = name;
//    }
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
