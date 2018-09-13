/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_10.challenge_1;

/**
 * ProductionWorker class is a subclass of the Employee super class.
 * @author Karl
 */
public class ProductionWorker extends Employee {
    
    private int shift; // Employee shift. 1 for day, 2 for night.
    private double hourlyPayRate; // Employee hourly pay rate.

    /**
     * Default constructor.
     */
    public ProductionWorker() {
    }

    /**
     * Overload constructor for sub class.
     * @param shift
     * @param hourlyPayRate 
     */
    public ProductionWorker(int shift, double hourlyPayRate) {
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * Overload constructor that also will call the superclass constructor and
     * pass all fields into both constructors.
     * @param shift
     * @param hourlyPayRate
     * @param name
     * @param idNumber
     * @param hireDate 
     */
    public ProductionWorker(int shift, double hourlyPayRate, String name, String idNumber, int hireDate) {
        super(name, idNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * Setter method for setting the employee shift.
     * @param shift 
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * Setter method for setting the employee hourly pay rate.
     * @param hourlyPayRate 
     */
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * Getter method for returning the employee shift.
     * @return shift.
     */
    public int getShift() {
        return shift;
    }

    /**
     * Getter method for returning the employee hourly pay rate.
     * @return hourlyPayRate.
     */
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
        
}
