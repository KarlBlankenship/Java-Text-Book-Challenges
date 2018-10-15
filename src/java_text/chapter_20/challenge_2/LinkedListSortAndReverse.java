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
     * The isEmpty method checks to see if the list is empty.
     * @return true if list is empty, false otherwise.
     */
    public boolean isEmpty()
    {
        return first == null;
    }
    
    /**
     * The size method returns the length of the list.
     * @return The number of elements in the list.
     */
    public int size()
    {
        int count = 0;
        Node p = first;
        while (p != null)
        {
            // There is an element p.
            count++;
            p = p.next;
        }
        return count;
    }
    
    /**
     * The add method adds an element to the end of the list.
     * @param e The value to add to the end of the list. 
     */
    public void add(String e)
    {
        if (isEmpty())
        {
            first = new Node(e);
            last = first;
        }
        else
        {
            // Add to the end of existing list.
            last.next = new Node(e);
            last = last.next;
        }
    }
    
    /**
     * The add method adds an element at a position.
     * @param index The position at which to add the element.
     * @param e The element to add to the list.
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public void add(int index, String e)
    {
        if (index < 0 || index > size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        
        // Index is 0.
        if (index == 0)
        {
            // New element goes at the beginning.
            first = new Node(e, first);
            if (last == null)
                last = first;
            return;
        }
        
        // Set reference pred to point to the node that
        // will be the predecessor of the new node.
        Node pred = first;
        for (int k = 1; k <= index - 1; k++)
            pred = pred.next;
        
        // Splice in a node containing the new element.
        pred.next = new Node(e, pred.next);
        
        // Is there a new last element?
        if (pred.next.next == null)
            last = pred.next;
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
    
    /**
     * The remove method removes the element at an index.
     * @param index The index of the element to remove.
     * @return The element removed.
     * @exception IndexOutOfBoundsException when index is out of bounds.
     */
    public String remove(int index)
    {
        if (index < 0 || index >= size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        
        String element;     // The element to return.
        if (index == 0)
        {
            // Removal of first item in the list.
            element = first.value;
            first = first.next;
            if (first == null)
                last = null;
        }
        else
        {
            // To remove an element other than the first,
            // find the predecessor of the element to
            // be removed.
            Node pred = first;
            
            // Move pred forward index - 1 times.
            for (int k = 1; k <= index - 1; k++)
                pred = pred.next;
            
            // Store the value to return.
            element = pred.next.value;
            
            // Route link around the node to be removed.
            pred.next = pred.next.next;
            
            // Check to see if pred is now last.
            if (pred.next == null)
                last = pred;
        }
        return element;
    }
    
    /**
     * The remove method removes an element.
     * @param element The element to be removed.
     * @return  true if the remove succeeded, false otherwise.
     */
    public boolean remove(String element)
    {
        if (isEmpty())
            return false;
        
        if (element.equals(first.value))
        {
            // Removal of first item in the list.
            first = first.next;
            if (first == null)
                last = null;
            return true;
        }
        
        //Find the predecessor of the element to remove.
        Node pred = first;
        while (pred.next != null && !pred.next.value.equals(element))
        {
            pred = pred.next;
        }
        
        // pred.next == null OR pred.next.value is element.
        if (pred.next == null)
            return false;
        
        // pred.next.value IS element
        pred.next = pred.next.next;
        
        // Check if pred is now last.
        if (pred.next == null)
            last = pred;
        
        return true;
    }
     
    /**
     * The reverse method will reverse the order of the linked list.
     */
    public void reverse()
    {
        Node pointer = last;
        last = first;
        
        for (int i = 1; i < size(); i++)
        {
            Node succ = pointer.next;
            
            pointer.next = first;
            first = first.next;
            if (pointer.next == null)
                pointer.next.next = null;
            else    
                pointer.next.next = succ;   
        }
    }
    
    public void sort()
    {
        if (size() > 1)
        {
            Node point = first;
            Node lastPoint = null;
            Node temp = null;
            Node prev = first;
            
            last.next = lastPoint;
            
            //do
            //{
                
            for(int i = 0; i < 3; i++)
            {
                do 
                {
                    if (point.value.compareTo(point.next.value) > 0)
                    {
                        if (point == first)
                        {
                            first = point.next;
                            prev = first;
                        }
                        temp = point.next;
                        if (temp == last)
                        {
                            last = point;
                        }
                        point.next = temp.next;
                        temp.next = point;
                        prev.next = temp;
                        prev = temp;
                        

                    }
                    else
                    {
                        point = point.next;
                        //prev = prev.next;       //guess??
                    }
                }   
                while (point.next != lastPoint);
                
                lastPoint = point.next;
                
                
                point = first;
                
                System.out.println("first is :  " + first.value);
                System.out.println("last is  :  " + last.value);
            }    
            //}
            //while (point != lastPoint);
        }
        
//        int s = size();
//        // try bubble sort
//        for (int i = s; i > 1; i--)
//        {
//            Node pointer = first;
//            Node comp = pointer.next;
//            Node prev = null;
//            System.out.println("i");
//            //System.out.println("first: " + first.value);
//            
//            for (int j = 1; j <= i - 1; j++)
//            {
//                System.out.println("j");
//                if (pointer.value.compareTo(comp.value) > 0)
//                {
//                    if (pointer == first && comp.next != null)
//                    {
//                        
//                        pointer.next = comp.next;
//                        comp.next = pointer;
//                        first = comp;
//                        prev = first;
//                    }
//                    else if (pointer != first && comp.next != null)
//                    {
//                        pointer.next = comp.next;
//                        comp.next = pointer;
//                        prev.next = comp;
//                        prev = comp;
//                        comp = 
//                    }
//                    
//                    else ()
//                    {
//
//                    }
//                }    
//                                
//                else
//                {
//                System.out.println("else");
//                if (prev == null)
//                    prev = first;
//                else
//                    prev = prev.next;
//                pointer = pointer.next;
//                comp = comp.next;
//                }
//                
//            }
//        }
        
    }
    
    /**
     * The main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedListSortAndReverse ll = new LinkedListSortAndReverse();
        
        // Check isEmpty.
        //System.out.println("Is the linked list empty?  " + ll.isEmpty());
        
        // Check size
        //System.out.println("What is the length of the linked list?  " +
        //                            ll.size());
        
//        ll.add("Carol");
//        ll.add("Bob");
//        ll.add(0, "Al");
//        ll.add(2, "Beth");
//        ll.add(4, "Amy");

        ll.add("D");
        ll.add("C");
        ll.add("B");
        ll.add("A");
        
        
        
        
        
        System.out.println("The members of the list are:");
        System.out.println(ll);
        
        // Remove index 2 -> Beth.
//        System.out.println("Remove index 2 -> Beth:");
//        ll.remove(2);
//        System.out.println(ll.toString());
        //ll.reverse();
        ll.sort();
        // Remove by element Amy.
//        System.out.println("Remove Amy:");
//        ll.remove("Amy");
        System.out.println(ll);
        System.out.println();
        //System.out.println(ll.last.next);
    }   
}
