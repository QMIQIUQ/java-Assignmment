import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class DemoLambdaHandler extends Application{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		HBox p = new HBox();
		p.setSpacing(10);
		p.setAlignment(Pos.CENTER);
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		Button btExit = new Button("Exit");
		p.getChildren().addAll(btNew,btOpen,btSave,btPrint,btExit);
		
		//create and register the handler for
		//1) new button by using anonymous inner class and it will display "Process new" after clicked
		
                btNew.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"Process new");
                }
                });
                
                
                
		
		//2) Open button by using lambda expression with declared type and it will display "Process open" after clicked
		btOpen.setOnAction((ActionEvent e)->{
                    JOptionPane.showMessageDialog(null,"Process open");
                
                });
                
                
		
		//3) Save button by using lambda expression with inferred type (the type can be determined by the compiler) and it will display "Process Save" after clicked
		btSave.setOnAction((e)->{
                    JOptionPane.showMessageDialog(null,"Process save");
                });
                
                
		
		//4) Print button by using lambda expression with omit the parentheses for a single inferred type and it will display "Process print" after clicked
		btPrint.setOnAction(e->{
                    JOptionPane.showMessageDialog(null,"Process print");
                });
		
		//5) Exit button by using lambda expression and it will display "Process exit" after clicked
		//omit braces for single statement in the body
                btExit.setOnAction(e->System.exit(0));
                
		
		
	    Scene scene = new Scene(p, 300, 150);
	    primaryStage.setTitle("Lambda Expression"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	
	public static void main(String[] args) {
	      Application.launch(args);
	  }
}
