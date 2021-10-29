/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class DemoShape extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: pink");
        //write text using text (Cna spasified the position)
       
        Text message = new Text(20,30,"hello");
        message.setStrikethrough(true);
        message.setUnderline(true);
        message.setFill(Color.RED);
        message.setFont(Font.font("Times New Roman",20));
        pane.getChildren().add(message);
       
       
        //draw circle
        Circle c = new Circle(100,30,20);//Circle(80,30,50)<=posttion
        pane.getChildren().add(c);
       
       
        //draw line
        Line l1 = new Line(20,50,80,80);
        Line l2 = new Line(20,80,80,50);
        l1.setStroke(Color.GREEN);
        l2.setStroke(Color.RED);
        pane.getChildren().addAll(l1,l2);
       
        //draw rectengle
        Rectangle rec1 = new Rectangle(20,100,100,100);
        //rectangle with round sides
        Rectangle rec2 = new Rectangle(20,250,100,100);
        rec2.setArcWidth(50);
        rec2.setArcHeight(50);
        pane.getChildren().addAll(rec1,rec2);
       
        //draw ellopse
        Ellipse e = new Ellipse(200,100,50,100);
        pane.getChildren().add(e);
       
        //draw arcs start from Ellipse
        Arc a1 = new Arc(400,100,100,50,0,30);
        //Arc(x,y,radius x,radius y, start angle,length/angle);
        Arc a2 = new Arc(400,100,100,50,90,30);
        Arc a3 = new Arc(400,100,100,50,180,30);
        Arc a4 = new Arc(400,100,100,50,270,30);
        a1.setType(ArcType.ROUND);
        a2.setType(ArcType.ROUND);
        a3.setType(ArcType.ROUND);
        a4.setType(ArcType.ROUND);
        Arc a5 = new Arc(400,100,100,50,270,30);
        a5.setType(ArcType.OPEN);
        a5.setFill(Color.RED);
        pane.getChildren().addAll(a1,a2,a3,a4,a5);
       
        //draw Polygon connet back to start
        //polyline dose not connet to start
        Polyline p1 = new Polyline();
        p1.getPoints().add(20.0);//x
        p1.getPoints().add(400.0);//y
        p1.getPoints().add(20.0);//x
        p1.getPoints().add(450.0);//y
        p1.getPoints().add(50.0);//x
        p1.getPoints().add(450.0);//y
        pane.getChildren().addAll(p1);
        
        
        
        
        
        Scene scene = new Scene(pane, 500, 400);
        
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
