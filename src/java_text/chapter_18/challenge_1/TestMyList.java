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
        
        MyList ml = new MyList();
        
        for (int x = 0; x < 5; x++)
        {
            ml.add(x);
        }
            
        System.out.println(ml);
                
        
        
    }
    
}
