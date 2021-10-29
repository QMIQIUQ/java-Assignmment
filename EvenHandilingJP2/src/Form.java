/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class Form extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Label name = new Label("Name");
        Label Age = new Label("Age");
        Button searchBtn = new Button("Search");
        
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button enter = new Button("Enter");
        Label label = new Label("");
        
        pane.add(name,1,1);
        pane.add(Age, 1, 2);
        pane.add(t1,2,1);
        pane.add(t2, 2, 2);
        pane.add(searchBtn,3,1);
        
        HBox btnPane  = new HBox();
        Button savebtn = new Button("Save");
        
        btnPane.getChildren().addAll(enter,savebtn);
        pane.add(btnPane,2,3);
        
        pane.add(label, 2, 4);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Personal Detail Form");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        savebtn.setOnAction(e->{
        
                try{
                    String name1 = t1.getText();
                    if(name1.equals("")){
                        JOptionPane.showMessageDialog(null,"Name should not be empty");
                    }else{
                        int age = Integer.parseInt(t2.getText());
                        String fileName = name1+".txt";
                        PrintWriter output = new PrintWriter(fileName);
                        output.println(age);
                        output.close();
                        JOptionPane.showMessageDialog(null,"record added successfully");
                    }
                    
                    
                    
                    
                }catch(FileNotFoundException fnf){
                    
                }
        });
        
        searchBtn.setOnAction(e->{
        try{
            String fileName = t1.getText()+".txt";
            Scanner input = new Scanner(new File(fileName));
            int age = input.nextInt();
            input.close();
            
            t2.setText(String.valueOf(age));
        }catch(FileNotFoundException fnf){
            JOptionPane.showMessageDialog(null, "File not found");
        }
            
        });
        
        enter.setOnAction(e->{
        //read data from name text field
        //t1.getText() => return text on text field(String)
        String name1 = t1.getText();
        String ageStr = t2.getText();
        
        int age = Integer.parseInt(ageStr);

            //pane.add(new Label("Age In Days:   "), 1, 4);
            Person p = new Person();
            p.setName(name1);
            p.setAge(age);
        
            label.setText(String.valueOf(p.toString()));
        
            //display the person detail(name , age in day)
            //using dilog box
        
            JOptionPane.showMessageDialog(null, p.toString());
            t1.clear();
            t2.clear();
            t1.requestFocus();

        });
        
        
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
