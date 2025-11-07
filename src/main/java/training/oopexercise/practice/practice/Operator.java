package training.oopexercise.practice.practice;

public class Operator {
    int power;
    int speed;
    int health;
    int score;
    String name;

    public Operator(){
        this.health = 100;
        this.score = 0;
        System.out.println("created");
    }
    public Operator(String name){
        this.score = 50;
        this.name = name;
        System.out.println("created with +50 score");
    }
    public void fight(){
        System.out.println(this.name + " is defending: defence power = " + this.power);
    }
    public void defence(){
        System.out.println(this.name + " is defending: defence power = " + this.power);
    }
}
