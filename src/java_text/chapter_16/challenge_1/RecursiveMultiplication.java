/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_16.challenge_1;

/**
 * RecursiveMultiplication will call a method recursively that will multiply
 * two integer by using repeated addition.
 * @author Karl
 */
public class RecursiveMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println(multiply(7,9));
    
    }
    
    private static int multiply(int x, int y) {
       
        if (x == 0)
            return 0;
        else
            return y + multiply(x-1,y);
      
    }  
}
