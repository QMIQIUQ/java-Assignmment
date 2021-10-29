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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoGripPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane  pane = new GridPane();
        //Label lable = new Label("Name: ");
        TextField nameTextField = new TextField();
        pane.add(new Label("Name: "),0,0);//col =0, row =0,
        pane.add(nameTextField,1,0);//col =1, row =0,
        pane.add(new Button("Ok"),0,1);
        pane.add(new Button("Exit"),1,1);
        
        
        Scene scene = new Scene(pane, 300, 250);
        
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
