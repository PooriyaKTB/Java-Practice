package training.oopexercise.practice.practice;

public class Main {
    public static void main(String[] args) {

    Operator ninja = new Operator();
    ninja.name = "Chi Han";
    ninja.power = 1200;
    ninja.speed = 1300;
    ninja.fight();
    System.out.println(ninja.health);

    Operator assassin = new Operator();
    assassin.name = "Pooriya";
    assassin.power = 50000;
    assassin.speed = 4950;
    assassin.defence();


    }
}
