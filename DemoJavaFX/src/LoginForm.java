/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class LoginForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-Background-color:white");
        
        //grid pane center
        GridPane center = new GridPane();
        
        TextField text1 = new TextField();
        TextField text2 = new TextField();
        Label label1 = new Label("Username: ");
        Label label2 = new Label("Password: ");
        center.add(label1, 0, 0);
        center.add(label2, 0, 1);
        center.add(text1, 1, 0);
        center.add(text2, 1, 1);
        label1.setPadding(new Insets(20,50,20,50));
        label2.setPadding(new Insets(20,50,20,50));
        
        pane.setCenter(center);
        center.setAlignment(Pos.CENTER);
        
        //HBox bottom
        HBox bottom = new HBox();
        bottom.setPadding(new Insets(0, 0, 50, 0));
        Button b1 = new Button("    Submit  ");
        Button b2 = new Button("    Clear   ");
        Button b3 = new Button("    Exit    ");
        bottom.setSpacing(100);
        bottom.getChildren().addAll(b1,b2,b3);
        
        
        
        pane.setBottom(bottom);
        bottom.setAlignment(Pos.CENTER);
        
        
        //pane top
        HBox top = new HBox();
        top.setPadding(new Insets(50, 50, 0, 50));
        Image image1 = new Image("image/logo.png");
        ImageView view1 = new ImageView(image1);
        view1.setFitHeight(200);
        view1.setFitWidth(200);
        Text msg = new Text(60,40,"Southern Univercity Collage");
        msg.setFont(Font.font(60));
        top.getChildren().addAll(view1,msg);
        
        pane.setTop(top);
        top.setAlignment(Pos.CENTER);
        
        
        
        
        Scene scene = new Scene(pane, 1000, 600);
        
        primaryStage.setTitle("Login Form!");
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
