/*
 * A palindrome is any word, phrase, or sentence that reads the same
 * forward and backward. Here are some well-known palindromes.
 *      Able was I ere I saw Elba
 *      A man a plan, a canal, Panama
 *      Desserts I stressed
 *      Kayak
 * Write a boolean method that uses recursion to determine whether a String
 * argument is a palindrome. The method should return true if the argument
 * reads the same forward and backward. Demonstrate the method in a program.
 */
package java_text.chapter_16.challenge_5;

/**
 *
 * @author Karl
 */
public class PalindromeDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(palindrome("abcba"));
    }
    
    public static boolean palindrome(String str) {
        if (str.length() <= 1)
            return true;
        else if (str.charAt(0) != (str.charAt(str.length()-1)))
            return false;
        else 
            return palindrome(str.substring(1, str.length()-1));
    }
    
}
