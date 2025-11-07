package training.oopexercise.practice.Zoo;

public class Animal {
    private String name;
    private int age;
    private int weight;

//    public Animal(String name, int age, int weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
    public void setName(String name){
        if (name != null) this.name = name;
        else System.out.println("Not valid");
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if (age > 0 && age <=100) this.age = age;
        else System.out.println("Not valid");
    }
    public void getAge(){
        System.out.println(this.age + " years old");
    }
    public void setWeight(int weight){
        if (weight > 0 && weight <= 1000) this.weight = weight;
        else System.out.println("Not valid");
    }
    public void getWeight(){
        System.out.println(this.weight + "KG");
    }
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
