/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DemoMainPage extends Application {
    private TextField stateTF;

    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Open TestComboBox");
        
        btn1.setOnAction(e->{
               TestComboBox spage = new TestComboBox();
               //receive string data from TestComboBox
               String a = spage.getStart();
               stateTF.setText(a);
         
        });
        
        FlowPane root = new FlowPane();
        stateTF = new TextField();
        root.getChildren().addAll(btn1, stateTF);
        
        Button btn2 = new Button("Open TestSecondPage");
        root.getChildren().addAll(btn2);
        
        btn2.setOnAction(e->{
            TestSecondPage t = new TestSecondPage();
            JOptionPane.showMessageDialog(null, t.getName());
        });
        
        
        Button btn3 = new Button("Open TestStartMethod");
        root.getChildren().addAll(btn3);
        
        btn3.setOnAction(e->{
            TestStartMethod t = new TestStartMethod();
            t.start(new Stage());
            JOptionPane.showMessageDialog(null, t.getName());
        });
        
        Button btn4 = new Button("Open TestPassObjectPage");
        root.getChildren().addAll(btn4);
        
        btn4.setOnAction(e->{
            Student s = new Student("ali");
            TestPassObjectPage t = new TestPassObjectPage();
            t.start(s);
            JOptionPane.showMessageDialog(null, s.getGpa());
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

class Person{
    
}