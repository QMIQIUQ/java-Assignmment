import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class DemoPathTransition extends Application{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle rec = new Rectangle(0,0,25,50);
		rec.setFill(Color.ORANGE);
		
		Circle cir = new Circle(125,100,50);
		cir.setFill(null); 
		cir.setStroke(Color.BLACK);
		
		pane.getChildren().addAll(rec, cir);
			
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
