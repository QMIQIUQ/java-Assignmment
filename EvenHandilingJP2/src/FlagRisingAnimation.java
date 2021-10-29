import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		ImageView view = new ImageView("image/us.gif");
		pane.getChildren().add(view);
		
		
		
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
