/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_8.challenge_1;

/**
 * Main class for testing the Area Class. This main method will call all three
 * static methods in the Area Class.
 * @author Karl
 */
public class FindArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Define dimensions.
        final double circleRadius = 13.125;
        final int rectangleWidth = 345;
        final int rectangleLength = 97;
        final double cylinderRadius = 759.285;
        final double cylinderHeight = 1325.984;

        // Call the calculateArea method to find the area of a circle with
        // radius circleRadius and display result.
        System.out.println("Circle Radius: " + circleRadius +
                "   Circle Area: " + Area.calculateArea(circleRadius));
        
        // Call the calculateArea method to find the area of a rectangle with
        // width of rectangleWidth and length of rectangleLength and display 
        // the result.
        System.out.println("Rectangle Width: " + rectangleWidth +
                "   Rectangle Length: " + rectangleLength +
                "   Rectangle Area: " + 
                Area.calculateArea(rectangleWidth, rectangleLength));
        
        // Call the calculateArea method to find the area of a cylinder with
        // a radius of cylinderRadius and a height of cylinderHeight and
        // display the result.
        System.out.println("Cylinder Radius: " + cylinderRadius +
                "   Cylinder Height: " + cylinderHeight +
                "   Cylinder Area: " + 
                Area.calculateArea(cylinderRadius, cylinderHeight));
        
    }
    
}
