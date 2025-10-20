package training.exercises.exercise2;

/**
 * Uses loops to deal with sequences of numbers.
 */
class Loops {

  /**
   * Prints the natural numbers between 1 and the given limit (inclusive). One number per line.
   *
   * @param limit the number at which to stop counting (inclusive)
   */
  void countUpTo(int limit) {
//      int x = 1;
//      while (x < limit){
//          System.out.println(x);
//          ++x;
//      }

    // TODO surely there is a better way to do this...
      for (int i=1; i<= limit;++i){
          System.out.println(i);

      }
  }


  /**
   * Prints multiples of the given number (starting with the number itself) up to the given limit.
   *
   * For example, given the arguments 3 and 15 this should print:
   * <pre>
   *   3
   *   6
   *   9
   *   12
   *   15
   * </pre>
   *
   * @param multiple the number for which to print multiples
   * @param limit the number at which to stop (inclusive)
   */
  void countInMultiples(int multiple, int limit) {
    // TODO implement method
      for (int i=multiple; i <= limit; i += multiple){
          System.out.println(i);
      }
  }


  /**
   * Returns the sum of the first n square numbers.
   *
   * @param n the number of square numbers to sum
   * @return the sum of the first n square numbers
   */
  int sumOfSquares(int n) {
    // TODO implement
    int sum = 0;
    for (int i=0; i<=n; ++i){
        sum = sum + i*i;
    }
    return sum;
  }


  /**
   * Returns the mean average of the first n natural numbers.
   *
   * @param n the number of numbers to average
   * @return the average of the first n natural numbers
   */
  double average(int n) {
    // TODO use a loop to calculate the average
    float all = 0;
    for(int i = 1; i<=n; ++i){
        all =all+ i;
    }
    return all/n;
  }


  /**
   * Prints the numbers from 1 to n, but stops after printing 10 if 'breakAtTen' is true.
   *
   * @param n the number to count up to (inclusive)
   * @param breakAtTen whether to stop after printing 10
   */
  void maybeBreakAtTen(int n, boolean breakAtTen) {
      // TODO use a loop with the 'break' keyword
      if (breakAtTen) {
          for (int i = 1; i <= 10; ++i) {
              System.out.println(i);
          }
      } else {
          for (int i = 1; i <= n; ++i) {
              System.out.println(i);
          }
      }
  }

  /**
   * Prints the numbers from 1 to 10 but skips out the given number.
   *
   * @param numberToSkip the number to skip
   */
  void countToTenSkipping(int numberToSkip) {
    // TODO use a loop with the 'continue' keyword
      for (int i=1; i<=10; ++i){
          if (i == numberToSkip) continue;
          else System.out.println(i);
      }
  }


}
