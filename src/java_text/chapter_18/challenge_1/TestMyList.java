/*
 * This program is written to test the MyList Class.
 */
package java_text.chapter_18.challenge_1;

/**
 * This program is written to test the MyList Class.
 * @author Karl
 */
public class TestMyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create instance of MyList class
        MyList ml = new MyList();
        
        // Create an array of integers to transfer to ml.
        int[] intArray = {5, 8, 0, 23, 12, 7, 5, 23, 6, 4};
        
        // Add array of inegers to ml.
        for (int x = 0; x < intArray.length; x++)
        {
            ml.add(intArray[x]);
        }
        
        //Display largest int in ml.
        System.out.println(ml.largest());
        System.out.println(ml.smallest());
                
        // Create instance of MyList class
        MyList ml2 = new MyList();
        
        // Create an array of integers to transfer to ml.
        double[] doubleArray = {5.7, 7.8, 1.0, 2.3, 0.12, 7.45, 5.5, 23.9, 6.5};
        
        // Add array of inegers to ml.
        for (int x = 0; x < doubleArray.length; x++)
        {
            ml2.add(doubleArray[x]);
        }
        
        //Display largest int in ml.
        System.out.println(ml2.largest());
        System.out.println(ml2.smallest());
        
        // Create instance of MyList class
        MyList ml3 = new MyList();
        
        // Create an array of integers to transfer to ml.
        double[] doubleArray2 = {0.1};
        
        // Add array of inegers to ml.
        for (int x = 0; x < doubleArray2.length; x++)
        {
            ml3.add(doubleArray2[x]);
        }
        
        //Display largest int in ml.
        System.out.println(ml3.largest());
        System.out.println(ml3.smallest());
    }
    
}
