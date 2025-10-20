package training.exercises.exercise1;

/**
 * Performs mathematical operations.
 */
class Maths {

  /**
   * Adds two numbers together.
   *
   * @param a the first number to add
   * @param b the second number to add
   * @return the result of adding the two numbers
   */
  int add(int a, int b) {
    // TODO implement this method so that it returns the result of adding a and b
    return a+b;
  }


  /**
   * Subtracts one number from another.
   *
   * @param a the number to subtract from
   * @param b the number to be subtracted
   * @return the result of subtracting b from a
   */
  int subtract(int a, int b) {
    // TODO return the result of subtracting b from a
    return a-b;
  }


  /**
   * Multiplies two numbers together.
   *
   * @param a the first number to multiply
   * @param b the second number to multiply
   * @return the result of multiplying the two numbers together
   */
  long multiply(long a, long b) {
    // TODO compute the product of a and b
    return a*b;

    // TODO to pass *all* the test cases for this one you might have to change some of the types
  }


  /**
   * Divides one number by another. Discards any remainder.
   *
   * @param a the number to divide
   * @param b the number to divide by
   * @return the result of dividing a by b
   */
  int divide(int a, int b) {
    // TODO compute a divided by b
    if (b!=0) {
        return a/b;
    }
      return a;
  }

}
