/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_11.challenge_1;

/**
 * TestScores class accepts an array and will throw an IllegalArgumentException
 * as needed.
 * @author Karl
 */
public class TestScores {
    
    // Create and array of scores.
    int[] testScores;

    /**
     * Default Constructor.
     */
    public TestScores() {
    }

    /**
     * Overload constructor that accepts an array of test scores.
     * @param testScores 
     */
    public TestScores(int[] testScores) {
        this.testScores = testScores;
    }
    
    public double averageTestScore(int[] ts) {
        double average = 0; // Initialize the variable for the average.
        int sum = 0; // Sum of array.
        
        // Sum all the test scores in the array.
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < 0 || ts[i] > 100) {
                throw new IllegalArgumentException("One of your test scores" + 
                        " is negative or greater than 100!");
            }
            sum = sum + ts[i];
        }
        
        // Calculate the average.
        average = sum / ts.length;
        
        // Return the average.
        return average; 
    }
    
    
}
