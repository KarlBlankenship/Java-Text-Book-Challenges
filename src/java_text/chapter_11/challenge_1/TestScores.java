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
    
    /**
     * This method will return an average test score and will throw an 
     * exception if one of the test scores is invalid.
     * @param testScores
     * @return average.
     */
    public double averageTestScore() {
        double average; // Initialize the variable for the average.
        int sum = 0; // Sum of array.
        
        // Sum all the test scores in the array.
        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] < 0 || testScores[i] > 100) {
                throw new IllegalArgumentException("One of your test scores" + 
                        " is negative or greater than 100!");
            }
            sum = sum + testScores[i];
        }
        
        // Calculate the average.
        average = sum / testScores.length;
        
        // Return the average.
        return average; 
    }
    
    
}
