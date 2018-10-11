/*
 * Modify the LinkedList1 class presented in this chapter by adding
 * sort() and reverse() methods. The reverse method should reverse
 * the order of the elements in the list, and the sort method
 * rearranges the elements in alphabetical order. Do not use recursion
 * to implement either of these operations.
 */
package java_text.chapter_20.challenge_2;

/**
 * This class will implement reverse and sort methods.
 * @author Karl
 */
public class LinkedListSortAndReverse 
{
    /**
     * The Node class stores a list element
     * and a reference to the next node.
     */
    private class Node
    {
        String value;
        Node next;
        
        /**
         * Constructor.
         * @param val The element to store in the node.
         * @param n The reference to the successor node.
         */
        Node(String val, Node n)
        {
            value = val;
            next = n;
        }
        
        /**
         * Constructor.
         * @param val The element to store in the node.
         */
        Node(String val)
        {
            // Call the other (sister) constructor.
            this(val, null);
        }
    }
    
    private Node first;     // The list head.
    private Node last;      // The last element in the list.
    
    /**
     * Constructor.
     */
    public LinkedListSortAndReverse()
    {
        first = null;
        last = null;
    }
    
    /**
     * The toString method computes the string representation
     * of the list.
     * @return The string form of the list.
     */
    @Override
    public String toString()
    {
        StringBuilder strBuilder = new StringBuilder();
        
        //Use p to walk down the linked list.
        Node p = first;
        while (p != null)
        {
            strBuilder.append(p.value + "\n");
            p = p.next;
        }
        return strBuilder.toString();
    }
    
    
    public void reverse()
    {
        
    }
}
