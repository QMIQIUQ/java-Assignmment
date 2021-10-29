/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author lc3532
 */
public class TestComboBox  {
    private String[] stateArray = {"Johor", "Kuala Lumpur"};
    private String chooseState;
    
    public String getStart() { 
        Stage primaryStage = new Stage();
        /*initModality(Modality.APPLICATION_MODAL);,
        defines a window that blocks events from being delivered to any other 
        application window. So once this pop up window appears, 
        you cannot interact with any other window, including the 
        main program window, until you either do what's required by the pop up window 
        or close it out.*/
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        
        FlowPane root = new FlowPane();
        TextField stateName = new TextField();
        Button enterBtn = new Button("Enter");
        root.getChildren().addAll(stateName, enterBtn);
        
        ObservableList<String> item = FXCollections.observableArrayList(stateArray);
        ComboBox<String> locationCB = new ComboBox<String>(item);
        
        root.getChildren().addAll(locationCB);
        
        enterBtn.setOnAction(e->{
            String state = stateName.getText();
            locationCB.getItems().add(state);
        });
        
        locationCB.setOnAction(e->{
            chooseState = locationCB.getValue();
			//close the window after user choose any option from the combo box
         	primaryStage.close();
        });
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        /*showAndWait() => 
        show the window and keeps the window up until it is either hidden or 
        closed out. */
        primaryStage.showAndWait(); 
       
        
        return chooseState;
    }

    
    
}
