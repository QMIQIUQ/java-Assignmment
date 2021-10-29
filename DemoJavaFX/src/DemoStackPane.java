/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoStackPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        Button btn = new Button("OK");
        root.getChildren().add(btn);
        Circle c1 = new Circle();
        c1.setRadius(50);
        c1.setFill(null);//fill out the cirrcle with a color
        c1.setStroke(Color.BLACK);//set stroke(outline)
        root.getChildren().add(c1);
        
        Circle c2 = new Circle();
        c2.setRadius(30);
        c2.setFill(Color.PINK);
        c2.setStroke(Color.BLUE);
        root.getChildren().add(c2);
        
        //Shape class = new Shape();
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
