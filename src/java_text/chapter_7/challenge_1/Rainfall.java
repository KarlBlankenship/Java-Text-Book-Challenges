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
    private double[] rainfallAmounts = new double[12];
    
    // Default Constructor.
    public Rainfall() {
    }
    
    /**
     * Setter method for setting any particular index in the array.
     * @param index
     * @param monthlyRainfallValue 
     */
    public void setMonthRainfall(int index, double monthlyRainfallValue) {
        if (monthlyRainfallValue >= 0)
            rainfallAmounts[index] = monthlyRainfallValue;
        else {
            System.out.println("Rainfall must not be a negative value.");
            rainfallAmounts[index] = 0; //instead of some sort of escape
        }
    }

    /**
     * Getter method that retrieves the amount of rainfall from a given month.
     * @param index
     * @return rainfall amount for a specified month
     */
    public double getRainfallAmounts(int index) {
        return rainfallAmounts[index];
    }
    
    /**
     * Method to return the yearly total of rainfall.
     * @return yearly total.
     */
    public double getYearlyRainfallTotal() {
        double total = 0;
        for (int m=0; m<12; m++) {
            total = total + rainfallAmounts[m];
        }
        return total;
    }
    
    /**
     * Method for getting the average monthly rainfall.
     * @return average monthly rainfall
     */
    public double getAverageMonthlyRainfall() {
        return getYearlyRainfallTotal()/12;
    }
    
    /**
     * Method for returning the wettest month.
     * @return wettest month
     */
    public int getWettestMonth() {
        int wettestMonth = 0; //set wettest month as 0
        for (int i=1; i<12; i++) {
            if (rainfallAmounts[i] > rainfallAmounts[i-1])
                wettestMonth = i;
        }
        return wettestMonth;
    }
    
    /**
     * Method for returning the driest month.
     * @return driest month
     */
    public int getDriestMonth() {
        int driestMonth = 0; //set driest month as 0
        for (int i=1; i<12; i++) {
            if (rainfallAmounts[i] < rainfallAmounts[i-1])
                driestMonth = i;
        }
        return driestMonth;
    }
}
