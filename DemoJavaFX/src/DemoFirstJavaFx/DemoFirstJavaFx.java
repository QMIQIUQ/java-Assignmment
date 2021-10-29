/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoFirstJavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoFirstJavaFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Button okBtn = new Button("ok");
        
        Scene scene = new Scene(okBtn, 300, 250);
        
        primaryStage.setTitle("My First Java FX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        Button cancleBtn = new Button("cancle");
        
        Scene scene1 = new Scene(cancleBtn, 100, 100);
        
        Stage Stage2 = new Stage();
        Stage2.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
