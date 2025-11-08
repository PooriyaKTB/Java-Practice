package training.oopexercise.practice.Animal;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Sparrow sparrow = new Sparrow();
        System.out.println(sparrow.name);

//        chicken.fly(); // Not working
        sparrow.fly();
        isFlyable(sparrow);


        Flyable fly1 = new Sparrow();
        fly1.fly();
//        fly1.name(); // Not working
    }
    public static void isFlyable(Flyable flyable){
        System.out.println("Yeah!");
    }

}
