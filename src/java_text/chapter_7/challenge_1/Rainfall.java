/*
 * Rainfall Class that stores the total rainfall for each of 12 months into an
 * array of doubles. The class should have methods for returning total rainfall
 * for the year, the average monthly rainfall, the month with the most rain and
 * the month with the least rain. Do not accept negative values.
 */
package java_text.chapter_7.challenge_1;

/**
 *
 * @author Karl
 */
public class Rainfall {

    // Create the 12-index double array.
    double[] rainfallAmounts = new double[12];
    
    // Default Constructor.
    public Rainfall() {
    }
    
    public void setMonthRainfall(int index, double monthlyRainfallValue) {
        if (monthlyRainfallValue >= 0)
            rainfallAmounts[index] = monthlyRainfallValue;
        else
            System.out.println("Rainfall must not be a negative value.");
    }
}
