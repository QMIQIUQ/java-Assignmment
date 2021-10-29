/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * read radius value from radius text field and display the area (result) in area text field
 */
public class CircleGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button enterBtn = new Button("Enter");
        TextField radiusTF = new TextField();
        
        FlowPane root =  new FlowPane();
        root.getChildren().addAll(new Label("Enter radius:"), radiusTF, enterBtn);
        
        TextField areaTF = new TextField();
        areaTF.setEditable(false);
        root.getChildren().addAll(new Label("Area:"), areaTF);
        
        
        Scene scene = new Scene(root, 280, 100);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        enterBtn.setOnAction(e->{
            String radiusStr = radiusTF.getText();
            
            try{
                double radius = Double.parseDouble(radiusStr);    
                Circle c = new Circle(radius);
            }catch(NumberFormatException nef){
                JOptionPane.showMessageDialog(null, "radius must be number");
            }
            //readraddius from use text filed
            
        
            //cereate circle object wit radius value
            

            //call findArea() from circle class and display the area on area textfield
            
            
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
