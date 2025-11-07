package training.oopexercise.practice;

public class Main {
    public static void main(String[] args) {
        avg(10, 20, 30, 40, 50);
    }

    public static void avg(int... grades) {
        int avg = 0;
        for (int grade : grades) {
            avg += grade;
        }
        System.out.println(avg);
        System.out.println(avg / grades.length);

    }
}
