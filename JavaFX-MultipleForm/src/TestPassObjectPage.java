/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author lc3532
 */
public class TestPassObjectPage {
    
    public void start(Student s) {
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        
        VBox root = new VBox();
        TextField gpaTF = new TextField();
        Button submitBtn = new Button("Submit");
        Label nameLabel = new Label(s.getName());
        root.getChildren().addAll(new Label("Name: "),nameLabel);
        root.getChildren().addAll(new Label("GPA: "), gpaTF, submitBtn);
        
        submitBtn.setOnAction(e->{
            String gpaStr = gpaTF.getText();
            double gpa = Double.parseDouble(gpaStr);
            s.setGpa(gpa);
            primaryStage.close();
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Display student name");
        primaryStage.setScene(scene);
        primaryStage.showAndWait();
    }


    
}
