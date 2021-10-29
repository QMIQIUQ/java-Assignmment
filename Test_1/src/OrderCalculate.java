/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class OrderCalculate extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        GridPane top = new GridPane();
        Label l1,l2,l3;
        TextField t1,t2;
       
        //top.add(l1 = new Label("Order Id:"), 0, 0);
        top.add(l2 = new Label("Customer Name:"), 0, 1);
        top.add(l3 = new Label("Quantity:"), 0, 2);
        top.add(t1 = new TextField(),1,1);
        top.add(t2 = new TextField(),1,2);
        
        BorderPane btm = new BorderPane();
        HBox btm1 = new HBox();
        Button b1= new Button("Calculate");
        Button b2= new Button("Exit");
        btm1.getChildren().addAll(b1,b2);
        btm.setBottom(btm1);
        btm1.setAlignment(Pos.CENTER);
        
        VBox root = new VBox();
        Label msg = new Label();
        msg.setPrefHeight(300);
        
        
        
        root.getChildren().addAll(top,msg,btm);
        
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Order Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        b1.setOnAction(e->{
            
            Order o1=new Order(t1.getText(),Integer.parseInt(t2.getText()));
            
            if(Integer.parseInt(t2.getText())<1){
                msg.setText("Please enter a positive number");
            }else{
                Object[] options = {"Yes","No"};
                int dia = JOptionPane.showOptionDialog(null,"Give 5% discount for this customer?","Discount?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
                
                if(dia == JOptionPane.YES_OPTION){
                     msg.setText(o1.toString()+"\nDiscount Amount:"+o1.calculatePrice()*0.05+"(5%)"+"\nFinal Price = RM "+((o1.calculatePrice())-(o1.calculatePrice()*0.05)));
                }else{
                    msg.setText(o1.toString()+"\nDiscount Amount:0"+"\nFinal Price = RM "+o1.calculatePrice());
                }
                

                
            }


        });
        
        b2.setOnAction(e->{
        System.exit(0);
        });
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
