/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbookchap6chal2;

/**
 * This is class that describes a car.
 * @author Karl
 */
public class Car {
    
    //Define class parameters.
    private int yearModel;
    private String make;
    private int speed;  //This is the current speed of the car.

    /**
     * Default constructor.
     */
    public Car() {
    }

    /**
     * Overload constructor.
     * @param yearModel
     * @param make 
     */
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    /**
     * Accessor method that returns the year model of the car.
     * @return Returns the Year Model of the car.
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * Accessor method that returns the make of the car.
     * @return Returns the make of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Accessor method that returns the current speed of the car.
     * @return Returns the current speed of the car.
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Method for incrementing speed by 5.
     */
    public void accelerate() {
        this.speed = this.speed + 5; //increment speed by 5. 
    }
    
    /**
     * Method for decreasing speed by 5.
     */
    public void brake() {
        this.speed = this.speed - 5; //decrease speed by 5.
    }
}
