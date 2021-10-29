import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleHandleEvent extends Application{
    static Button okbttn ,cancelbttn;
	public void start(Stage s) {
		HBox p = new HBox();
		okbttn = new Button("Ok");
		cancelbttn = new Button("Cancel");
		
		p.getChildren().addAll(okbttn, cancelbttn);
                
                OKHandle okHandle = new OKHandle();
                okbttn.setOnAction(okHandle);
		
                //Anonunomous class
                cancelbttn.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                
                public void handle(ActionEvent e){
                    System.out.println("Anonunomous class - Cancel Button");
                }
                });
                
                
                
                
		Scene scene = new Scene(p, 580, 100);
		s.setScene(scene);
		s.setTitle("Simple Handle Event");
		s.show();
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
        
        
 //inner class       
class OKHandle implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        
        //show the object that
        System.out.println(e.getSource());
        System.out.println(SimpleHandleEvent.okbttn);
        
        //SimpleHandleEvent a = new SimpleHandleEvent();
        if(e.getSource().equals(okbttn)){
            System.out.println("This is ok Button");
        }else{
            System.out.println("This is Cancel Button");
        }
    }
}     
        

}//end class


//outer class- event handler class

class CancelHandle implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("This is Cancel Button");
    }
}