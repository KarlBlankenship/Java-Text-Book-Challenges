/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_6.challenge_2;

/**
 * This file contains the main method which will create an instance of the 
 * car class and then increment and decrement the speed.
 * @author Karl
 */
public class OperateCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create an instance of the Car class.
        Car myCar = new Car(2001, "Ford");
        
        //Display the initial speed.
        System.out.println("Initial Speed = " + myCar.getSpeed() + " mph");
        
        //Accelerate the car five times and display speeds.
        for (int i = 0; i<5; i++) {
            myCar.accelerate();
            System.out.println("Acceleration " + (i+1));
            System.out.println(myCar.getSpeed());
        }
        
        //Brake 5 times and display speeds
        for (int i = 0; i<5; i++) {
            myCar.brake();
            System.out.println("Brake " + (i+1));
            System.out.println(myCar.getSpeed());
        }
        
        //Display final speed.
        System.out.println("Final Speed = " + myCar.getSpeed() + " mph");
    }
    
}
