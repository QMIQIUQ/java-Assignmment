/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class demoComboBox extends Application {
    //spesified as string value,if not it will treet it as object
    private ComboBox<String> stateCB;
    private String[] stateArray = {"Johor","Kuala Lumpur"};
    Button enterBtn;
    TextField stateTF;
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        //add a textFill and a button
        stateTF = new TextField();
        //set text filed cannot edit
        //stateTF.setEditable(false);
        enterBtn = new Button("Enter");
        
        root.getChildren().addAll(stateTF,enterBtn);
        ObservableList sList =
        FXCollections.observableArrayList(stateArray);
        stateCB = new ComboBox<String>(sList);
        stateCB.setValue(stateArray[0]);
        root.getChildren().add(stateCB);
        
        //display data of state selected by student
        stateCB.setOnAction(e->{
            //display value sellected by user
            System.out.println(stateCB.getValue());
            //display index of items that selected by user
            System.out.println(sList.indexOf(stateCB.getValue()));
        });
        //enterBtn =>user type on stateTF ,insertdata in stateCB
        
        enterBtn.setOnAction(e->{
        //read data from textField
        String state = stateTF.getText();
        //insert data in ComboBox
        stateCB.getItems().add(0,state);
        //remove the data that you type in TF that same as state[]
        //stateCB.getItems().remove(state);
        //clear all the data inside state
        //stateCB.getItems().clear(state);
        });
        
        
        //textarea
        TextArea addressTA = new TextArea();
        //resize textArea
        addressTA.setPrefColumnCount(50);
        addressTA.setPrefRowCount(3);
        Button displayBtn = new Button("Display Address");
        
        root.getChildren().addAll(addressTA,displayBtn);
        
        displayBtn.setOnAction(e->{
        
            System.out.println(addressTA.getText());
        });
        
        
        
        //listView
        String[] studentNameList = {"Ali", "Ahmad"};
        ObservableList nameItems = FXCollections.observableArrayList(studentNameList);
        
        ListView nameList = new ListView(nameItems);
        //by default single selection
        nameList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        root.getChildren().add(nameList);
        
        //display the name that sellect by user
        //write listener on list (when selected it will got function)
        nameList.getSelectionModel().selectedIndexProperty().addListener(e->{
            ObservableList list = nameList.getSelectionModel().getSelectedItems();
            for(int i = 0 ; i<list.size();i++){
                System.out.println(list.get(i));
            }
        });
        
        
        
        Scene scene = new Scene(root);
        
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
