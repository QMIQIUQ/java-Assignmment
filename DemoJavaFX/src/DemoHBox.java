/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoHBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        
        Image image = new Image("image/logo.png");
        //if cannot get the resource
        //Image image = new Image(getClass().getResource("image/car.jpg").toString());
        ImageView view1 = new ImageView(image);
        view1.setFitHeight(100);
        view1.setFitWidth(100);
        ImageView view2 = new ImageView(image);
        view2.setFitHeight(200);
        view2.setFitWidth(200);
        Label label1 = new Label("my dream car");
        
        pane.getChildren().addAll(view1,view2,label1);
        //remove all the components => pane.getChildren().clear();
        //remove 1 item method => 
        pane.getChildren().remove(view1);
        //remove 1 item method => pane.getChildren().removeAll();
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
