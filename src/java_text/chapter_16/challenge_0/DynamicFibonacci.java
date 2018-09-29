/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_16.challenge_0;

/**
 * This program will calculate nth fibonacci number by utilizing memoizatiom
 * and dynamic programming. This program will also compare the number of times
 * the fibonacci method has to be called with and without dynamic programming.
 * @author Karl
 */
public class DynamicFibonacci {
    
    public static int fib = 20;
    public static int[] memo = new int[fib+1];
    public static long counter1 = 0;
    public static long counter2 = 0;
    
    
    /**
     * Main method calls fibonacci methods.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        System.out.println("The " + fib + "th Fibonacci number is " +
                fibonacci(fib) + "." + "  Completed in " + counter2 +
                " cycles without memoization.");
        System.out.println("The " + fib + "th Fibonacci number is " +
                fibonacciMemo(fib) + "." + "  Completed in " + counter1 +
                " cycles with memoization.");
              
    }
    
    /**
     * fibonacciMemo method uses memoization.
     * @param n
     * @return 
     */
    private static int fibonacciMemo(int n) {
        counter1+=1;
          
        if(n == 0 || n == 1)
            return n;
        else {
            int f = memo[n];
            if (f == 0) {
            f = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
            memo[n] = f;  
            }
        return f;
        }
    }
    
    /**
     * fibonacci method does not use memoization.
     * @param n
     * @return 
     */
    private static int fibonacci(int n) {
        counter2+=1;
        
        if(n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
