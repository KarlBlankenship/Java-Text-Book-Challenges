/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_11.challenge_1;

/**
 * This main method class will utilize the TestScore Class to analyze test
 * scores.
 * @author Karl
 */
public class AnalyzeTestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Create an array of valid test scores.
    int[] validTestScores = {20, 40, 60, 80};
    
    // Create an array of invalid scores.
    int[] invalidTestScores = {20, 40, 160, 80};

    // Create a TestScore object
    TestScores vts = new TestScores(validTestScores);
    System.out.println(vts.averageTestScore());
    
    // Create an invlid TestScore instance.
    TestScores ivts = new TestScores(invalidTestScores);
    System.out.println(ivts.averageTestScore());
    }
    
}
