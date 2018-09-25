/*
 * Create an application that allows you to enter an amount of a purchase
 * and then displayes the amount of sales tax on that purchase. Use a slider
 * to adjust the tax rate between 0 percent and 10 percent.
 */
package java_text.chapter_13.challenge_1;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * ScrollableTaxCalculator calculates tax on a purchase using a slider to
 * set tax rate.
 * @author Karl
 */
public class ScrollableTaxCalculator extends JFrame {

    private JLabel purchaseLabel, taxLabel; // Message labels.
    private JTextField purchaseAmount;      // Purchase amount.
    private JTextField taxAmount;           // Tax amount.
    private JPanel purchasePanel;           // Purchase panel.
    private JPanel taxPanel;                // Tax panel.
    private JPanel sliderPanel;             // Slider panel.
    private JSlider slider;                 // Tax rate adjuster.

    /**
     * Constructor.
     */
    public ScrollableTaxCalculator() {
        
        // Set the title.
        setTitle("Tax Calculator");
        
        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create message labels.
        purchaseLabel = new JLabel("Purchase Amount: ");
        taxLabel = new JLabel("Tax Amount: ");
        
        // Create the text fields.
        purchaseAmount = new JTextField(10);
        taxAmount = new JTextField(10);
        taxAmount.setEditable(false);   // User cannot type in a value for tax.
        
        // Create the slider.
        slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        slider.setMajorTickSpacing(1);
        //slider.setMinorTickSpacing(0.2);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener());
        
        // Create panels and place componentes into them.
        purchasePanel = new JPanel();
        purchasePanel.add(purchaseLabel);
        purchasePanel.add(purchaseAmount);
        taxPanel = new JPanel();
        taxPanel.add(taxLabel);
        taxPanel.add(taxAmount);
        sliderPanel = new JPanel();
        sliderPanel.add(slider);
        
        // Create the GridLayout manager.
        setLayout(new GridLayout(3,1));
        
        // Add panels to the content pane.
        add(purchasePanel);
        add(taxPanel);
        add(sliderPanel);
        
        // Pack and display frame.
        pack();
        setVisible(true);
    }
    
    private class SliderListener implements ChangeListener {
        
        public void stateChanged(ChangeEvent e) {
            
            double purchase, tax, taxRate;

            // Get the purchase amount.
            purchase = Double.parseDouble(purchaseAmount.getText());
            
            // Get the slider value.
            taxRate = slider.getValue();
            
            // Calculate tax.
            tax = purchase * (taxRate / 100.0);
            
            // Set the tax test field to the tax value.
            taxAmount.setText(Double.toString(tax));
        }     
    }

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ScrollableTaxCalculator();
    }
    
}
