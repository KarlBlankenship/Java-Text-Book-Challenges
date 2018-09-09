/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_8.challenge_1;

import java.lang.Math.*;

/**
 * Area class with overload static methods for finding the area of a circle,
 * rectangle and cylinder. Static methods can be called without creating an
 * instance of the class. Simply use the ClassName.Method to execute the method.
 * @author Karl
 */
public class Area {

    // Create static method for finding the area of a circle.
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Create static overload method for finding the area of a rectangle.
    public static int calculateArea(int width, int length) {
        return width * length;
    }
    
    // Create static overload method for finding the area of a cylinder.
    public static double calculateArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}
