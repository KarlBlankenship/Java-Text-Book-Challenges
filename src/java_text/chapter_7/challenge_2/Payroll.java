/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_7.challenge_2;

/**
 * The Payroll class will have fields for an employee ID, hours worked,
 * pay rate and wages. There will be a method for calculating gross pay.
 * @author Karl
 */
public class Payroll 
{
    // Employee ID array is initialized with 7 provided employee ID's.
    private int[] employeeID = {5658845, 4520125, 7895122, 8777541,
                                8451277, 1302850, 7580489};
    private int[] hours = new int[7];           // Hold employee hours.
    private double[] payRate = new double[7];   // Hold employee pay rate.
    private double[] wages = new double[7];     // Hold employee wages.

    public int[] getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int[] employeeID) {
        this.employeeID = employeeID;
    }
    
    public int[] getHours() {
        return hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }
    
    public double[] getPayRate() {
        return payRate;
    }

    public void setPayRate(double[] payRate) {
        this.payRate = payRate;
    }
    
    public double calculateGrossWages(int eID)
    {
        double grossWages = -1;
        for (int index : employeeID)
        {
            if (employeeID[index] == eID) 
            {
                wages[index] = hours[index] * payRate[index];
                grossWages = wages[index];
            }
        }
        return grossWages;
    }

    
    
    
}
