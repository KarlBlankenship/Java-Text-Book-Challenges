/*
 * Write a method named maxElement, which returns the largest value in 
 * an array that is passed as an argument. The method should use recursion
 * to find the largest element. Demonstrate the method in a program.
 */
package jave_text.chapter_16.challenge_4;

/**
 *
 * @author Karl
 */
public class RecursiveArrayMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    private static String maxElement(String input) {
        
        if (input.length() == 1)
                return String.valueOf(input.charAt(0));
        else
                return String.valueOf(input.charAt(input.length()-1)) + 
                        maxElement(input.substring(0,input.length()-1));
        
    }
}
