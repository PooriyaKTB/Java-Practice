package training.oopexercise.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println(BuyWine(80));
    }

    public static String BuyWine(int age) {
        if (age >= 18 && age <60){
            return "You can buy it";
        } else {
            return "Your can't buy it";
        }
    }
}
