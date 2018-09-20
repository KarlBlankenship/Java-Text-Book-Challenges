/*
 * Write a recursive boolean method named isMember. The method should search an
 * array for a specified value, and return true if the value is found in the 
 * array, or false if the value is not found in the array. Demonstrate the
 * method in a program
 */
package java_text.chapter_16.challenge_2;

/**
 * RecursiveSearch contains the main method and will contain the isMember
 * method for performing a recursive search on an array.
 * @author Karl
 */
public class RecursiveSearch {

    /**
     * The main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};  // Array to be searched.
        int searchFor = 10; // Value to search for.
        
        // Call recursive method and display result of seach.
        System.out.println(isMember(array, searchFor, array.length - 1));
    }
    
    /**
     * The isMember method will accept an array of integers, a value to
     * search for and the initial array length.
     * @param x
     * @param value
     * @param index
     * @return 
     */
    public static boolean isMember(int[] x, int value, int index) {
        // Method will seach from the end to the beginning.
        // This is the base case, index 0 will be either true or false.
        if(index == 0) {
            if(x[index] == value)
                return true;
            else
                return false;
        }
        if(x[index] == value)
            return true;  // Returns true as soon as the value is located.
        else
            return isMember(x, value, index-1); // Recursive call if value was
                                                // not found passing in the
                                                // next smallest index.
    }    
}
