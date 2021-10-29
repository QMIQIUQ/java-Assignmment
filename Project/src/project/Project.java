/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Project extends Application {
    private final static int width = 800;
    private final static int height = 600;
    private Image img1,img2,img3,img4,img5,img6,img7;
    private ImageView view1,view2,view3,view4,view5,view6,view7;
    private Label bookingLabel1,bookingLabel2,bookingLabel3,checkLabel,checkLabel1,classLabel1,classLabel2,classLabel3,classLabel4,checkLabel2,checkLabel3,checkLabel4,checkLabel5,
            checkLabel6;
    private Scene scene,scene2,bookingscene,checkscene,classscene,checkoutscene;
    private Button scene2btn1,scene2btn2,bookingbtn1,bookingbtn2,checkbtn1,classbtn1,classbtn2,checkoutbtn1,checkoutbtn2;
    private ComboBox<String> departureCB,arrivalCB,peopleCB;
    private String [] departureArray = {"Johor","Kuala Lumpur","Penang","Melaka","Ipoh"};
    private String [] arrivalArray = {"Singapore","Thailand","Indonesia","Taiwan","Korea","Japan","Beijing"};
    private String [] peopleArray = {"1","2","3","4","5"};
    private RadioButton firstRB,businessRB,economyRB;
    @Override
    public void start(Stage primaryStage) {
        //Scene 1
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color:white");
        img1 = new Image("logo.png");
        view1 = new ImageView(img1);
        view1.setFitHeight(300);
        view1.setFitWidth(300);
        view1.setLayoutX(250);
        view1.setLayoutY(150);
        
        pane.getChildren().add(view1);
        
        view1.setOnMouseClicked(e -> primaryStage.setScene(scene2));   
        scene= new Scene(pane, width, height);
        
        
        //Scene 2
        Pane pane2 = new Pane();
        pane2.setStyle("-fx-background-image: url('bg.jpg')");
        img2 = new Image("logo2.png");
        view2 = new ImageView(img2);
        scene2btn1 = new Button("Booking Flight");
        scene2btn2 = new Button("Check Flight Status");
        scene2btn1.setStyle("-fx-background-color:firebrick");
        scene2btn1.setTextFill(Color.WHITE);
        scene2btn2.setStyle("-fx-background-color:firebrick");
        scene2btn2.setTextFill(Color.WHITE);
        view2.setFitHeight(150);
        view2.setFitWidth(350);
        view2.setLayoutX(230);
        view2.setLayoutY(100);
        scene2btn1.setLayoutY(400);
        scene2btn1.setLayoutX(100);
        scene2btn1.setPrefSize(200, 50);
        scene2btn1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        scene2btn2.setLayoutY(400);
        scene2btn2.setLayoutX(500);
        scene2btn2.setPrefSize(200, 50);
        scene2btn2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        pane2.getChildren().addAll(view2,scene2btn1,scene2btn2);
        
        scene2= new Scene(pane2,width,height);
        
        scene2btn1.setOnAction(e-> primaryStage.setScene(bookingscene));
        scene2btn2.setOnAction(e-> primaryStage.setScene(checkscene));
        
        //Booking Scene
        Pane pane3 = new Pane();
        pane3.setStyle("-fx-background-color:white");
        img3 = new Image("fly.png");
        view3 = new ImageView(img3);
        view3.setFitHeight(50);
        view3.setFitWidth(200);
        view3.setLayoutX(280);
        view3.setLayoutY(150);
        bookingbtn1 = new Button("Book");
        bookingbtn2 = new Button("Back");
        bookingbtn1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        bookingbtn1.setStyle("-fx-background-color:firebrick");
        bookingbtn1.setTextFill(Color.WHITE);
        bookingbtn1.setPrefSize(100,50);
        bookingbtn1.setLayoutX(700);
        bookingbtn1.setLayoutY(500);
        bookingbtn2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        bookingbtn2.setStyle("-fx-background-color:firebrick");
        bookingbtn2.setTextFill(Color.WHITE);
        bookingbtn2.setPrefSize(100,50);
        bookingLabel1 = new Label("Departing from: ");
        bookingLabel2 = new Label("Arriving in: ");
        bookingLabel3 = new Label("Number of Passenger:");
        bookingLabel1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        bookingLabel2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        bookingLabel3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        bookingLabel1.setLayoutX(50);
        bookingLabel1.setLayoutY(100);
        bookingLabel2.setLayoutX(530);
        bookingLabel2.setLayoutY(100);
        bookingLabel3.setLayoutX(50);
        bookingLabel3.setLayoutY(300);
        ObservableList<String> stateList1 = FXCollections.observableArrayList(departureArray);
        departureCB = new ComboBox(stateList1);
        departureCB.setPrefSize(200, 50);
        departureCB.setLayoutX(50);
        departureCB.setLayoutY(150);
        ObservableList<String> stateList2 = FXCollections.observableArrayList(arrivalArray);
        arrivalCB = new ComboBox(stateList2);
        arrivalCB.setPrefSize(200, 50);
        arrivalCB.setLayoutX(530);
        arrivalCB.setLayoutY(150);
        ObservableList<String> stateList3 = FXCollections.observableArrayList(peopleArray);
        peopleCB = new ComboBox(stateList3);
        peopleCB.setPrefSize(200, 50);
        peopleCB.setLayoutX(50);
        peopleCB.setLayoutY(350);
        pane3.getChildren().addAll(bookingLabel1,bookingLabel2,bookingLabel3,view3,departureCB,arrivalCB,peopleCB,bookingbtn1,bookingbtn2);
        bookingscene = new Scene(pane3, width, height);
        
        bookingbtn1.setOnAction(e-> primaryStage.setScene(classscene));
        bookingbtn2.setOnAction(e-> primaryStage.setScene(scene2));
        
        //Check Flight Scene       
        TableView tbv = new TableView();
        tbv.setPrefHeight(390);
        tbv.setPrefWidth(410);
        
        TableColumn<String, Person> column1 = new TableColumn<>("Departure date");
        column1.setCellValueFactory(new PropertyValueFactory<>("DepartureDate"));
        

        TableColumn<String, Person> column2 = new TableColumn<>("Route");
        column2.setCellValueFactory(new PropertyValueFactory<>("Route"));
        
        TableColumn<String, Person> column3 = new TableColumn<>("Status");
        column3.setCellValueFactory(new PropertyValueFactory<>("Status"));
        
        TableColumn<String, Person> column4 = new TableColumn<>("Seat Status");
        column4.setCellValueFactory(new PropertyValueFactory<>("Seat"));

        tbv.getColumns().add(column1);
        tbv.getColumns().add(column2);
        tbv.getColumns().add(column3);
        tbv.getColumns().add(column4);
        
        tbv.getItems().add(new Person("2019-12-25", "Johor -> Thailand","Available","5 more left"));
        tbv.getItems().add(new Person("2019-12-25", "Kuala Lumpur -> Taiwan","Available","3 more left"));
        tbv.getItems().add(new Person("2019-12-26", "Penang -> Beijing","Available","Available"));
        tbv.getItems().add(new Person("2019-12-28", "Kuala Lumpur -> Korea","Available","FULL"));
        tbv.getItems().add(new Person("2019-12-29", "Johor -> Indonesia","Available","2 more left"));
        tbv.getItems().add(new Person("2019-12-31", "Ipoh -> Japan","Available","Available"));
        tbv.getItems().add(new Person("2020-01-01", "Kuala Lumpur -> Singapore","Available","3 more left"));
        tbv.getItems().add(new Person("2020-01-01", "Melaka -> Indonesia","Available","5 more left"));
        tbv.getItems().add(new Person("2020-01-03", "Johor -> Japan","Available","Available"));
        tbv.getItems().add(new Person("2020-01-05", "Kuala Lumpur -> Thailand","Available","1 more left"));
        tbv.getItems().add(new Person("2020-01-05", "Penang -> Taiwan","Available","Available"));
        tbv.getItems().add(new Person("2020-01-06", "Kuala Lumpur -> Korea","Available","FULL"));
        tbv.getItems().add(new Person("2020-01-07", "Johor -> Beijing","Available","Available"));
        tbv.getItems().add(new Person("2020-01-09", "Ipoh -> Taiwan","Available","FULL"));
        tbv.getItems().add(new Person("2020-01-10", "Kuala Lumpur -> Beijing","Available","5 more left"));
        VBox vbox = new VBox(tbv);
        Pane pane4 = new Pane(vbox);
        pane4.setStyle("-fx-background-color:white");
        checkLabel = new Label("Flight Status");
        checkLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 30));
        checkLabel.setLayoutX(0);
        checkLabel.setLayoutY(-50);
        checkbtn1 = new Button("Back");
        checkbtn1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkbtn1.setStyle("-fx-background-color:firebrick");
        checkbtn1.setTextFill(Color.WHITE);
        checkbtn1.setPrefSize(100,50);
        checkbtn1.setLayoutX(-200);
        checkbtn1.setLayoutY(-100);
        pane4.setLayoutX(200);
        pane4.setLayoutY(100);
        pane4.getChildren().addAll(checkLabel,checkbtn1);
        checkscene = new Scene(pane4, width, height);
        
        checkbtn1.setOnAction(e-> primaryStage.setScene(scene2));
        
        //Choose Class Scene
        Pane pane6 = new Pane();
        pane6.setStyle("-fx-background-color:white");
        classbtn1 = new Button("Back");
        classbtn1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classbtn1.setStyle("-fx-background-color:firebrick");
        classbtn1.setTextFill(Color.WHITE);
        classbtn1.setPrefSize(100,50);
        classbtn2 = new Button("Book");
        classbtn2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classbtn2.setStyle("-fx-background-color:firebrick");
        classbtn2.setTextFill(Color.WHITE);
        classbtn2.setPrefSize(100,50);
        classbtn2.setLayoutX(700);
        classbtn2.setLayoutY(500);
        img4 = new Image("class.jpg");
        view4 = new ImageView(img4);
        view4.setFitHeight(150);
        view4.setFitWidth(230);
        view4.setLayoutX(30);
        view4.setLayoutY(100);
        img5 = new Image("class2.png");
        view5 = new ImageView(img5);
        view5.setFitHeight(150);
        view5.setFitWidth(230);
        view5.setLayoutX(280);
        view5.setLayoutY(100);
        img6 = new Image("class3.jpg");
        view6 = new ImageView(img6);
        view6.setFitHeight(150);
        view6.setFitWidth(230);
        view6.setLayoutX(530);
        view6.setLayoutY(100);
        classLabel1 = new Label("First Class");
        classLabel1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classLabel1.setLayoutX(100);
        classLabel1.setLayoutY(270);
        classLabel2 = new Label("Business Class");
        classLabel2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classLabel2.setLayoutX(330);
        classLabel2.setLayoutY(270);
        classLabel3 = new Label("Economy Class");
        classLabel3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classLabel3.setLayoutX(580);
        classLabel3.setLayoutY(270);
        classLabel4 = new Label("Select Your Option:");
        classLabel4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        classLabel4.setLayoutX(30);
        classLabel4.setLayoutY(330);
        firstRB = new RadioButton("First Class");
        firstRB.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        businessRB = new RadioButton("Business Class");
        businessRB.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        economyRB = new RadioButton("Economy Class");
        economyRB.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        ToggleGroup classGroup = new ToggleGroup();
        firstRB.setToggleGroup(classGroup);
        businessRB.setToggleGroup(classGroup);
        economyRB.setToggleGroup(classGroup);
        firstRB.setSelected(true);
        VBox classPane = new VBox();
        classPane.setLayoutX(30);
        classPane.setLayoutY(380);
        classPane.getChildren().addAll(firstRB,businessRB,economyRB);
        pane6.getChildren().addAll(classbtn1,classbtn2,view4,view5,view6,classLabel1,classLabel2,classLabel3,classLabel4,classPane);
        
        classscene = new Scene(pane6, width, height);
        classbtn2.setOnAction(e-> primaryStage.setScene(checkoutscene));
        
        
        
        
        //Checkout Scene
        Pane pane7 = new Pane();
        pane7.setStyle("-fx-background-color:white");
        img7 = new Image("logo.png");
        view7 = new ImageView(img7);
        view7.setFitHeight(200);
        view7.setFitWidth(200);
        view7.setLayoutX(550);
        view7.setLayoutY(130);
        checkLabel1 = new Label("Travel Itinerary/Invoice");
        checkLabel1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel1.setLayoutX(50);
        checkLabel1.setLayoutY(80);
        checkLabel2 = new Label("Booking No. ");
        checkLabel2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel2.setLayoutX(50);
        checkLabel2.setLayoutY(130);
        checkLabel3 = new Label("From:");
        checkLabel3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel3.setLayoutX(50);
        checkLabel3.setLayoutY(180);
        checkLabel4 = new Label("To: ");
        checkLabel4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel4.setLayoutX(50);
        checkLabel4.setLayoutY(230);
        checkLabel5 = new Label("Class: ");
        checkLabel5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel5.setLayoutX(50);
        checkLabel5.setLayoutY(280);
        checkLabel6 = new Label("Departure Date: ");
        checkLabel6.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkLabel6.setLayoutX(50);
        checkLabel6.setLayoutY(330);
        
        
        checkoutbtn1 = new Button("Back");
        checkoutbtn1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkoutbtn1.setStyle("-fx-background-color:firebrick");
        checkoutbtn1.setTextFill(Color.WHITE);
        checkoutbtn1.setPrefSize(100,50);
        checkoutbtn2 = new Button("Exit");
        checkoutbtn2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.REGULAR, 20));
        checkoutbtn2.setStyle("-fx-background-color:firebrick");
        checkoutbtn2.setTextFill(Color.WHITE);
        checkoutbtn2.setPrefSize(100,50);
        checkoutbtn2.setLayoutX(700);
        checkoutbtn2.setLayoutY(500);
        pane7.getChildren().addAll(checkoutbtn1,checkoutbtn2,checkLabel1,checkLabel2,checkLabel3,checkLabel4,checkLabel5,checkLabel6,view7);
        checkoutscene = new Scene(pane7, width, height);
        
        checkoutbtn1.setOnAction(e-> primaryStage.setScene(classscene));
        checkoutbtn2.setOnAction(e-> {
            JOptionPane.showMessageDialog(null, "Thanks and Have a Nice Day!");
            System.exit(0);
        });
        
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
