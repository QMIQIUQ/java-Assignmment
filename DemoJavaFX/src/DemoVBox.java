/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoVBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        pane.setStyle("-fx-background-color:pink");
        pane.setSpacing(10);//spacing between the control compoment;
        pane.setPadding(new Insets(10,50,10,50));//top right bottom left
        Label label1 = new Label("Welcome to Java ");
        Label label2 = new Label("I am a Boy");
        Label label3 = new Label("Hello world");
        pane.getChildren().addAll(label1,label2,label3);
        label1.setStyle("-fx-background-color: white;");//html code
        label1.setTextFill(Color.PURPLE);
        Color color = new Color(0.5,0,0.5,0.8);//r,g,b,transparency
        
        label2.setTextFill(color);
        label3.setTextFill(Color.color(1, 0, 1));//rgb
        
        Font font1 = new Font("Times New Roman",50);
        label1.setFont(font1);
        label2.setFont(Font.font("Times New Roman",FontWeight.BOLD,50));
        
        
        Scene scene = new Scene(pane, 1000, 500);
        
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
