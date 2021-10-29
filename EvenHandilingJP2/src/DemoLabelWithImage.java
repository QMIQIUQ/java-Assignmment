/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoLabelWithImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        Image image = new Image("file:resources/dog.jpg");
        ImageView view = new ImageView(image);
        view.setFitHeight(50);
        view.setFitWidth(50);
        Label dogLabel = new Label("The name of the dog is Happy!!",view);
        dogLabel.setContentDisplay(ContentDisplay.BOTTOM);
        //adjust the size of label
        dogLabel.setMaxWidth(60);
        dogLabel.setWrapText(true);//show the hidden/too long text
        
        Circle c = new Circle(50);
        c.setFill(Color.PINK);
        c.setStroke(Color.BLUE);
        Button btn = new Button("Circle",c);
        btn.setContentDisplay(ContentDisplay.TOP);
        //fix size => PredderedSize
        btn.setPrefSize(80, 80);
        
        
        root.getChildren().add(btn);
        
        StackPane s = new StackPane();
        Rectangle r = new Rectangle(20,30);
        r.setFill(Color.PINK);
        r.setStroke(Color.BLACK);
        s.getChildren().addAll(r,new Text("hello"));
        Button btn2 = new Button("Demo button with pane inside");
        root.getChildren().addAll(s,btn2);
        
        
        
        
        root.getChildren().add(dogLabel);
        
        
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
