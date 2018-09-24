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
import java.awt.event.*;

/**
 *
 * @author Karl
 */
public class RetailPriceCalculator extends JFrame {

    private JPanel panel;               // To reference the panel.
    private JLabel wspLabel;            // Wholesale price label.
    private JLabel markupLabel;         // Markup percentage label.
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
    
    /**
     * The buildPanel method adds a label, text fields and a button 
     * to the panel. Add the action listener to the calculate button.
     */
    private void buildPanel() {
        
        // Create a label to display instructions.
        wspLabel = new JLabel("Enter Wholesale Cost in $: ");
        
        // Create a wholesale text field 10 characters wide.
        wholesalePrice = new JTextField(10);
        
        // Create a label to display instructions.
        markupLabel = new JLabel("Enter Markup Percentage: ");
        
        // Create a markup text field 10 characters wide.
        markup = new JTextField(10);
        
        // Create a button with caption "Calculate."
        calcButton = new JButton("Calculate");
        
        // Add the action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Create the JPanel object and let the panel field reference it.
        panel = new JPanel();
        
        // Add the label, text fields, and button components to the panel.
        panel.add(wspLabel);
        panel.add(wholesalePrice);
        panel.add(markupLabel);
        panel.add(markup);
        panel.add(calcButton);   
    }
    
    /**
     * CalcButtonLister is an action listener class for the 
     * calculate button.
     */
    private class CalcButtonListener implements ActionListener {
        
        /**
         * The action performed method executes when the user clicks
         * on the calculate button
         * @param e the event object.
         */
        public void actionPerformed(ActionEvent e) {
            
            String wholesaleInput;      // Holds wholesale entry.
            String markupInput;         // Holds markup entry
            double retailPrice;         // The calculated retail price.
            
            // Get the text entered by the user for wholesale and markup.
            wholesaleInput = wholesalePrice.getText();
            markupInput = markup.getText();
            
            // Calculate retail price.
            retailPrice = Double.parseDouble(wholesaleInput) + 
                            (Double.parseDouble(wholesaleInput) *
                                Double.parseDouble(markupInput) / 100);
            
            // Display the resulats.
            JOptionPane.showMessageDialog(null, "Retail Price is $" +
                                                    retailPrice);
                    
        }
    }
    
    
  
    /**
     * Main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RetailPriceCalculator();
    }
    
}
