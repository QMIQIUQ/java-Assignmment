/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class buttonExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        
        Text l1 = new Text(80,50,"JavaFX Programing");
        
        Button b1 = new Button("<Left");
        b1.relocate(80, 100);
        Button b2 = new Button("Right>");
        b2.relocate(150, 100);
        
        root.getChildren().addAll(l1,b1,b2);
        
        
        
        b1.setOnAction(e->{
            double x = l1.getX();
            x = x-2;
        l1.setX(x);
        });
        
        b2.setOnAction(e->{
            double x = l1.getX();
            x = x+2;
        l1.setX(x);
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
