//package Practice.Enum;
//
//public class Enum {
//    enum Season {
//            Winter, Spring, Fall, Summer;
//        }
//    public static void main(String[] args) {
//        Season season = Season.Fall;
//        System.out.println(season);
//        System.out.println(season.ordinal() );
//    }
//}
//
//package training.exercises.exercise4;
//
//enum DayOfWeek {
//    MONDAY("weekday"),
//    TUESDAY("weekday"),
//    WEDNESDAY("weekday"),
//    THURSDAY("weekday"),
//    FRIDAY("weekday"),
//    SATURDAY("weekend"),
//    SUNDAY("weekend")
//    ; // TODO add some values -- don't worry about the method below for now. We'll use that in a bit.
//
//
//    private final String weekDay;
//    DayOfWeek(String weekDay) {
//        this.weekDay = weekDay;
//    }
//
//    /**
//     * Returns true if this day is part of the weekend; false if it's a weekday.
//     */
//    boolean isWeekend(training.exercises.exercise4.DayOfWeek dayOfWeek) {
//        if (dayOfWeek == training.exercises.exercise4.DayOfWeek.MONDAY){}
//
//        return false;
//    }
//
//}
/// /public enum DayOfWeek {
/// /    MONDAY("weekday"),
/// /    TUESDAY("weekday"),
/// /    SATURDAY("weekend");
/// /    private final String type;
/// /    // Constructor
/// /    DayOfWeek(String type) {
/// /        this.type = type;
/// /    }
/// /    public String getType() {
/// /        return type;
/// /    }
/// /}
//
//
//
//
package Practice.Enum;

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY; // TODO add some values -- don't worry about the method below for now. We'll use that in a bit.
//
//    DayOfWeek(DayOfWeek day) {
//        System.out.println(day);
//    }

    /**
     * Returns true if this day is part of the weekend; false if it's a weekday.
     */
    boolean isWeekend() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}
