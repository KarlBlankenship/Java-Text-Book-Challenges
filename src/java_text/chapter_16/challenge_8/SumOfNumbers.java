/*
 * Write a method that accepts an integer argument and returns the sum
 * of all of its integers from 1 up to the number passed as an argument.
 * For example, if 50 is passed as an argument, the method will return
 * the sum of 1, 2, 3, 4, ... 50. Use recursion to calculate the sum.
 * Demonstrate the method in a program.
 */
package java_text.chapter_16.challenge_8;

/**
 * SumOfNumbers class will contain the main method for executing the
 * program as well as a private method for performing the summation 
 * recursively.
 * @author Karl
 */
public class SumOfNumbers {

    /**
     * This is the main class which will initialize variable and call
     * the summation method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize number to sum up to.
        int x = 3792;
        // Display the summation result.
        System.out.println("The sum of integers from 1 to " + x +
                " is " + summation(x) + ".");
    }
    
    /**
     * summation method accepts an integer and sums all the integers from
     * 1 to the input integer.
     * @param x input integer
     * @return integer sum
     */
    private static int summation(int x) {
        if (x == 1)
            return 1;
        else 
            return x + summation(x - 1);
    }
    
}
