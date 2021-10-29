import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DemoTimeLine extends Application{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		
		Text text = new Text(20,50, "Programming is fun");
		text.setFill(Color.RED);		
		pane.getChildren().add(text);
		
		//text blinking effect
		EventHandler<ActionEvent> eventHandle = e->{
			if(text.getText().length() != 0) {
				text.setText("");
			}else {
				text.setText("Programming is fun");
			}
			
		};
		
		
		// Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 200, 150);
	    primaryStage.setTitle("Demo Path transition"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	   
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }
}
