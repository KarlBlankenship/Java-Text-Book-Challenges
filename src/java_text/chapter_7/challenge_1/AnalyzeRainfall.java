/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_7.challenge_1;

/**
 * This is the file contains the main method which will analyze rainfall
 * data using the Rainfall class.
 * @author Karl
 */
public class AnalyzeRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create the rainfall object.
        Rainfall rf = new Rainfall();
        
        // Add made-up rainfall amounts to each month.
        for (int m=0; m<12; m++) {
            rf.setMonthRainfall(m, 10+m);
            System.out.println("Month: " + m + "   Rainfall: " + (m+10));
        }
        
        // Get and display total rainfall for the year.
        System.out.println("Yearly Total Rainfall: " +
                rf.getYearlyRainfallTotal());
        
        // Get and display average rainfall for the year.
        System.out.println("Average Monthly Rainfall: " +
                rf.getAverageMonthlyRainfall());
        
        // Get and display the wettest month.
        System.out.println("Wettest Month: " +
                rf.getWettestMonth());
        
        //Get and display the driest month.
        System.out.println("Driest Month: " +
                rf.getDriestMonth());
    }
    
}
