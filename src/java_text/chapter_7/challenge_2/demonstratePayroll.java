/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_7.challenge_2;

import java.util.*;

/**
 * This program will demonstrate the payroll class.
 * @author Karl
 */
public class demonstratePayroll 
{

    /**
     * The main method executes the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create a payroll object.
        Payroll payroll = new Payroll();
        
        // Create the keyboard and System in.
        Scanner keyboard = new Scanner(System.in);
        
        // Create an int variable for keyboard input.
        int keyInt;
        
        // Create a double variable for keyboard input.
        double keyDouble;

        // Create boolean valid flag for data entry.
        boolean isValid = false;
        
        // Create a local variable for gross wages.
        double grossPay;
        
        // Cycle through all employee ID's, get hours and payrate and 
        // calculate the gross wages.
        //for (int index : payroll.getEmployeeID())
        for (int index = 0; index < 7; index++)
        {
            System.out.println("Please enter hours for employee ID " +
                                payroll.getEmployeeID(index) + ": ");
            while (!isValid)
            {
                keyInt = keyboard.nextInt();
                //System.out.println();
                if (keyInt >= 0)
                {
                    payroll.setHours(index, keyInt);
                    isValid = true;
                }
                else
                    System.out.println("Hours must be a non-negative integer.");
            }    
                
            // Reset the valid flag and ask for pay rate to be entered
            isValid = false;
            System.out.println("Please enter pay rate for employee ID " +
                                payroll.getEmployeeID(index) + ": ");
            while (!isValid)
            {
                keyDouble = keyboard.nextDouble();
                //System.out.println();
                if (keyDouble >= 6.00)
                {
                    payroll.setPayRate(index, keyDouble);
                    isValid = true;
                }
                else
                    System.out.println("Pay rate mut be greater than or "
                            + "equal to 6.00.");
            }
            
            // calculate gross pay, update object and display the gross pay.
            System.out.println("Gross wages for employee " + 
                                payroll.getEmployeeID(index) +
                                " are $" +
                                payroll.calculateGrossWages(index));
        }
    } 
}
