/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */



public class DemoCheckBox extends Application {
    private CheckBox readCB,swimCB,surfNetCB;
    private Label resultLabel,genderLabel;
    private RadioButton maleRB,femaleRB,ptRB,ftRB;
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane  pane = new FlowPane();
        VBox hobbyPane = new VBox();
        readCB = new CheckBox("Reading");
        swimCB = new CheckBox("Swimming");
        surfNetCB = new CheckBox("Surf Net");
        resultLabel  = new Label();
        Button submintBtn = new Button("Submmit");
        
        hobbyPane.getChildren().addAll(readCB,swimCB,surfNetCB,resultLabel,submintBtn);
        
        pane.getChildren().add(hobbyPane);
        
        VBox genderP = new VBox();
        maleRB = new RadioButton("Male");
        femaleRB = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        maleRB.setToggleGroup(genderGroup);
        femaleRB.setToggleGroup(genderGroup);
        genderP.getChildren().addAll(maleRB,femaleRB);
        pane.getChildren().add(genderP);
        
        VBox statusP = new VBox();
        ptRB = new RadioButton("Part Time");
        ftRB = new RadioButton("FullTime");
        ToggleGroup statusGroup = new ToggleGroup();
        ptRB.setToggleGroup(statusGroup);
        ftRB.setToggleGroup(statusGroup);
        statusP.getChildren().addAll(ptRB,ftRB);
        pane.getChildren().add(statusP);
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //set as general buton
        EventHandler callHobby = e->{
            resultLabel.setText(displayHobbies());
        };
        
        
        //Action
        readCB.setOnAction(callHobby);
        swimCB.setOnAction(callHobby);
        surfNetCB.setOnAction(callHobby);
        
        
        //radioBtn => Action
        maleRB.setOnAction(e->{
            if(maleRB.isSelected()){
                genderP.getChildren().remove(genderLabel);
                genderP.getChildren().add(genderLabel = new Label(displayGender()));
            }
        
        });
        
        femaleRB.setOnAction(e->{
            if(femaleRB.isSelected()){
                genderP.getChildren().remove(genderLabel);
                genderP.getChildren().add(genderLabel = new Label(displayGender()));
            }
        
        });
        
    }

    public String displayGender(){
        if(maleRB.isSelected()){
                //genderP.getChildren().add(new Label("Male"));
                return maleRB.getText();
        }else{
            return femaleRB.getText();
        }
            
    }
    
    
    
    public String displayHobbies(){
    String hobby = "";



            if(readCB.isSelected()){
                hobby += readCB.getText();
                //JOptionPane.showMessageDialog(null, readCB.getText());
            } if(swimCB.isSelected()){
                hobby += swimCB.getText();
                //JOptionPane.showMessageDialog(null, readCB.getText());
            } if(surfNetCB.isSelected()){
                hobby += surfNetCB.getText();
                //JOptionPane.showMessageDialog(null, readCB.getText());
            }
            
        

        return hobby;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
