import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DemoFadeTransition extends Application{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Ellipse e = new Ellipse(100,100,100,50);
		e.setFill(Color.RED);
		e.setStroke(Color.BLACK);
		
		pane.getChildren().add(e);
		
		
		
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
