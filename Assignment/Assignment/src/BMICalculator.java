/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class BMICalculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox  root = new VBox();
        root.setStyle("-fx-background-color:white");
        
        
        StackPane genderSP = new StackPane();
        HBox genderHB = new HBox();
        genderHB.setSpacing(50);
        RadioButton maleRB = new RadioButton("Male");
        RadioButton femaleRB = new RadioButton("Female");
        maleRB.setPadding(new Insets(10));
        femaleRB.setPadding(new Insets(10));
        genderHB.getChildren().add(maleRB);
        genderHB.getChildren().add(femaleRB);
        genderSP.getChildren().add(genderHB);
        ToggleGroup genderTG = new ToggleGroup();
        maleRB.setToggleGroup(genderTG);
        femaleRB.setToggleGroup(genderTG);
        genderTG.selectToggle(maleRB);
        
        HBox button = new HBox();
        StackPane buttonSP = new StackPane();
        Button calculate = new Button("Calculate");
        Button exit = new Button("Exit");
        calculate.setPrefSize(120, 20);
        exit.setPrefSize(120, 20);
        button.setSpacing(50);
        button.setPadding(new Insets(0,0,0,70));
        button.getChildren().addAll(calculate,exit);
        buttonSP.getChildren().add(button);
        
        
        GridPane pane = new GridPane();
        Text name = new Text("Name:                                    ");
        Text weight = new Text("Weight(KG):");
        Text height = new Text("Height(M):");
        Text gender = new Text("Gender:");
        
        
        
        
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        t1.setPrefSize(200, 40);
        t2.setPrefSize(200, 40);
        t3.setPrefSize(200, 40);
            
        pane.add(name,0,0);
        pane.add(weight,0,1);
        pane.add(height,0,2);
        pane.add(gender,0,3);
        pane.add(t1,1,0);
        pane.add(t2,1,1);
        pane.add(t3,1,2);
        pane.add(genderSP, 1, 3);
        
        
        
        StackPane resultSP = new StackPane();
        
        Pane resultP = new Pane();
        
        Text result = new Text(" Result ");
        result.setStyle("-fx-font-weight: bold");
        result.setUnderline(true);
        result.relocate(10,0);
        GridPane resultGP = new GridPane();
        Text weightStatus = new Text();
        Label resultView = new Label(""),resultView1 = new Label(""),resultView2 = new Label("");
        resultGP.add(resultView,0,0);
        resultGP.add(weightStatus,0,1);
        resultGP.relocate(15, 50);
        resultView1.relocate(15, 65);
        resultView2.relocate(15, 80);
        
        resultP.getChildren().addAll(result,resultGP,resultView1,resultView2);
        
        
        Label Result;
        Rectangle r1 = new Rectangle(400,200);
        r1.setFill(Color.SEASHELL);
        r1.setStroke(Color.LIGHTBLUE);
        Result = new Label("",r1);
        Result.setPadding(new Insets(6));
        
        
        
        
        
        
        VBox info = new VBox();
        StackPane a = new StackPane();
        Text text = new Text("Male");
        text.setStyle("-fx-font-weight: bold");
        a.getChildren().add(text);
        GridPane infoGP = new GridPane();
        
        StackPane b = new StackPane();
        Text l0 = new Text("BMI");
        l0.setStyle("-fx-font-weight: bold");
        b.getChildren().add(l0);
        Label l1 = new Label("Below 20");
        Label l2 = new Label("20-24.9");
        Label l3 = new Label("24.9-31.9");
        Label l4 = new Label("32 and above     ");
        
        StackPane c = new StackPane();
        Text l5 = new Text("Weight Status");
        c.getChildren().add(l5);
        l5.setStyle("-fx-font-weight: bold");
        Label l6 = new Label("Underweight");
        Label l7 = new Label("Normal");
        Label l8 = new Label("Overweight");
        Label l9 = new Label("Obese");
        
        infoGP.add(l0, 0, 0);
        infoGP.add(l1, 0, 1);
        infoGP.add(l2, 0, 2);
        infoGP.add(l3, 0, 3);
        infoGP.add(l4, 0, 4);
        infoGP.add(l5, 1, 0);
        infoGP.add(l6, 1, 1);
        infoGP.add(l7, 1, 2);
        infoGP.add(l8, 1, 3);
        infoGP.add(l9, 1, 4);
        
        info.getChildren().addAll(a,infoGP);
        info.relocate(195, 15);
        info.setVisible(false);
        resultP.getChildren().add(info);
        
        CheckBox infoCB = new CheckBox("BMI Info :");
        infoCB.relocate(180, 15);
        resultP.getChildren().add(infoCB);
        
        
        root.getChildren().add(pane);
        resultSP.getChildren().addAll(Result,resultP);
        root.getChildren().add(buttonSP);
        root.getChildren().add(resultSP);
        
        Scene scene = new Scene(root);
        
        
        
        
        
        
        primaryStage.setTitle("BMI System");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        maleRB.setOnAction(e->{
            if(maleRB.isSelected()){
                text.setText("Male");
                l1.setText("Below 20");
                l2.setText("20-24.9");
                l3.setText("24.9-31.9");
                l4.setText("32 adn above     ");
            }
        
        
        });
        femaleRB.setOnAction(e->{
            if(femaleRB.isSelected()){
                text.setText("Female");
                l1.setText("Below18.5");
                l2.setText("18.5-21.9");
                l3.setText("22-27.9");
                l4.setText("28 and above     ");
            }
        
        
        });
        
        
        
        infoCB.setOnAction(e->{
        if(infoCB.isSelected()){
            info.setVisible(true);
        }else{
            info.setVisible(false);
        }
        
        
        
        });
        
        
        calculate.setOnAction(e->{
            
        //start try
        resultView.setText("");
        resultView1.setText("");
        resultView2.setText("");
        
        Boolean pass = false;
        double BMI=0,weightTF=0,heightTF=1;
        String Gender = new String();
        
        
        try{  
            heightTF = Double.parseDouble(t3.getText());
            weightTF = Double.parseDouble(t2.getText());
            
            if(heightTF == 0){
            heightTF = 2/0;
            
            }
            //calculate BMI
            BMI = weightTF/(heightTF*heightTF);
            weightStatus.setVisible(false);
            if(maleRB.isSelected()){
                Gender = "male";
                if(BMI<20){
                    weightStatus.setText("Underweight");
                    weightStatus.setFill(Color.GREENYELLOW);
                }if(BMI>=20 && BMI<=24.9){
                    weightStatus.setText("Normal");
                    weightStatus.setFill(Color.GREEN);
                }if(BMI>=25 && BMI<=31.9){
                    weightStatus.setText("Overweight");
                    weightStatus.setFill(Color.ORANGE);
                }if(BMI>=32){
                    weightStatus.setText("Obese");
                    weightStatus.setFill(Color.RED);
                }
            }
            if(femaleRB.isSelected()){
                Gender = "Female";
                if(BMI<18.5){
                    weightStatus.setText("Underweight");
                    weightStatus.setFill(Color.GREENYELLOW);
                }if(BMI>=18.5 && BMI<=21.9){
                    weightStatus.setText("Normal");
                    weightStatus.setFill(Color.GREEN);
                }if(BMI>=22 && BMI<=27.9){
                    weightStatus.setText("Overweight");
                    weightStatus.setFill(Color.ORANGE);
                }if(BMI>=28){
                    weightStatus.setText("Obese");
                    weightStatus.setFill(Color.RED);
                }
            }
            
            pass = true;
            

            
        
        //end try
        }catch(ArithmeticException q){
            resultView.setText("!Height cannot be 0!");
            
  
        }catch(NumberFormatException q){
            if(heightTF == 0){
            resultView.setText("!Height cannot be 0!");
            
            }
            resultView1.setText("!Please Enter number!");
           
        }
        
        
        if(t1.getText()==null || t1.getText().isEmpty()||t1.getText().trim().isEmpty()){
           resultView2.setText("!Please Enter Name!"); 
        }else if(pass == true){
            resultView.setText(String.valueOf("Name: "+t1.getText()+"\nWeight: "+weightTF+" kg\nHeight: "+heightTF+" m\nGender: "+Gender+"\nBMI: "+BMI));
            weightStatus.setVisible(true);
        }
        
        
        
        
        
        
        
        
        
        
       // end lamda expresstion
        });
        
        exit.setOnAction(e->{
            Object[] options = {"Yes","No"};
            int i = JOptionPane.showOptionDialog(null,"Are You Sure to Exit?","Exit?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
            if(i == 0){
                System.exit(0);
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
