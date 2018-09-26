/*
 * Write a method that uses recursion to raise a number to a power.
 * The method shouldaccept two arguments: the number to be raised
 * and the exponent. Assume that the exponentis a nonnegative integer.
 * Demonstrate the method in a program.
 */
package java_text.chapter_16.challenge_7;

/**
 * RecursivePower class for computing exponents.
 * @author Karl
 */
public class RecursivePower {

    /**
     * Main method. Executes and calls power method with number 
     * and exponent arguments.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    
    /**
     * power method accepts a number and exponent and raises the 
     * number to the exponent using recursion.
     * @param number
     * @param exponent
     * @return number raised to the exponent.
     */
    private static int power(int number, int exponent) {
       
        if (exponent == 0)
            return 1;
        else
            return number * power(number,exponent-1);
      
    }  
}
