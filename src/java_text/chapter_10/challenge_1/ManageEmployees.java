/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_10.challenge_1;

/**
 * Main method for working with the Employee and ProductionWorker classes.
 * @author Karl
 */
public class ManageEmployees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create and Employee object with the default constructor.
        Employee karen = new Employee();
        karen.setName("Karen");
        karen.setIdNumber("123-A");
        karen.setHireDate(20101010);
        // Print the fields from the object to verify.
        System.out.println("Name: " + karen.getName());
        System.out.println("ID: " + karen.getIdNumber());
        System.out.println("Hire Date: " + karen.getHireDate());
        
        // Create and instance of Employee with overload constructor.
        Employee karl = new Employee("Karl","234-B",20181010);
        // Display the fields from the object to verify.
        System.out.println("Name: " + karl.getName());
        System.out.println("ID: " + karl.getIdNumber());
        System.out.println("Hire Date: " + karl.getHireDate());
        
        // Create a ProductionWorker object with the default contructor.
        ProductionWorker kapone = new ProductionWorker();
        kapone.setName("Kapone");
        kapone.setIdNumber("234-C");
        kapone.setHireDate(20131031);
        kapone.setShift(1);
        kapone.setHourlyPayRate(56.78);
        // Display fields from object to verify.
        System.out.println("Name: " + kapone.getName());
        System.out.println("ID: " + kapone.getIdNumber());
        System.out.println("Hire Date: " + kapone.getHireDate());
        System.out.println("Shift: " + kapone.getShift());
        System.out.println("Hourly Pay Rate: " + kapone.getHourlyPayRate());
        
        // Create a ProductionWorker object with first overload constructor.
        ProductionWorker lambchop = new ProductionWorker(2,23.45);
        lambchop.setName("Lambchop");
        lambchop.setIdNumber("456-D");
        lambchop.setHireDate(20150423);
        // Display fields from object to verify.
        System.out.println("Name: " + lambchop.getName());
        System.out.println("ID: " + lambchop.getIdNumber());
        System.out.println("Hire Date: " + lambchop.getHireDate());
        System.out.println("Shift: " + lambchop.getShift());
        System.out.println("Hourly Pay Rate: " + lambchop.getHourlyPayRate());
        
        // Create a ProductionWorker object using overload/super constructor.
        ProductionWorker squirrel = 
                new ProductionWorker(1,12.34,"Squirrel","567-E",20171225);
        // Display fields from object to verify.
        System.out.println("Name: " + squirrel.getName());
        System.out.println("ID: " + squirrel.getIdNumber());
        System.out.println("Hire Date: " + squirrel.getHireDate());
        System.out.println("Shift: " + squirrel.getShift());
        System.out.println("Hourly Pay Rate: " + squirrel.getHourlyPayRate());
    }

}
