/*
 * Write a generic class named MyList, with a type parameter T. The type
 * parameter T should be contrained to an upper bound: the Number class.
 * 
 * The class should have as a field an ArrayList of T.
 *
 * Write a public method named add, which accepts a parameter of type T.
 * When an argument is passed to the method, it is added to the ArrayList.
 *
 * Write two other methods, largest and smallest, which return the largest
 * and smallest values in the ArrayList.
 */
package java_text.chapter_18.challenge_1;

import java.util.ArrayList;

/**
 * The MyList class holds an ArrayList of objects that are constrained to
 * an upper bound of Number. It also provides methods for finding the 
 * largest and smallest object in the ArrayList.
 * @author Karl
 * @param <T>
 */
public class MyList<T extends Number>
{
    private ArrayList<T> list = new ArrayList<>();    // Create the ArrayList.
    
    /**
     * The add method will add an input to the ArrayList of type T.
     * @param input 
     */
    public void add(T input)
    {
        list.add(input);
    }
 
    /**
     * The greater method is written to do the actual comparison
     * between two objects of type T.
     * @param <T>
     * @param arg1
     * @param arg2
     * @return the larger object.
     */
    /*private <T extends Comparable<T>> T largest()
    {
        T max;
        
        return max;
    }*/
}
