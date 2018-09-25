/*
 * Write a method named maxElement, which returns the largest value in 
 * an array that is passed as an argument. The method should use recursion
 * to find the largest element. Demonstrate the method in a program.
 */
package java_text.chapter_16.challenge_4;

/**
 *
 * @author Karl
 */
public class RecursiveArrayMaxValue {

    /**
     * Main method. Defines the array and calls the maxElement method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = {-40, 5, 7, 8, 3, 1, 10, 7};
        int index = input.length - 1;
        System.out.println(maxElement(input, index));
    }
    
    /**
     * maxElement method returns the largest value in the array.
     * @param input
     * @param index
     * @return 
     */
    private static int maxElement(int[] input, int index) {
        
        if (index == 0)
                return input[0];
        else 
            return Math.max(input[index], maxElement(input, index-1));
    }
}

