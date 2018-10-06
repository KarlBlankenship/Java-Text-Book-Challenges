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
     * The largest method will return the largest value found in list.
     * @param <T>
     * @return the maximum value found in list.
     */
    public <T extends Comparable<T>> T largest()
    { 
        T max = (T)list.get(0);  // Set max to the initial array value.         
        for (int index = 0; index < list.size(); index++)
        {
            if (((T)list.get(index)).compareTo(max) > 0)
                max = (T)list.get(index);
        }
        return max;
    }
    
    /**
     * The smallest method will return the smallest value found in list.
     * @param <T>
     * @return the minimum value found in list.
     */
    public <T extends Comparable<T>> T smallest()
    { 
        T min = (T)list.get(0);  // Set max to the initial array value.    
        for (int index = 0; index < list.size(); index++)
        {
            if (((T)list.get(index)).compareTo(min) < 0)
                min = (T)list.get(index);
        }
        return min;
    }
}
