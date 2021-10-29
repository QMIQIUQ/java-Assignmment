/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoRemoveComponents extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        FlowPane  buttonPane = new FlowPane();
        buttonPane.getChildren().addAll(new Button("ok"),new Button("Cancle"));
        pane.getChildren().add(buttonPane);
        
        StackPane logoPane = new StackPane();
        logoPane.setStyle("-fx-background-color:pink");
        Circle c1 = new Circle(100);
        Circle c2 = new Circle(50);
        c2.setFill(Color.BLUE);
        logoPane.getChildren().addAll(c1,c2);
        pane.getChildren().add(logoPane);
        
        buttonPane.getChildren().clear();
        buttonPane.getChildren().add(new Button("Exit"));
        
        
        //remove stackpane from VBox pane
        logoPane.getChildren().remove(c1);
        
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
