/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemFlowPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button okBtn = new Button("OK");
        Button cancleBtn = new Button("Cancle");
        
        
        FlowPane pane = new FlowPane(10,5);
        pane.setAlignment(Pos.TOP_RIGHT);
        pane.getChildren().addAll(okBtn,cancleBtn);
        for(int i =1; i<10;i++){
            Button Btn = new Button("Button"+i);
            pane.getChildren().add(Btn);
        }
        
        
        
        
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
