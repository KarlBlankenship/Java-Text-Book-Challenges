/*
 * Chapter 15 Challenge 1
 * Nested Layouts 1
 * Write a program that creates the layout of Figure 15-12.
 */
package java_text.chapter_15.challenge_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

/**
 * This application will recreate a sample grid with a centered label
 * over a row of two side by side buttons.
 * @author Karl
 */
public class NestedLayouts1 extends Application {

    /**
     * The main method will execute the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        
        // Create the label.
        Label label = new Label("This is a label");
        
        // Create the buttons.
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2"); 
        
        // Create the horizontal box.
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        
        // Add buttons to the HBox.
        buttonBox.getChildren().addAll(button1, button2);
        
        // Create the vertical box.
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        
        // Add buttonBox and label to vertical box.
        vBox.getChildren().addAll(label, buttonBox);
        
        // Set the scene by adding the vertical box.
        Scene scene = new Scene(vBox, 260, 80);
        
        // Add scene to stage and show stage.
        stage.setTitle("Nested Layout");
        stage.setScene(scene);
        stage.show();
    }
}
