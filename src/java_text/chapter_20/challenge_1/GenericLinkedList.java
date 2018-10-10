/*
 * Modify the doubly linked list class presented in this chapter so it 
 * works with generic types. Add the following methods drawn from
 * the java.util.List interface:
 *  - void clear(): remove all elements from the list.
 *  - E get(int index): return the element at position index in the list.
 *  - E set(int index, E element): replace the element at the specified
 *    position with the specified element and return the previous element.
 * Test your generic linked list class by processing a list of numbers
 * of type double.
 */
package java_text.chapter_20.challenge_1;

/**
 *
 * @author Karl
 * @param <T>
 */
public class GenericLinkedList<T extends Number> 
{
    /**
     * The Node class stores a list element
     * and a reference to the next and previous node.
     */
    private class Node<T extends Number>
    {
        T value;            // Value of a list element.
        Node next;          // Next Node in the list.
        Node prev;          // Previous Node in the list.
        
        /**
         * Constructor.
         * @param val The element to be stored in the node.
         * @param n The reference to the successor node.
         * @param p The reference to the predecessor node.
         */
        Node(T val, Node n, Node p)
        {
            value = val;
            next = n;
            prev = p;
        }
        
        /**
         * Constructor.
         * @param val The element to be stored in the node.
         */
        Node(T val)
        {
            // Just call the other (sister) constructor.
            this(val, null, null);
        }
    }
    
    private Node first;     // Head of the list.
    private Node last;      // Tail of the list.

    /**
     * Constructor.
     */
    public GenericLinkedList()
    {
        first = null;
        last = null;
    }
    
    /**
     * The isEmpty method checks to see if the list is empty.
     * @return true if the list is empty, false otherwise.
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
            // There is an element at p.
            count++;
            p = p.next;
        }
        return count;
    }
    
    /**
     * The add method adds to the end of the list.
     * @param e The value to add.
     */
    public void add(T e)
    {
        if (isEmpty())
        {
            last = new Node(e);
            first = last;
        }
        else
        {
            // Add to the end of existing list.
            last.next = new Node(e, null, last);
            last = last.next;
        }
    }
    
    /**
     * This add method adds an element at an index.
     * @param index The index at which to add.
     * @param e The element to add to the list.
     * @exception IndexOutOfBoundsException when index is out of bounds.
     */
    public void add(int index, T e)
    {
        if (index < 0 || index > size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        
        // Index is at least 0.
        if (index == 0)
        {
            // New element goes at beginning.
            Node p = first;         // Old first.
            first = new Node(e, p, null);
            if (p != null)
                p.prev = first;
            if (last == null)
                last = first;
            return;
        }
        
        // pred will point to the predecessor 
        // of the new node.
        Node pred = first;
        for (int k = 1; k <= index - 1; k++)
            pred = pred.next;
        
        // Splice in a node with the new element.
        // We want to fo from pred--succ to
        // pred--middle--succ.
        Node succ = pred.next;
        Node middle = new Node(e, succ, pred);
        pred.next = middle;
        if (succ == null)
            last = middle;
        else
            succ.prev = middle;
    }
    
    /**
     * The toString method computes a string
     * representation of the list.
     * @return The string representation of the linked list.
     */
    @Override
    public String toString()
    {
        StringBuilder strBuilder = new StringBuilder();
        
        // Use p to walk down the linked list.
        Node p = first;
        while (p != null)
        {
            strBuilder.append(p.value + "\n");
            p = p.next;
        }
        return strBuilder.toString();
    }
    
    /**
     * The remove method removes the element at a given position.
     * @param index The position of the element to remove.
     * @return The element removed.
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public T remove(int index)
    {
        if (index < 0 || index >= size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        
        // Locate the node targeted for removal.
        Node target = first;
        for (int k = 1; k <= index; k++)
            target = target.next;
        
        T element =  (T) target.value;  // Element to return.
        Node pred = target.prev;        // Node before the target.
        Node succ = target.next;        // Node after the target.
        
        // Route forward and back pointers around
        // the node to be removed.
        if (pred == null)
            first = succ;
        else
            pred.next = succ;
        
        if (succ == null)
            last = pred;
        else
            succ.prev = pred;
        
        return element;
    }
    
    /**
     * The remove method removes an element from the list.
     * @param element The element to be removed.
     * @return true if the element was removed, false otherwise.
     */
    public boolean remove(T element)
    {
        if (isEmpty())
            return false;
        
        // Locate the node targeted for removal.
        Node target = first;
        while (target != null && !element.equals(target.value)) //!!!
            target = target.next;
        
        if (target == null)
            return false;
        
        Node pred = target.prev;    // Node before the target.
        Node succ = target.next;    // Node after the target.
        
        // Route forward and back pointers around
        // the node to be removed.
        if (pred == null)
            first = succ;
        else
            pred.next = succ;
        
        if (succ == null)
            last = pred;
        else 
            succ.prev = pred;
        
        return true;
    }  
    
    /**
     * The clear method is void and removes all objects from the list.
     */
    public void clear()
    {  
         first = null;
         last = null;
    }
    
    public T get(int index)
    {
        // Check to see if index is valid.
        if (index < 0 || index >= size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        
        // Locate the node to return.
        Node target = first;
        for (int k = 1; k <= index; k++)
            target = target.next;
        
        // Get value of the node.
        T element =  (T) target.value;  // Element to return.
        
        return element;
    }
    
    /**
     * The main method executes the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create an instance of GenericLinkedList.
        GenericLinkedList gll = new GenericLinkedList();
        
        // Check the isEmpty method prior to adding anything to the list.
        System.out.println("The list isEmpty: " + gll.isEmpty());
        
        // Check the size method prior to adding anything to the list.
        System.out.println("The list size: " + gll.size());
        
        // Add elements to the list using base constructor.
        gll.add(1.234);
        gll.add(2.345);
        
        // Add elements to the list in specific indexes.
        gll.add(0, 3.456);
        gll.add(2, 4.567);
        gll.add(4, 5.678);
        
        // Display the list.
        System.out.println("Add elements to the list:");
        System.out.println(gll);
        
        // Check the isEmpty method after adding elements to the list.
        System.out.println("The list isEmpty: " + gll.isEmpty());
        
        // Check the size method after adding elements to the list.
        System.out.println("The list size: " + gll.size());
        
        // Check the toString method.
        System.out.println("toString method: \n" + gll.toString());
        
        // Remove an element by index.
        gll.remove(1);
        System.out.println("Remove index 1: \n" + gll.toString());
        
        // Remove an element by value.
        gll.remove(4.567);
        System.out.println("Remove element 4.567: \n" + gll.toString());
        
        // Test the get method to get element 1.
        System.out.println("Get element 1: " + gll.get(1));
        
        // Display contents to veryfy that get retreived but did not remove.
        System.out.println("Contents after get: \n" + gll.toString());
        
        // Clear the contents with the clear method.
        gll.clear();
        System.out.println("Clear contents and display contents \n" +
                                    gll.toString());
        
        System.out.println("Check size after clear: " + gll.size());
    }
    
}
