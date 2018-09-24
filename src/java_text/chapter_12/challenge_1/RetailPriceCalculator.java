/*
 * Create a GUI application where the user enters the wholesale
 * cost of an item and its markup percentage into text fields.
 * (For example, if an item's wholesale cost is $5 and its markup
 * percentage is 100 percent, then its retail price is $10.) 
 * The application should have a button that displays the item's
 * retail price when clicked.
 */
package java_text.chapter_12.challenge_1;

import javax.swing.*;

/**
 *
 * @author Karl
 */
public class RetailPriceCalculator extends JFrame {

    private JPanel panel;               // To reference the panel.
    private JLabel messageLabel;        // To reference the message label.
    private JTextField wholesalePrice;  // To reference the wholesale field.
    private JTextField markup;          // To reference retail markup field.
    private JButton calcButton;         // To reference the calculate button.
    private final int WINDOW_WIDTH = 310;   // Window width.
    private final int WINDOW_HEIGHT = 130;  // Window height.

    /**
     * Constructor.
     */
    public RetailPriceCalculator() {
        
        // Set the window title.
        setTitle("Retail Price Calculator");
        
        // Set size of window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Build the panel.
        buildPanel();
        
        // Add the panel to the frames content pane.
        add(panel);
        
        // Display the window.
        setVisible(true);       
    }
    
    
    private void buildPanel() {
        
        // Create a label to display instructions.
        messageLabel = new JLabel("Enter wholesale cost and markup percentage");
        
        //
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
