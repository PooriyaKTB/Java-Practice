package training.oopexercise.practice;


public class Main {
    public static void main(String[] args) {
        needs("pooriya", "fereshteh", "Nathan");
    }

    public static void needs(String ... needs) {
         for (String need : needs){
             System.out.println(need);
         }
    }
}
