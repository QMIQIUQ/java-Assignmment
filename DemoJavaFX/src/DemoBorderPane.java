/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoBorderPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button topBtn,bottomBtn,leftBtn,rightBtn;
        BorderPane pane = new BorderPane();
        
        pane.setTop(topBtn = new Button("TOP"));
        pane.setBottom(bottomBtn = new Button("Buttom"));
        pane.setLeft(leftBtn = new Button("Left"));
        pane.setRight(rightBtn = new Button("Right"));
        pane.setCenter(new Button("Center"));
        
        //set top and buttom button to center
        pane.setAlignment(topBtn,Pos.CENTER);
        pane.setAlignment(bottomBtn,Pos.CENTER);
        pane.setAlignment(leftBtn,Pos.CENTER);
        pane.setAlignment(rightBtn,Pos.CENTER);
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
