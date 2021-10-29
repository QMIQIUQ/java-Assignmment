

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "A");
    
    pane.getChildren().add(text);
    
    
    // Create a scene and place the pane in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("KeyEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    //key type/key release, key press
    //lambda expression
    pane.setOnKeyPressed(e->{
    //System.out.println(e.getCharacter());
    //text.setText(e.getText());
    
    
    double x = text.getX();
    double y = text.getY();
    switch(e.getCode()){//get code
        case UP:
            y = y-2;
            break;
        case DOWN:
            y = y+2;
            break;
        case LEFT:
            x = x-2;
            break;
        case RIGHT:
            x = x+2;
            break;

        default:
            text.setText(e.getText());
    }
    
    text.setX(x);
    text.setY(y);
    
    
    });
    //set/return focus to the pane !!!must have!!!
    pane.requestFocus();
    
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

