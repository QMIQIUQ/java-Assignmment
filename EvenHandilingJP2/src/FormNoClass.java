/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class FormNoClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Label name = new Label("Name");
        Label Age = new Label("Age");
        
        
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button enter = new Button("Enter");
        Label label = new Label("");
        
        pane.add(name,1,1);
        pane.add(Age, 1, 2);
        pane.add(t1,2,1);
        pane.add(t2, 2, 2);
        pane.add(enter,2,3);
        
        pane.add(label, 2, 4);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Personal Detail Form");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        enter.setOnAction(e->{
        //read data from name text field
        //t1.getText() => return text on text field(String)
        String name1 = t1.getText();
        String ageStr = t2.getText();
        //
        int age = Integer.parseInt(ageStr)*365;
        //set名字之后出来
        pane.add(new Label("Age In Days:   "), 1, 4);
        //set年龄之后出来+把它变成string
        label.setText(String.valueOf(age));
        
        //display the person detail(name , age in day)
        //using dilog box
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}