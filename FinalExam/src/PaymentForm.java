/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class PaymentForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        GridPane top = new GridPane();
        top.add(new Label("Order ID: "),0,0);
        top.add(new Label("Order date:"),0,1);
        top.add(new Label("Order Ammount:"),0,2);
        top.add(new Label("Payment Method:"),0,3);
        
        TextField tf1 = new TextField();
        Label dateLabel = new Label("------"); 
        Label ammountLabel = new Label("------"); 
        
        
        RadioButton cash = new RadioButton("Cash");
        RadioButton creditCard = new RadioButton("Credit Card");
        ToggleGroup pMethodTG = new ToggleGroup();
        cash.setToggleGroup(pMethodTG);
        creditCard.setToggleGroup(pMethodTG);
        VBox pMethodVB = new VBox();
        pMethodVB.getChildren().addAll(cash,creditCard);
        
        top.add(tf1, 1, 0);
        top.add(dateLabel, 1, 1);
        top.add(ammountLabel, 1, 2);
        top.add(pMethodVB ,1,3);
        
        Button SearchBT = new Button("Search");
        
        top.add(SearchBT, 2, 0);
        
        root.getChildren().addAll(top);
        
        StackPane bottom = new StackPane();
        
        //cash
        GridPane btCash = new GridPane();
        btCash.add(new Label("Pay Amount:"),0,0);
        btCash.add(new Label("Balance:"),0,1);

        
        TextField tfcash = new TextField();
        Label LBalance = new Label(); 
        Button Submit = new Button("Submit");
        
        
        btCash.add(tfcash, 1, 0);
        btCash.add(LBalance, 1, 1);
        btCash.add(Submit, 1, 2);
        btCash.setVisible(false);
        
        root.getChildren().addAll(btCash);
        
        //CreditCard
        GridPane btCreditCard = new GridPane();
        btCreditCard.add(new Label("Creadit Card Nmbers:"),0,0);
        btCreditCard.add(new Label("Expired Date:"),0,1);
        
        
        TextField tfCreditCard = new TextField();
        HBox HBExpiredDate = new HBox();
        
        
        
        ComboBox<String> month,year;
        String[] months = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        ObservableList MonthsList =
        FXCollections.observableArrayList(months);
        month = new ComboBox<String>(MonthsList);
        
        String[] years = {"2019","2020","2021","2022","2023","2024","2025"};
        ObservableList YearList =
        FXCollections.observableArrayList(years);
        year = new ComboBox<String>(YearList);
        HBExpiredDate.getChildren().addAll(month,new Label("/"),year);
        
        
        Button Submit1 = new Button("Submit");
        
        
        btCreditCard.add(tfCreditCard, 1, 0);
        btCreditCard.add(HBExpiredDate, 1, 1);
        btCreditCard.add(Submit1, 1, 2);
        btCreditCard.setVisible(false);
        
        
        
        
        
        bottom.getChildren().addAll(btCash,btCreditCard);
        
        root.getChildren().addAll(bottom);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Payment Form");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        cash.setOnAction(e->{
            if(cash.isSelected()){
                btCreditCard.setVisible(false);
                btCash.setVisible(true);
            }
        });
        
        creditCard.setOnAction(e->{
            if(creditCard.isSelected()){
                btCash.setVisible(false);
                btCreditCard.setVisible(true);
            }
        });
        
        
       
        SearchBT.setOnAction(e->{
            try{
                File file = new File(tf1.getText()+".txt");
                Scanner inputFromFile = new Scanner(file);
            
                String[] info = new String[2];
                dateLabel.setText(inputFromFile.next());
                ammountLabel.setText(inputFromFile.next());
            }catch(FileNotFoundException fnf){
                JOptionPane.showMessageDialog(null, "invalide Order ID");
                dateLabel.setText("------");
                ammountLabel.setText("------");
        }
        });
        
        Submit.setOnAction(e->{
            try{


                double Balance = Double.valueOf(tfcash.getText())-Double.valueOf(ammountLabel.getText());
                LBalance.setText(String.valueOf(Balance));
                
                if (Balance>=0){
                   JOptionPane.showMessageDialog(null, "Thank You For your Payment"); 
                }else{
                    JOptionPane.showMessageDialog(null, "please enter correct ammount");
                }
                
                
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "invalide Order ID");
            }catch(IllegalArgumentException ae){
                JOptionPane.showMessageDialog(null, "please search before submint");
            }
            
        });
        
        Submit1.setOnAction(e->{
            try{
                String num = tfCreditCard.getText();
                
                int n1 = Integer.valueOf(num.substring(1,2))*2;
                int n2 = Integer.valueOf(num.substring(3,4))*2;
                int add = Integer.valueOf(num.substring(0,1))+n1+Integer.valueOf(num.substring(2,3))+n2;
                String Add =String.valueOf(add);
                
                if(Add.substring(1,2).equals(num.substring(4,5))){
                    JOptionPane.showMessageDialog(null, "Thank You For your Payment"); 
                }else{
                    JOptionPane.showMessageDialog(null, "invalade number");
                }
                
            }catch(IllegalArgumentException ae){
                JOptionPane.showMessageDialog(null, "please search before submint");
            }
            
        });
        
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
