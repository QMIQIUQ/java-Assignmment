/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaa
 */
public class GroupProject extends Application {
    Scene scene;
    BorderPane root = new BorderPane(); 
    StackPane book = new StackPane(),viewOrder = new StackPane(),exit = new StackPane();
    StackPane backBC= new StackPane(),backBC1= new StackPane(),backBC2= new StackPane(),backBC3= new StackPane(),backBC4= new StackPane();
    StackPane ContinueBT= new StackPane(),CalculateBT= new StackPane(),CheckoutBT = new StackPane(),pay = new StackPane();
    StackPane Perodua = new StackPane(),Proton = new StackPane(),Honda = new StackPane(),Toyota = new StackPane(),Hyundai = new StackPane(),Nissan = new StackPane(),BMW = new StackPane(),Audi = new StackPane(),Mercedes = new StackPane(),Ford = new StackPane(),Mitsubishi = new StackPane(),Weststar = new StackPane();
    //img btn
    StackPane PeroduaViva = new StackPane(),PeroduaAxia = new StackPane(),PeroduaMyvi = new StackPane(),PeroduaAlzaS = new StackPane(),PeroduaAlzaSEAdvance = new StackPane(),PeroduaAlzaMPV = new StackPane();
    StackPane ProtonSagaFLX = new StackPane(),ProtonIriz = new StackPane(),ProtonInspira = new StackPane(),ProtonExoraBold = new StackPane();
    StackPane HondaJazzHybrid = new StackPane(),HondaCityVSpe = new StackPane(),HondaAccord = new StackPane();
    StackPane ToyotaVios = new StackPane(),ToyotaCamry = new StackPane(),ToyotaAlphard = new StackPane(),ToyotaHiace10seater = new StackPane(),ToyotaVellfire= new StackPane(),ToyotaEstima= new StackPane();
    StackPane HyundaiStarex12 = new StackPane(),HyundaiStarex11 = new StackPane();
    StackPane NissanGrandLivina = new StackPane(),NissanUrvan = new StackPane();
    StackPane BMW5seriesMSport = new StackPane();
    StackPane AUDIA3SLine = new StackPane(),AUDITTS = new StackPane();
    StackPane MercedesS400Hybrid = new StackPane();
    StackPane FordTransit = new StackPane();
    StackPane MitsubishiAttrage = new StackPane();
    StackPane WeststarMaxusG10 = new StackPane();
    
    
    String[] Brand = {"Perodua","Proton","Honda","Toyota","Hyundai","Nissan","BMW","Audi","Mercedes","Ford","Mitsubishi","Westar"};
    String[] Name = {"Perodua viva","Perodua Axia","Perodua Myvi","Perodua Alza S","Perodua Alza \nSE/Advance","Perodua Alza\n(MPV 7 Seater)",//Perodua
                     "Proton Saga FLX","Proton Iriz 1.6","Proton Inspira 2.0","Proton Exora Bold",//proton 4 (6-9)
                     "Honda Jazz Hybrid","Honda City V Spe","Honda Accord",//honda (10-12)
                     "Toyota Vios","Toyota Camry","Toyota Alphard 2.4\n7/8saeter","Toyota Hiace\n10seater"," Toyota Vellfire \nLuxury MPV","Toyota Estima \nLuxury MPV",//toyota (13-18)                
                     "Hyundai Starex\n(12 seater)","Hyundai Starex\n(Luxury 11 Seater)",//hyundai (19-20)
                     "Nissan Grand Livina","Nissan Urvan \n(VAN 12 Seater)",//nissan (21-22);
                     "BMW 5series\nM-Sport",//BMW (23)
                     "AUDI A3\nS-Line","AUDI TTS",//Audi (24-25)
                     "Mercedes S400\n Hybrid",//Mercedes (26)
                     "Ford Transit \n(VAN  14 Seater)",//Ford (27)
                     "Mitsubishi\n Attrage",//Mitsubishi(28)
                     "Weststar Maxus\n G10 10seater"};//Westar (29)
    
    String[] Image = {"file:resources/car/PeroduaViva1.jpg","file:resources/car/Perodua Axia(A).jpg","file:resources/car/Perodua Myvi(A).jpg","file:resources/car/Perodua Alza S(A).jpg","file:resources/car/Perodua Alza SE(A)(Advance).jpg","file:resources/car/Perodua Alza (A)(MPV 7 Seater).jpg",//perodua
                      "file:resources/car/Proton Saga FLX.jpg","file:resources/car/Proton Iriz 1.6 (A).jpg","file:resources/car/Proton Inspira 2.0 (A).jpg","file:resources/car/Proton Exora Bold (A).jpg", 
                      "file:resources/car/Honda Jazz Hybrid (A).jpg","file:resources/car/Honda City V Spec (A).jpg","file:resources/car/Honda Accord (A).jpg", //honda (10-12)
                      "file:resources/car/Toyota Vios (A).jpg","file:resources/car/Toyota Camry (A).jpg","file:resources/car/Toyota Alphard 2.4 7 or 8seater.jpg","file:resources/car/Toyota Hiace (VAN 10 Seater) (A).jpg","file:resources/car/Toyota Vellfire - Luxury MPV (A).jpg","file:resources/car/Toyota Estima - Luxury MPV(A).jpg", //toyota (13-18)
                      "file:resources/car/Hyundai Starex (12 seater) (A).jpg","file:resources/car/Hyundai Starex(Luxury 11 Seater)(A).jpg",//hyundai (19-20)
                      "file:resources/car/Nissan Grand Livina (A).jpg","file:resources/car/Nissan Urvan (VAN 12 Seater)(A).jpg",//nissan (21-22);
                      "file:resources/car/BMW 5series M-Sport (A).jpg",//BMW (23)
                      "file:resources/car/AUDI A3 S-Line(M).jpg","file:resources/car/AUDI TTS (A).jpg",//Audi (24-25)
                      "file:resources/car/Mercedes S400 Hybrid (A).jpg",//Mercedes (26)
                      "file:resources/car/Ford Transit (VAN  14 Seater) (A).jpg",//Ford (27)
                      "file:resources/car/Mitsubishi Attrage (A).jpg",//Mitsubishi(28)
                      "file:resources/car/Weststar Maxus G10 10seater (A).jpg",//Westar (29)
    };
    int[] Price = {120,130,150,180,200,500,//perdua 6(0-5)
                   160,150,300,250,//proton 4 (6-9)
                   250,250,450,//honda (10-12)
                   250,450,600,700,1200,1000,//toyota (13-18)
                   450,1000,//hyundai (19-20)
                   245,700,//nissan (21-22);
                   900,//BMW (23)
                   700,1500,//Audi (24-25)
                   2300,//Mercedes (26)
                   850,//Ford (27)
                   170,//Mitsubishi(28)
                   450};//Westar (29)
    //for car                                               //for backB2
    int user=0, userCar[] = new int[99999],userCarIndex = 0,userBrand = 0,carCount=0;
    
    boolean driver = false;
    boolean perdua = false,proton = false,honda = false,toyota = false,hyundai = false,nissan = false,bmw = false,audi = false,mercedes = false,ford = false,mitsubishi = false,weststar = false;
    
    //view details
    RadioButton Auto = new RadioButton("Auto"),Manual = new RadioButton("Manual");
    TextField daysTF = new TextField();
    Text warningDay = new Text(),TotalResult = new Text();
    
    //View Order
    ListView order = new ListView();
    String Transmition = new String();
    int totalPrice,userday,finalPrice;
    Text FinalPriceT = new Text(),FianlPriceTEXT = new Text();
    
    //checkOut
    RadioButton DriverYes = new RadioButton("Yes(+RM500)"),DriverNo = new RadioButton("No");
    TextField userPay = new TextField();
    
    
    
    
    private void Menu(){
        WelcomeMenu();
        Main();
        root.setStyle("-fx-background-color:white");
    }
       
    private void WelcomeMenu(){
        VBox welcomeVB = new VBox();
        welcomeVB.setStyle("-fx-background-color:lightgray");
        Line line = new Line(0, 0, 1920, 0);
        line.setStroke(Color.GREY);
        StackPane WelcomeSP = new StackPane();
        StackPane welcomeSP = new StackPane();
        Text a = new Text("  -=MMX Car Renting=-  ");
        a.setFont(Font.font("Algerian",70));
        a.setUnderline(true);
        
        Text b = new Text("Best place to find the car that Suitable for you");
        
        b.setFont(Font.font(50));
        WelcomeSP.getChildren().add(a);
        welcomeSP.getChildren().add(b);
        welcomeVB.getChildren().addAll(WelcomeSP,welcomeSP,line);
        
        root.setTop(welcomeVB);
    }
    
    private void Main(){
        
        VBox pane = new VBox();
        
        StackPane SP1 = new StackPane();
        
        Text text = new Text("What would you like to do?");
        text.setFont(Font.font(60));
        SP1.setPadding(new Insets(100));
        SP1.getChildren().add(text);
        
        
        HBox btn = new HBox();
        btn.setSpacing(100);
        
        
        book.setPadding(new Insets(150,71,50,400));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("Book a Car");
        t1.setFont(Font.font(25));
        book.getChildren().addAll(r1,t1);
        

        viewOrder.setPadding(new Insets(150,71,50,71));
        Rectangle r2 = new Rectangle(250,50);
        r2.setFill(null);
        r2.setStroke(Color.GRAY);
        r2.setStrokeWidth(3);
        Text t2 = new Text("View Order");
        t2.setFont(Font.font(25));
        viewOrder.getChildren().addAll(r2,t2);
        

        

        exit.setPadding(new Insets(150,71,50,71));
        Rectangle r4 = new Rectangle(250,50);
        r4.setFill(null);
        r4.setStroke(Color.GRAY);
        r4.setStrokeWidth(3);
        Text t4 = new Text("Exit");
        exit.getChildren().addAll(r4,t4);
        t4.setFont(Font.font(25));
        btn.getChildren().addAll(book,viewOrder,exit);
        
        
        
        pane.getChildren().addAll(SP1,btn);
        root.setCenter(pane);
        
    }
    
    private void BookCar(){
       
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Brand That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        Image Produa = new Image("file:resources/logo/Produa.jpg");
        ImageView produa = new ImageView(Produa);
        produa.setFitHeight(200);
        produa.setFitWidth(200);
        this.Perodua.getChildren().add(produa);
        this.Perodua.setPadding(new Insets(0,0,0,100));
        
        Image Proton = new Image("file:resources/logo/Proton.jpg");
        ImageView proton = new ImageView(Proton);
        proton.setFitHeight(200);
        proton.setFitWidth(200);
        this.Proton.getChildren().add(proton);
        
        Image Honda = new Image("file:resources/logo/Honda.jpg");
        ImageView honda = new ImageView(Honda);
        honda.setFitHeight(200);
        honda.setFitWidth(200);
        this.Honda.getChildren().add(honda);
        
        Image Toyota = new Image("file:resources/logo/Toyota.jpg");
        ImageView toyota = new ImageView(Toyota);
        toyota.setFitHeight(200);
        toyota.setFitWidth(200);
        this.Toyota.getChildren().add(toyota);
        
        Image Hyundai = new Image("file:resources/logo/Hyundai.jpg");
        ImageView hyundai = new ImageView(Hyundai);
        hyundai.setFitHeight(200);
        hyundai.setFitWidth(200);
        this.Hyundai.getChildren().add(hyundai);
        
        Image Nissan = new Image("file:resources/logo/Nissan.jpg");
        ImageView nissan = new ImageView(Nissan);
        nissan.setFitHeight(200);
        nissan.setFitWidth(200);
        this.Nissan.getChildren().add(nissan);

        
        
        logo1.getChildren().addAll(this.Perodua,this.Proton,this.Honda,this.Toyota,this.Hyundai,this.Nissan);
        //end level1
        
        //level2
        HBox logo2 = new HBox();
        logo2.setSpacing(100);
        
        Image BMW = new Image("file:resources/logo/BMW.jpg");
        ImageView bMW = new ImageView(BMW);
        bMW.setFitHeight(200);
        bMW.setFitWidth(200);
        this.BMW.getChildren().add(bMW);
        this.BMW.setPadding(new Insets(0,0,0,100));
        
        Image Audi = new Image("file:resources/logo/Audi.jpg");
        ImageView audi = new ImageView(Audi);
        audi.setFitHeight(200);
        audi.setFitWidth(200);
        this.Audi.getChildren().add(audi);
        
        Image Mercedes = new Image("file:resources/logo/Mercedes.jpg");
        ImageView mercedes = new ImageView(Mercedes);
        mercedes.setFitHeight(200);
        mercedes.setFitWidth(200);
        this.Mercedes.getChildren().add(mercedes);
        
        Image Ford = new Image("file:resources/logo/Ford.jpg");
        ImageView ford = new ImageView(Ford);
        ford.setFitHeight(200);
        ford.setFitWidth(200);
        this.Ford.getChildren().add(ford);
        
        Image Mitsubishi = new Image("file:resources/logo/Mitsubishi.jpg");
        ImageView mitsubishi = new ImageView(Mitsubishi);
        mitsubishi.setFitHeight(200);
        mitsubishi.setFitWidth(200);
        this.Mitsubishi.getChildren().add(mitsubishi);
        
        Image Westar = new Image("file:resources/logo/Westar.jpg");
        ImageView westar = new ImageView(Westar);
        westar.setFitHeight(200);
        westar.setFitWidth(200);
        this.Weststar.getChildren().add(westar);
        
        
        
        
        logo2.getChildren().addAll(this.BMW,this.Audi,this.Mercedes,this.Ford,this.Mitsubishi,this.Weststar);
        brand.add(logo1, 0, 0);
        brand.add(logo2, 0, 1);
        
        //end logo
        
        
        
        Pane backP = new Pane();
        backBC.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC);
        backBC.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
        
    }
    
    private void Produa(){
        this.perdua = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane PeroduaVivaSP = new StackPane();
        VBox PeroduaVivaVB = new VBox();
        Image PeroduaViva = new Image(Image[0]);
        ImageView peroduaViva = new ImageView(PeroduaViva);
        peroduaViva.setFitHeight(200);
        peroduaViva.setFitWidth(200);
        this.PeroduaViva.getChildren().add(peroduaViva);
        this.PeroduaViva.setPadding(new Insets(0,0,0,100));
        Text PeroduaVivaT = new Text(Name[0]+"\nRM\t"+Price[0]);
        PeroduaVivaT.setFont(Font.font(25));
        PeroduaVivaSP.getChildren().add(PeroduaVivaT);
        PeroduaVivaSP.setPadding(new Insets(0,0,0,70));
        PeroduaVivaVB.getChildren().addAll(this.PeroduaViva,PeroduaVivaSP);
        
        StackPane PeroduaAxiaSP = new StackPane();
        VBox PeroduaAxiaVB = new VBox();
        Image PeroduaAxia = new Image(Image[1]);
        ImageView peroduaAxia = new ImageView(PeroduaAxia);
        peroduaAxia.setFitHeight(200);
        peroduaAxia.setFitWidth(200);
        this.PeroduaAxia.getChildren().add(peroduaAxia);
        Text PeroduaAxiaT = new Text(Name[1]+"\nRM\t"+Price[1]);
        PeroduaAxiaT.setFont(Font.font(25));
        PeroduaAxiaSP.getChildren().add(PeroduaAxiaT);
        PeroduaAxiaVB.getChildren().addAll(this.PeroduaAxia,PeroduaAxiaSP);
        
        StackPane PeroduaMyviSP = new StackPane();
        VBox PeroduaMyviVB = new VBox();
        Image PeroduaMyvi = new Image(Image[2]);
        ImageView peroduaMyvi = new ImageView(PeroduaMyvi);
        peroduaMyvi.setFitHeight(200);
        peroduaMyvi.setFitWidth(200);
        this.PeroduaMyvi.getChildren().add(peroduaMyvi);
        Text PeroduaMyviT = new Text(Name[2]+"\nRM\t"+Price[2]);
        PeroduaMyviT.setFont(Font.font(25));
        PeroduaMyviSP.getChildren().add(PeroduaMyviT);
        PeroduaMyviVB.getChildren().addAll(this.PeroduaMyvi,PeroduaMyviSP);
     
        StackPane PeroduaAlzaSSP = new StackPane();
        VBox PeroduaAlzaSVB = new VBox();
        Image PeroduaAlzaS = new Image(Image[3]);
        ImageView peroduaAlzaS = new ImageView(PeroduaAlzaS);
        peroduaAlzaS.setFitHeight(200);
        peroduaAlzaS.setFitWidth(200);
        this.PeroduaAlzaS.getChildren().add(peroduaAlzaS);
        Text PeroduaAlzaST = new Text(Name[3]+"\nRM\t"+Price[3]);
        PeroduaAlzaST.setFont(Font.font(25));
        PeroduaAlzaSSP.getChildren().add(PeroduaAlzaST);
        PeroduaAlzaSVB.getChildren().addAll(this.PeroduaAlzaS,PeroduaAlzaSSP);
     
        StackPane PeroduaAlzaSEAdvanceSP = new StackPane();
        VBox PeroduaAlzaSEAdvanceVB = new VBox();
        Image PeroduaAlzaSEAdvance = new Image(Image[4]);
        ImageView peroduaAlzaSEAdvance = new ImageView(PeroduaAlzaSEAdvance);
        peroduaAlzaSEAdvance.setFitHeight(200);
        peroduaAlzaSEAdvance.setFitWidth(200);
        this.PeroduaAlzaSEAdvance.getChildren().add(peroduaAlzaSEAdvance);
        Text PeroduaAlzaSEAdvanceT = new Text(Name[4]+"\nRM\t"+Price[4]);
        PeroduaAlzaSEAdvanceT.setFont(Font.font(25));
        PeroduaAlzaSEAdvanceSP.getChildren().add(PeroduaAlzaSEAdvanceT);
        PeroduaAlzaSEAdvanceVB.getChildren().addAll(this.PeroduaAlzaSEAdvance,PeroduaAlzaSEAdvanceSP);
        
        StackPane PeroduaAlzaMPVSP = new StackPane();
        VBox PeroduaAlzaMPVVB = new VBox();
        Image PeroduaAlzaMPV = new Image(Image[5]);
        ImageView peroduaAlzaMPV = new ImageView(PeroduaAlzaMPV);
        peroduaAlzaMPV.setFitHeight(200);
        peroduaAlzaMPV.setFitWidth(200);
        this.PeroduaAlzaMPV.getChildren().add(peroduaAlzaMPV);
        Text PeroduaAlzaMPVT = new Text(Name[5]+"\nRM\t"+Price[5]);
        PeroduaAlzaMPVT.setFont(Font.font(25));
        PeroduaAlzaMPVSP.getChildren().add(PeroduaAlzaMPVT);
        PeroduaAlzaMPVVB.getChildren().addAll(this.PeroduaAlzaMPV,PeroduaAlzaMPVSP);
     
        
        
     
        logo1.getChildren().addAll(PeroduaVivaVB,PeroduaAxiaVB,PeroduaMyviVB,PeroduaAlzaSVB,PeroduaAlzaSEAdvanceVB,PeroduaAlzaMPVVB);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Proton(){
        this.proton = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[6]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.ProtonSagaFLX.getChildren().add(IV1);
        this.ProtonSagaFLX.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[6]+"\nRM\t"+Price[6]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.ProtonSagaFLX,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[7]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.ProtonIriz.getChildren().add(IV2);
        Text text2 = new Text(Name[7]+"\nRM\t"+Price[7]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.ProtonIriz,SP2);
        
        StackPane SP3 = new StackPane();
        VBox VB3 = new VBox();
        Image I3 = new Image(Image[8]);
        ImageView IV3 = new ImageView(I3);
        IV3.setFitHeight(200);
        IV3.setFitWidth(200);
        this.ProtonInspira.getChildren().add(IV3);
        Text text3 = new Text(Name[8]+"\nRM\t"+Price[8]);
        text3.setFont(Font.font(25));
        SP3.getChildren().add(text3);
        VB3.getChildren().addAll(this.ProtonInspira,SP3);
     
        StackPane SP4 = new StackPane();
        VBox VB4 = new VBox();
        Image I4 = new Image(Image[9]);
        ImageView IV4 = new ImageView(I4);
        IV4.setFitHeight(200);
        IV4.setFitWidth(200);
        this.ProtonExoraBold.getChildren().add(IV4);
        Text text4 = new Text(Name[9]+"\nRM\t"+Price[9]);
        text4.setFont(Font.font(25));
        SP4.getChildren().add(text4);
        VB4.getChildren().addAll(this.ProtonExoraBold,SP4);
     

        logo1.getChildren().addAll(VB1,VB2,VB3,VB4);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Honda(){
        this.honda = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[10]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.HondaJazzHybrid.getChildren().add(IV1);
        this.HondaJazzHybrid.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[10]+"\nRM\t"+Price[10]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.HondaJazzHybrid,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[11]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.HondaCityVSpe.getChildren().add(IV2);
        Text text2 = new Text(Name[11]+"\nRM\t"+Price[11]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.HondaCityVSpe,SP2);
        
        StackPane SP3 = new StackPane();
        VBox VB3 = new VBox();
        Image I3 = new Image(Image[12]);
        ImageView IV3 = new ImageView(I3);
        IV3.setFitHeight(200);
        IV3.setFitWidth(200);
        this.HondaAccord.getChildren().add(IV3);
        Text text3 = new Text(Name[12]+"\nRM\t"+Price[12]);
        text3.setFont(Font.font(25));
        SP3.getChildren().add(text3);
        VB3.getChildren().addAll(this.HondaAccord,SP3);
     

        logo1.getChildren().addAll(VB1,VB2,VB3);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Toyota(){
        this.toyota = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[13]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.ToyotaVios.getChildren().add(IV1);
        this.ToyotaVios.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[13]+"\nRM\t"+Price[13]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.ToyotaVios,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[14]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.ToyotaCamry.getChildren().add(IV2);
        Text text2 = new Text(Name[14]+"\nRM\t"+Price[14]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.ToyotaCamry,SP2);
        
        StackPane SP3 = new StackPane();
        VBox VB3 = new VBox();
        Image I3 = new Image(Image[15]);
        ImageView IV3 = new ImageView(I3);
        IV3.setFitHeight(200);
        IV3.setFitWidth(200);
        this.ToyotaAlphard.getChildren().add(IV3);
        Text text3 = new Text(Name[15]+"\nRM\t"+Price[15]);
        text3.setFont(Font.font(25));
        SP3.getChildren().add(text3);
        VB3.getChildren().addAll(this.ToyotaAlphard,SP3);
     
        StackPane SP4 = new StackPane();
        VBox VB4 = new VBox();
        Image I4 = new Image(Image[16]);
        ImageView IV4 = new ImageView(I4);
        IV4.setFitHeight(200);
        IV4.setFitWidth(200);
        this.ToyotaHiace10seater.getChildren().add(IV4);
        Text text4 = new Text(Name[16]+"\nRM\t"+Price[16]);
        text4.setFont(Font.font(25));
        SP4.getChildren().add(text4);
        VB4.getChildren().addAll(this.ToyotaHiace10seater,SP4);
        
        StackPane SP5 = new StackPane();
        VBox VB5 = new VBox();
        Image I5 = new Image(Image[17]);
        ImageView IV5 = new ImageView(I5);
        IV5.setFitHeight(200);
        IV5.setFitWidth(200);
        this.ToyotaVellfire.getChildren().add(IV5);
        Text text5 = new Text(Name[17]+"\nRM\t"+Price[17]);
        text5.setFont(Font.font(25));
        SP5.getChildren().add(text5);
        VB5.getChildren().addAll(this.ToyotaVellfire,SP5);
        
        StackPane SP6 = new StackPane();
        VBox VB6 = new VBox();
        Image I6 = new Image(Image[18]);
        ImageView IV6 = new ImageView(I6);
        IV6.setFitHeight(200);
        IV6.setFitWidth(200);
        this.ToyotaEstima.getChildren().add(IV6);
        Text text6 = new Text(Name[18]+"\nRM\t"+Price[18]);
        text6.setFont(Font.font(25));
        SP6.getChildren().add(text6);
        VB6.getChildren().addAll(this.ToyotaEstima,SP6);
     

        logo1.getChildren().addAll(VB1,VB2,VB3,VB4,VB5,VB6);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Hyundai(){
        this.hyundai = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[19]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.HyundaiStarex12.getChildren().add(IV1);
        this.HyundaiStarex12.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[19]+"\nRM\t"+Price[19]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.HyundaiStarex12,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[20]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.HyundaiStarex11.getChildren().add(IV2);
        Text text2 = new Text(Name[20]+"\nRM\t"+Price[20]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.HyundaiStarex11,SP2);
        
     

        logo1.getChildren().addAll(VB1,VB2);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Nissan(){
        this.nissan = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[21]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.NissanGrandLivina.getChildren().add(IV1);
        this.NissanGrandLivina.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[21]+"\nRM\t"+Price[21]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.NissanGrandLivina,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[22]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.NissanUrvan.getChildren().add(IV2);
        Text text2 = new Text(Name[22]+"\nRM\t"+Price[22]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.NissanUrvan,SP2);
        
     

        logo1.getChildren().addAll(VB1,VB2);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void BMW(){
        this.bmw = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[23]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.BMW5seriesMSport.getChildren().add(IV1);
        this.BMW5seriesMSport.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[23]+"\nRM\t"+Price[23]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.BMW5seriesMSport,SP1);
        
        logo1.getChildren().addAll(VB1);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void AUDI(){
        this.audi = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[24]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.AUDIA3SLine.getChildren().add(IV1);
        this.AUDIA3SLine.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[24]+"\nRM\t"+Price[24]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.AUDIA3SLine,SP1);
        
        StackPane SP2 = new StackPane();
        VBox VB2 = new VBox();
        Image I2 = new Image(Image[25]);
        ImageView IV2 = new ImageView(I2);
        IV2.setFitHeight(200);
        IV2.setFitWidth(200);
        this.AUDITTS.getChildren().add(IV2);
        Text text2 = new Text(Name[25]+"\nRM\t"+Price[25]);
        text2.setFont(Font.font(25));
        SP2.getChildren().add(text2);
        VB2.getChildren().addAll(this.AUDITTS,SP2);
        
     

        logo1.getChildren().addAll(VB1,VB2);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Mercedes(){
        this.mercedes = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[26]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.MercedesS400Hybrid.getChildren().add(IV1);
        this.MercedesS400Hybrid.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[26]+"\nRM\t"+Price[26]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.MercedesS400Hybrid,SP1);

        logo1.getChildren().addAll(VB1);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Ford(){
        this.ford = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[27]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.FordTransit.getChildren().add(IV1);
        this.FordTransit.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[27]+"\nRM\t"+Price[27]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.FordTransit,SP1);
      
        logo1.getChildren().addAll(VB1);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Mitsubishi(){
        this.mitsubishi = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[28]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.MitsubishiAttrage.getChildren().add(IV1);
        this.MitsubishiAttrage.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[28]+"\nRM\t"+Price[28]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.MitsubishiAttrage,SP1);

        logo1.getChildren().addAll(VB1);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void Weststar(){
        this.weststar = true;
        VBox pane = new VBox();
        
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Pick a Car That you like the most");
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(40));
        
        
        
        //brand logo
        GridPane brand = new GridPane();
        //lavel 1
        HBox logo1 = new HBox();
        logo1.setSpacing(100);
        
        StackPane SP1 = new StackPane();
        VBox VB1 = new VBox();
        Image I1 = new Image(Image[29]);
        ImageView IV1 = new ImageView(I1);
        IV1.setFitHeight(200);
        IV1.setFitWidth(200);
        this.WeststarMaxusG10.getChildren().add(IV1);
        this.WeststarMaxusG10.setPadding(new Insets(0,0,0,100));
        Text text1 = new Text(Name[29]+"\nRM\t"+Price[29]);
        text1.setFont(Font.font(25));
        SP1.getChildren().add(text1);
        SP1.setPadding(new Insets(0,0,0,70));
        VB1.getChildren().addAll(this.WeststarMaxusG10,SP1);
        
        logo1.getChildren().addAll(VB1);
        //end level1
        brand.add(logo1, 0, 1);
        
        Pane backP = new Pane();
        backBC1.setPadding(new Insets(60,80,50,170));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC1.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC1);
        backBC1.relocate(700, 0);
        
        pane.getChildren().addAll(labelSP,brand,backP);
        
        root.setCenter(pane);
    }
    
    private void ViewInfo(){
        VBox pane = new VBox();
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Car info");
        labelT.setUnderline(true);
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(30));
        
        
        
        GridPane center = new GridPane();
        
        StackPane imageSP = new StackPane();
        Image image = new Image(Image[user]);
        ImageView imageV = new ImageView(image);
        imageV.setFitHeight(590);
        imageV.setFitWidth(590);
        imageSP.getChildren().add(imageV);
        imageSP.setPadding(new Insets(0,200,0,200));
        
        
        
        //text
        StackPane centerSP = new StackPane();
        centerSP.setStyle("-fx-background-color:whitesmoke");
        VBox imageVB = new VBox();
        imageVB.setPadding(new Insets(20));
        imageVB.setPrefWidth(750);
        imageVB.setSpacing(34);
        Text carName = new Text(this.Name[user]);
        carName.setFont(Font.font(30));
        carName.setUnderline(true);
        
        
        
        Text carPrice = new Text(String.valueOf("RM: "+this.Price[user]+"/Days"));
        carPrice.setFont(Font.font(25));
        
        Text carT = new Text("Choose your prefere type");
        carT.setFont(Font.font(30));
        carT.setUnderline(true);
        
        HBox HB1 = new HBox();
        HB1.setSpacing(50);
        HB1.getChildren().addAll(Auto,Manual);
        ToggleGroup a = new ToggleGroup();
        Auto.setToggleGroup(a);
        Auto.setFont(Font.font(20));
        Auto.setPadding(new Insets(0,0,0,30));
        Manual.setToggleGroup(a);
        Manual.setFont(Font.font(20));
        a.selectToggle(Auto);
        
        Text days = new Text("How many days you want to rent??");
        days.setUnderline(true);
        days.setFont(Font.font(30));
        Text dayss = new Text("Please Enter NUMBER : ");
        dayss.setFont(Font.font(20));
        warningDay.setFont(Font.font(20));
        warningDay.setFill(Color.RED);
        Text daysss = new Text("Days");
        daysss.setFont(Font.font(20));
        
        HBox HB2 = new HBox();
        HB2.getChildren().addAll(dayss,daysTF,daysss,warningDay);
        
        
        
        Text Total = new Text("Toltal Price : ");
        Total.setFont(Font.font(30));
        
        TotalResult.setFont(Font.font(30));
        
        
        Rectangle r = new Rectangle(180,30);
        r.setFill(null);
        r.setStroke(Color.GRAY);
        r.setStrokeWidth(3);
        Text t = new Text("Calculate");
        t.setFont(Font.font(15));
        CalculateBT.getChildren().addAll(r,t);
        GridPane GP = new GridPane();
        GP.add(Total,0,0);
        GP.add(TotalResult, 1, 0);
        GP.add(CalculateBT, 2, 0);
        
        
        
        
        imageVB.getChildren().addAll(carName,carPrice,carT,HB1,days,HB2,GP);
        centerSP.getChildren().add(imageVB);
        center.add(imageSP,0,0);
        center.add(centerSP,1,0);
        //end
                
        
        
        
        
        Pane backP = new Pane();
        backBC2.setPadding(new Insets(60,0,50,0));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back");
        t1.setFont(Font.font(25));
        backBC2.getChildren().addAll(r1,t1);
        backBC2.relocate(200, 0);
        
        ContinueBT.setPadding(new Insets(60,0,50,0));
        Rectangle r2 = new Rectangle(250,50);
        r2.setFill(null);
        r2.setStroke(Color.GRAY);
        r2.setStrokeWidth(3);
        Text t2 = new Text("Continue>>");
        t2.setFont(Font.font(25));
        ContinueBT.getChildren().addAll(r2,t2);
        ContinueBT.relocate(1400, 0);
        backP.getChildren().addAll(backBC2,ContinueBT);
        
        
        pane.getChildren().addAll(labelSP,center,backP);
        
        root.setCenter(pane);
        
    }
    
    private void viewOrder(){
        VBox pane = new VBox();
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Order info");
        labelT.setUnderline(true);
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(30));
        
        HBox  bottom = new HBox(700);
        Pane backP = new Pane();
        backBC3.setPadding(new Insets(60,80,50,270));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("<--Back To Menu");
        t1.setFont(Font.font(25));
        backBC3.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC3);

        Pane checkOutP = new Pane();
        CheckoutBT.setPadding(new Insets(60,80,50,0));
        Rectangle r = new Rectangle(250,50);
        r.setFill(null);
        r.setStroke(Color.GRAY);
        r.setStrokeWidth(3);
        Text t = new Text("Check Out>>");
        t.setFont(Font.font(25));
        CheckoutBT.getChildren().addAll(r,t);
        checkOutP.getChildren().add(CheckoutBT);
        
        HBox FinalPriceHB = new HBox();
        FinalPriceT.setFont(Font.font(25));
        FinalPriceHB.getChildren().add(FinalPriceT);
        FinalPriceHB.setAlignment(Pos.BOTTOM_RIGHT);
        
        bottom.getChildren().addAll(backP,checkOutP);
        
        pane.getChildren().addAll(labelSP,order,FinalPriceHB,bottom);
        
        root.setCenter(pane);
    }
    
    private void Checkout(){
        VBox pane = new VBox();
        StackPane labelSP = new StackPane();
        Text labelT = new Text("Check Out!!!!");
        labelT.setUnderline(true);
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font(40));
        labelSP.setPadding(new Insets(30));
        
        VBox center = new VBox(40);
        center.setAlignment(Pos.CENTER);
        FianlPriceTEXT.setText("FinalPrice: "+"RM "+String.valueOf(finalPrice));
        FianlPriceTEXT.setFont(Font.font(30));
        Text text2 = new Text("Do you need a Driver?");
        text2.setFont(Font.font(30));
        ToggleGroup a = new ToggleGroup();
        DriverYes.setToggleGroup(a);
        DriverYes.setFont(Font.font(20));
        DriverYes.setPadding(new Insets(0,0,0,30));
        DriverNo.setToggleGroup(a);
        DriverNo.setFont(Font.font(20));
        a.selectToggle(DriverNo);

        HBox HB1 = new HBox();
        userPay.setPrefHeight(50);
        Text youpay = new Text("You Pay : RM");
        youpay.setFont(Font.font(30));
        HB1.getChildren().addAll(youpay,userPay);
        HB1.setAlignment(Pos.CENTER);
        HBox hB = new HBox(40);
        hB.setAlignment(Pos.CENTER);
        hB.getChildren().addAll(DriverYes,DriverNo);
        
        center.getChildren().addAll(text2,hB,FianlPriceTEXT,HB1);
        
        
        
        HBox  bottom = new HBox(700);
        Pane backP = new Pane();
        backBC4.setPadding(new Insets(60,80,50,270));
        Rectangle r1 = new Rectangle(250,50);
        r1.setFill(null);
        r1.setStroke(Color.GRAY);
        r1.setStrokeWidth(3);
        Text t1 = new Text("Cancel Checkout");
        t1.setFont(Font.font(25));
        backBC4.getChildren().addAll(r1,t1);
        backP.getChildren().add(backBC4);
        
        
        
        Pane checkOutP = new Pane();
        pay.setPadding(new Insets(60,80,50,0));
        Rectangle r = new Rectangle(250,50);
        r.setFill(null);
        r.setStroke(Color.GRAY);
        r.setStrokeWidth(3);
        Text t = new Text("Pay>>");
        t.setFont(Font.font(25));
        pay.getChildren().addAll(r,t);
        checkOutP.getChildren().add(pay);
        
        bottom.getChildren().addAll(backP,checkOutP);
        
        pane.getChildren().addAll(labelSP,center,bottom);
        
        root.setCenter(pane);
    }
    
    private void ThankYou(){
        VBox pane = new VBox(50);
        pane.setAlignment(Pos.CENTER);
        StackPane labelSP = new StackPane();
        Text labelT = new Text("!!!THANK YOU!!!");
        labelT.setUnderline(true);
        labelSP.getChildren().add(labelT);
        labelT.setFont(Font.font("Algerian",150));
        labelSP.setPadding(new Insets(30));
        
        
        Pane back = new Pane();
        back.getChildren().add(backBC);
        pane.getChildren().addAll(labelSP,back);
        
        root.setCenter(pane);
    }
    
    private void exit(){
        Object[] options = {"Yes","No"};
        int dia = JOptionPane.showOptionDialog(null,"Do you really want to left us alone?","QAQ...wat???",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        if(dia == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        Menu();
        
        pay.setOnMouseClicked(e->{
            try{
                
                    if(DriverYes.isSelected()){
                       int a = Integer.parseInt(userPay.getText());
                        if(a>=(finalPrice+500)){
                            a-=(finalPrice+500);

                            JOptionPane.showMessageDialog(null, "Payment complete!! Change RM "+a);
                            ThankYou();
                            order.getItems().removeAll();
                            user=0;
                            userCarIndex = 0;
                            userBrand = 0;
                            carCount=0;
                        }else{
                            JOptionPane.showMessageDialog(null,"!Please Insert right Value!(Same or more than Fianl Price)");
                        }
                    } 
                    if(DriverNo.isSelected()){
                       int a = Integer.parseInt(userPay.getText());
                        if(a>=(finalPrice)){
                            a-=(finalPrice);

                            JOptionPane.showMessageDialog(null, "Payment complete!! Change RM "+a);
                            ThankYou();
                            order.getItems().clear();
                            user=0;
                            userCarIndex = 0;
                            userBrand = 0;
                            carCount=0;
                            finalPrice=0;
                        }else{
                            JOptionPane.showMessageDialog(null,"!Please Insert right Value!(Same or more than Fianl Price)");
                        }
                    }
            }catch(NumberFormatException f){
                JOptionPane.showMessageDialog(null,"!Please Insert Number only!");
            }
           
            
        });
        
        
        DriverYes.setOnAction(e->{
            if(DriverYes.isSelected()){
                FianlPriceTEXT.setText("FinalPrice: "+"RM "+(finalPrice+500));
            }
            
        });
        DriverNo.setOnAction(e->{
            if(DriverNo.isSelected()){
                FianlPriceTEXT.setText("FinalPrice: "+"RM "+finalPrice);
            }
            
        });
        
        scene = new Scene(root);
        
        primaryStage.setTitle("-=MMX Car Renting=-");
        primaryStage.setScene(scene);
        primaryStage.setHeight(1000);
        primaryStage.show();
        
        
        
        book.setOnMouseClicked(e->{
        BookCar();
        });
        
        viewOrder.setOnMouseClicked(e->{
            if(userCarIndex==0){
                JOptionPane.showMessageDialog(null, "place an order befoer view Order~");
            }else{
               viewOrder(); 
            }
        
        });
        
        CheckoutBT.setOnMouseClicked(e->{
            int a = JOptionPane.showConfirmDialog(null,"Proced to Checkout?");
            if(a==JOptionPane.YES_OPTION){
                Checkout();
            }
        });
        
        exit.setOnMouseClicked(e->{
            exit();
        });
        
         
        backBC.setOnMouseClicked(e->{
            Main();
            userBrand = 0;
        });
        
        backBC1.setOnMouseClicked(e->{
            userBrand = 0;
            BookCar();
        });
        
        backBC2.setOnMouseClicked(e->{
            TotalResult.setText(null);
            warningDay.setText(null);   
            daysTF.setText(null);
            switch(userBrand){
                case 1 : Produa();break;
                case 2 : Proton();break;
                case 3 : Honda();break;
                case 4 : Toyota();break;
                case 5 : Hyundai();break;
                case 6 : Nissan();break;
                case 7 : BMW();break;
                case 8 : AUDI();break;
                case 9 : Mercedes();break;
                case 10 : Ford();break;
                case 11 : Mitsubishi();break;
                case 12 : Weststar();break;
            }
            
        });
        
        backBC3.setOnMouseClicked(e->{
            TotalResult.setText(null);
            warningDay.setText(null);
            daysTF.setText(null);
            Menu();
            
        });
        
        backBC4.setOnMouseClicked(e->{
            viewOrder();
            
        });
        
        
        CalculateBT.setOnMouseClicked(e->{
            TotalResult.setText(null);
            warningDay.setText(null);
            try{
                if(Integer.parseInt(daysTF.getText())>0){
                    TotalResult.setText("RM "+String.valueOf(Integer.parseInt(daysTF.getText())*this.Price[user]));
                }else{
                    warningDay.setText("    !Must be MORE THAN 0!");
                }
            }catch(NumberFormatException f){
                    warningDay.setText("   !Please Insert Number only!");
                    daysTF.setText(null);
            }
        });
        
        ContinueBT.setOnMouseClicked(e->{
            Object[] options = {"Continue","Cancel"};
            int dia = JOptionPane.showOptionDialog(null,"You cannot Cancel after Order","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
            if(dia == JOptionPane.YES_OPTION){
                warningDay.setText(null);
                try{
                    if(Integer.parseInt(daysTF.getText())>0){


                        if(Auto.isSelected()){
                         Transmition="Auto";
                        }
                        if(Manual.isSelected()){
                         Transmition="Manual";
                        }
                        userday = Integer.parseInt(daysTF.getText());
                        daysTF.setText(null);
                        //set user car to array for record
                        userCar[userCarIndex]=user;


                        viewOrder();


                        HBox hb1 = new HBox(300);

                        StackPane spT = new StackPane();


                        new StackPane().getChildren().add(new Text(Transmition));
                        ImageView[] imageV = new ImageView[userCarIndex+1];
                        imageV[userCarIndex] = new ImageView(new Image(Image[userCar[userCarIndex]]));
                        imageV[userCarIndex].setFitHeight(200);
                        imageV[userCarIndex].setFitWidth(200);
                        GridPane gp = new GridPane();
                        Text text = new Text(Name[userCar[userCarIndex]]);
                        text.setFont(Font.font(25));
                        Text text1 = new Text(Transmition);
                        text1.setFont(Font.font(25));
                        Text text2 = new Text(userday+"days");
                        text2.setFont(Font.font(25));
                        Text text3 = new Text("TotalPrice RM "+String.valueOf(userday*this.Price[user]));
                        text3.setFont(Font.font(25));
                        Text text4 = new Text("RM "+String.valueOf(Price[user]));
                        text4.setFont(Font.font(25));
                        gp.add(imageV[userCarIndex], 0, 0);
                        gp.add(text, 1, 0);
                        gp.add(text1, 2, 0);
                        gp.add(text4, 3, 0);
                        gp.add(text2, 4, 0);
                        gp.add(text3, 5, 0);

                        gp.setHgap(200);
                        hb1.setAlignment(Pos.CENTER_LEFT);
                        hb1.setPrefWidth(1900);
                        hb1.getChildren().addAll(gp);
                        order.getItems().add(hb1);
                        finalPrice+=userday*this.Price[user];
                        FinalPriceT.setText("Fianl Total Price : RM "+String.valueOf(finalPrice)+"\t\t\t");
                        //after add index +1
                        userCarIndex++;

                    }else{
                        warningDay.setText("    !Must be MORE THAN 0!");
                    }


                }catch(NumberFormatException f){
                        warningDay.setText("   !Please Insert Number only!");
                        daysTF.setText(null);
                } 
            }
            
            
        });
        
        
//perodua-------------------------------------------------------------------------------
        Perodua.setOnMouseClicked(e->{
            userBrand = 1;
            Produa();
        });
        
        PeroduaViva.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 0;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        PeroduaAxia.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 1;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        PeroduaMyvi.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 2;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        PeroduaAlzaS.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 3;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        PeroduaAlzaSEAdvance.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 4;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        PeroduaAlzaMPV.setOnMouseClicked(e->{
            if(this.perdua == true){
                user = 5;
                ViewInfo(); 
                this.perdua = false;
            }
        });
        
//proton---------------------------------------------------------------------        
        Proton.setOnMouseClicked(e->{
            userBrand = 2;
            Proton();
        });
        
        ProtonSagaFLX.setOnMouseClicked(e->{
            if(this.proton == true){
                user = 6;
                ViewInfo(); 
                this.proton = false;
            }
        });
        ProtonIriz.setOnMouseClicked(e->{
            if(this.proton == true){
                user = 7;
                ViewInfo(); 
                this.proton = false;
            }
        });
        ProtonInspira.setOnMouseClicked(e->{
            if(this.proton == true){
                user = 8;
                ViewInfo(); 
                this.proton = false;
            }
        });
        ProtonExoraBold.setOnMouseClicked(e->{
            if(this.proton == true){
                user = 9;
                ViewInfo(); 
                this.proton = false;
            }
        });

//Honda---------------------------------------------------------------------  
        Honda.setOnMouseClicked(e->{
            userBrand = 3;
            Honda();
        });
        
        HondaJazzHybrid.setOnMouseClicked(e->{
            if(this.honda == true){
                user = 10;
                ViewInfo(); 
                this.honda = false;
            }
        });
        HondaCityVSpe.setOnMouseClicked(e->{
            if(this.honda == true){
                user = 11;
                ViewInfo(); 
                this.honda = false;
            }
        });
        HondaAccord.setOnMouseClicked(e->{
            if(this.honda == true){
                user = 12;
                ViewInfo(); 
                this.honda = false;
            }
        });
       
//Toyota---------------------------------------------------------------------          
        Toyota.setOnMouseClicked(e->{
            userBrand = 4;
            Toyota();
        });
        
        ToyotaVios.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 13;
                ViewInfo(); 
                this.toyota = false;
            }
        });
        ToyotaCamry.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 14;
                ViewInfo(); 
                this.toyota = false;
            }
        });
        
        ToyotaAlphard.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 15;
                ViewInfo(); 
                this.toyota = false;
            }
        });
        
        ToyotaHiace10seater.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 16;
                ViewInfo(); 
                this.toyota = false;
            }
        });
        
        ToyotaVellfire.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 17;
                ViewInfo(); 
                this.toyota = false;
            }
        });
        
        ToyotaEstima.setOnMouseClicked(e->{
            if(this.toyota == true){
                user = 18;
                ViewInfo(); 
                this.toyota = false;
            }
        });
//Hyundai---------------------------------------------------------------------          
        Hyundai.setOnMouseClicked(e->{
            userBrand = 5;
            Hyundai();
        });
        
        HyundaiStarex12.setOnMouseClicked(e->{
            if(this.hyundai == true){
                user = 19;
                ViewInfo(); 
                this.hyundai = false;
            }
        });
        
        HyundaiStarex11.setOnMouseClicked(e->{
            if(this.hyundai == true){
                user = 20;
                ViewInfo(); 
                this.hyundai = false;
            }
        });
//Nissan---------------------------------------------------------------------          
        Nissan.setOnMouseClicked(e->{
            userBrand = 6;
            Nissan();
        });
        
        NissanGrandLivina.setOnMouseClicked(e->{
            if(this.nissan == true){
                user = 21;
                ViewInfo(); 
                this.nissan = false;
            }
        });
        
        NissanUrvan.setOnMouseClicked(e->{
            if(this.nissan == true){
                user = 22;
                ViewInfo(); 
                this.nissan = false;
            }
        });
        
//BMW---------------------------------------------------------------------          
        BMW.setOnMouseClicked(e->{
            userBrand = 7;
            BMW();
        });
        
        BMW5seriesMSport.setOnMouseClicked(e->{
            if(this.bmw == true){
                user = 23;
                ViewInfo(); 
                this.bmw = false;
            }
        });
//Audi---------------------------------------------------------------------        
        Audi.setOnMouseClicked(e->{
            userBrand = 8;
            AUDI();
        });
        
        AUDIA3SLine.setOnMouseClicked(e->{
            if(this.audi == true){
                user = 24;
                ViewInfo(); 
                this.audi = false;
            }
        });
        
        AUDITTS.setOnMouseClicked(e->{
            if(this.audi == true){
                user = 25;
                ViewInfo(); 
                this.audi = false;
            }
        });
        
 //Mercedes---------------------------------------------------------------------         
        Mercedes.setOnMouseClicked(e->{
            userBrand = 9;
            Mercedes();
        });
        
        MercedesS400Hybrid.setOnMouseClicked(e->{
            if(this.mercedes == true){
                user = 26;
                ViewInfo(); 
                this.mercedes = false;
            }
        });
//Ford---------------------------------------------------------------------  
        Ford.setOnMouseClicked(e->{
            userBrand = 10;
            Ford();
        });
        
        FordTransit.setOnMouseClicked(e->{
            if(this.ford == true){
                user = 27;
                ViewInfo(); 
                this.ford = false;
            }
        });
//Mitsubishi---------------------------------------------------------------------  
        Mitsubishi.setOnMouseClicked(e->{
            userBrand = 11;
            Mitsubishi();
        });
        
        MitsubishiAttrage.setOnMouseClicked(e->{
            if(this.mitsubishi == true){
                user = 28;
                ViewInfo(); 
                this.mitsubishi = false;
            }
        });
//Weststar---------------------------------------------------------------------          
        Weststar.setOnMouseClicked(e->{
            userBrand = 12;
            Weststar();
        });
        
        WeststarMaxusG10.setOnMouseClicked(e->{
            if(this.weststar == true){
                user = 29;
                ViewInfo(); 
                this.weststar = false;
            }
        });
       
        
    }
    
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
