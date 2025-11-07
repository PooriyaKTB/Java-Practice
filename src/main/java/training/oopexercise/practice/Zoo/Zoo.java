package training.oopexercise.practice.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Chico");
        dog.setAge(4);
        dog.setWeight(18);
        System.out.println(dog.getName());
        dog.getWeight();
        dog.sleep();
        dog.eat();

        Fish fish = new Fish();
        fish.setName("Goldy");
        fish.setAge(2);
        fish.setWeight(1);
        System.out.println(fish.getName());
        fish.getAge();
        fish.setAge(3);
        fish.getAge();
        fish.swimming();
        fish.eat();
    }
}
