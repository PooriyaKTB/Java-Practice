package training.oopexercise.practice;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(BuyWine(80));
//    }
//
//    public static String BuyWine(int age) {
//        if (age >= 18 && age <60){
//            return "You can buy it";
//        } else {
//            return "Your can't buy it";
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        needs("pooriya", "fereshteh", "Nathan");
//    }
//
//    public static void needs(String ... needs) {
//         for (String need : needs){
//             System.out.println(need);
//         }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        avg(10, 20, 30, 40, 50);
//    }
//
//    public static void avg(int... grades) {
//        int avg = 0;
//        for (int grade : grades) {
//            avg += grade;
//        }
//        System.out.println(avg);
//        System.out.println(avg / grades.length);
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        concat("Pooriya", "Ketabi");
        concat(1, 2, 3, 4, 5);
        concat(1.2, 2.3, 3.4);
    }

    public static void concat(String... str) {
        String result = "";
        for (String strs : str) {
            result += strs + " ";
        }
        System.out.println(result);
    }

    public static void concat(int... intg) {
        int result = 0;
        for (int ints : intg) {
            result += ints;
        }
        System.out.println(result);
    }

    public static void concat(double... dub) {
        double result = 0;
        for (double dubs : dub) {
            result += dubs;
        }
        System.out.println(result);
    }
}