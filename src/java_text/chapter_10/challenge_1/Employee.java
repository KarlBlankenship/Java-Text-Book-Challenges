/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_10.challenge_1;

/**
 * This class will contain fields that represent and employee.
 * @author Karl
 */
public class Employee {
    
    private String name; // Employee name.
    private String idNumber; // Employee ID number form XXX-L where each
                                   // X is a digit 0-9 and L is a letter A-M.
    private int hireDate; // Employee hire date form YYYYMMDD.

    /**
     * Default Constructor.
     */
    public Employee() {
    }

    /**
     * Overload Constructor that accepts all fields.
     * @param name
     * @param idNumber
     * @param hireDate 
     */
    public Employee(String name, String idNumber, int hireDate) {
        this.name = name;
        this.idNumber = idNumber;
        this.hireDate = hireDate;
    }

    /**
     * Setter method to set employee name.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter method to set employee ID number.
     * @param idNumber 
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Setter method to set employee hire date.
     * @param hireDate 
     */
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Getter method to return employee name.
     * @return name. 
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to return employee ID number.
     * @return idNumber.
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Getter method to return the employee hire date.
     * @return hireDate.
     */
    public int getHireDate() {
        return hireDate;
    }
           
}
