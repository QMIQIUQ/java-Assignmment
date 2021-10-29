

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class MouseEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "Programming is fun");
    pane.getChildren().addAll(text);   

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 100);
    primaryStage.setTitle("MouseEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
   
    
    
    //mouse press, release, click
    pane.setOnMouseClicked(new EventHandler<MouseEvent>(){
    @Override
    public void handle(MouseEvent e){
        System.out.println("You click on ("+e.getX()+","+e.getY()+")");
        System.out.println(e.getClickCount());
        //when user clich on right button=> exit the form
        //when iuser click on left button => display hello
        if(e.getButton() == MouseButton.PRIMARY){
            JOptionPane.showMessageDialog(null, "hello");
        
        }else if(e.getButton()== MouseButton.SECONDARY){
            System.exit(0);
        }
        
        
    }
    });
    
    
    //mouse exit, enter
    pane.setOnMouseEntered(e->{
    
    System.out.println("mouse enter");
    
    });
    
    pane.setOnMouseExited(e->{
    ;
    System.out.println("mouse exit");
    
    });
    
    //mouse move ,mouse drag
    pane.setOnMouseMoved(e->{
    //moving the text
    //rellocate the text position when mouse moving
    //get current x,y
    double currentX = e.getX();
    double currentY = e.getY();
    text.relocate(currentX, currentY);
    
    
    });
    
  }//end start

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

