package training.exercises.exercise4;

enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true)
  ; // TODO add some values -- don't worry about the method below for now. We'll use that in a bit.
    private boolean weekend;

    DayOfWeek(boolean weekend){
        this.weekend = weekend;
    }

  /**
   * Returns true if this day is part of the weekend; false if it's a weekday.
   */
  boolean isWeekend() {
    return this.weekend;
  }

}
