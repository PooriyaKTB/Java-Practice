package training.oopexercise.practice.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal("Chico", 3, 18);
        System.out.println(dog.name);
        dog.sleep();
        dog.eat();

        Fish fish = new Fish("Gold", 2,1);
        System.out.println(fish.name);
        fish.swimming();
        fish.eat();
    }
}
