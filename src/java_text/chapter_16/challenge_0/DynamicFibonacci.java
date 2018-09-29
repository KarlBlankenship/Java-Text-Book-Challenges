/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_16.challenge_0;

/**
 * This program will calculate nth fibonacci number by utilizing memoizatiom
 * and dynamic programming.
 * @author Karl
 */
public class DynamicFibonacci {

    /**
     * Main method calls fibonacci method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int fib = 5;
        System.out.println("The " + fib + "th Fibonacci number is " +
                fibonacci(fib) + ".");
        
    }
    
    private static int fibonacci(int n) {
        
        if(n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
