/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author dogaa
 */
public class Quiz1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        
        Label msg = new Label("Enter a sentence : ");
        
        TextField text = new TextField();
        Button btn = new Button("Submit");
        
        pane.add(msg, 0, 0);
        pane.add(text, 2, 0);
        pane.add(btn, 3, 0);
        
        Label l1 = new Label("A : ");
        Label l2 = new Label("B : ");
        Label l3 = new Label("C : ");
        Label l4 = new Label("D : ");
        Label l5 = new Label("E : ");
        Label l6 = new Label("F : ");
        Label l7 = new Label("G : ");
        Label l8 = new Label("H : ");
        Label l9 = new Label("I : ");
        Label l10 = new Label("J : ");
        Label l11 = new Label("K : ");
        Label l12 = new Label("L : ");
        Label l13 = new Label("M : ");
        Label l14 = new Label("N : ");
        Label l15 = new Label("O : ");
        Label l16 = new Label("P : ");
        Label l17 = new Label("Q : ");
        Label l18 = new Label("R : ");
        Label l19 = new Label("S : ");
        Label l20 = new Label("T : ");
        Label l21 = new Label("U : ");
        Label l22 = new Label("V : ");
        Label l23 = new Label("W : ");
        Label l24 = new Label("X : ");
        Label l25 = new Label("Y : ");
        Label l26 = new Label("Z : ");
        
        Label A = new Label("");
        Label B = new Label("");
        Label C = new Label("");
        Label D = new Label("");
        Label E = new Label("");
        Label F = new Label("");
        Label G = new Label("");
        Label H = new Label("");
        Label I = new Label("");
        Label J = new Label("");
        Label K = new Label("");
        Label L = new Label("");
        Label M = new Label("");
        Label N = new Label("");
        Label O = new Label("");
        Label P = new Label("");
        Label Q = new Label("");
        Label R = new Label("");
        Label S = new Label("");
        Label T = new Label("");
        Label U = new Label("");
        Label V = new Label("");
        Label W = new Label("");
        Label X = new Label("");
        Label Y = new Label("");
        Label Z = new Label("");
        
        
        
        
        
        
        
        pane.add(l1, 0, 1);
        pane.add(l2, 0, 2);
        pane.add(l3, 0, 3);
        pane.add(l4, 0, 4);
        pane.add(l5, 0, 5);
        pane.add(l6, 0, 6);
        pane.add(l7, 0, 7);
        pane.add(l8, 0, 8);
        pane.add(l9, 0, 9);
        pane.add(l10, 0, 10);
        pane.add(l11, 0, 11);
        pane.add(l12, 0, 12);
        pane.add(l13, 0, 13);
        pane.add(l14, 0, 14);
        pane.add(l15, 0, 15);
        pane.add(l16, 0, 16);
        pane.add(l17, 0, 17);
        pane.add(l18, 0, 18);
        pane.add(l19, 0, 19);
        pane.add(l20, 0, 20);
        pane.add(l21, 0, 21);
        pane.add(l22, 0, 22);
        pane.add(l23, 0, 23);
        pane.add(l24, 0, 24);
        pane.add(l25, 0, 25);
        pane.add(l26, 0, 26);
        
        pane.add(A, 1, 1);
        pane.add(B, 1, 2);
        pane.add(C, 1, 3);
        pane.add(D, 1, 4);
        pane.add(E, 1, 5);
        pane.add(F, 1, 6);
        pane.add(G, 1, 7);
        pane.add(H, 1, 8);
        pane.add(I, 1, 9);
        pane.add(J, 1, 10);
        pane.add(K, 1, 11);
        pane.add(L, 1, 12);
        pane.add(M, 1, 13);
        pane.add(N, 1, 14);
        pane.add(O, 1, 15);
        pane.add(P, 1, 16);
        pane.add(Q, 1, 17);
        pane.add(R, 1, 18);
        pane.add(S, 1, 19);
        pane.add(T, 1, 20);
        pane.add(U, 1, 21);
        pane.add(V, 1, 22);
        pane.add(W, 1, 23);
        pane.add(X, 1, 24);
        pane.add(Y, 1, 25);
        pane.add(Z, 1, 26);
        
        
        int[] abc = new int[26]; 
        
        
        btn.setOnAction(e->{
        String a = text.getText();
        char[] b = a.toCharArray();
        
        for(int i = 0; i<b.length; i++){
            if(Character.isLetter(b[i])){
                
                
                if(b[i]=='a'||b[i]=='A'){
                    abc[0]++;
                }
                if(b[i]=='b'||b[i]=='B'){
                    abc[1]++;
                }
                if(b[i]=='c'||b[i]=='C'){
                    abc[2]++;
                }
                if(b[i]=='d'||b[i]=='D'){
                    abc[3]++;
                }
                if(b[i]=='e'||b[i]=='E'){
                    abc[4]++;
                }
                if(b[i]=='f'||b[i]=='F'){
                    abc[5]++;
                }
                if(b[i]=='g'||b[i]=='G'){
                    abc[6]++;
                }
                if(b[i]=='h'||b[i]=='H'){
                    abc[7]++;
                }
                if(b[i]=='i'||b[i]=='I'){
                    abc[8]++;
                }
                if(b[i]=='j'||b[i]=='J'){
                    abc[9]++;
                }
                if(b[i]=='k'||b[i]=='K'){
                    abc[10]++;
                }
                if(b[i]=='l'||b[i]=='L'){
                    abc[11]++;
                }
                if(b[i]=='m'||b[i]=='M'){
                    abc[12]++;
                }
                if(b[i]=='n'||b[i]=='N'){
                    abc[13]++;
                }
                if(b[i]=='o'||b[i]=='O'){
                    abc[14]++;
                }
                if(b[i]=='p'||b[i]=='P'){
                    abc[15]++;
                }
                if(b[i]=='q'||b[i]=='Q'){
                    abc[16]++;
                }
                if(b[i]=='r'||b[i]=='R'){
                    abc[17]++;
                }
                if(b[i]=='s'||b[i]=='S'){
                    abc[18]++;
                }
                if(b[i]=='t'||b[i]=='T'){
                    abc[19]++;
                }
                if(b[i]=='u'||b[i]=='U'){
                    abc[20]++;
                }
                if(b[i]=='v'||b[i]=='V'){
                    abc[21]++;
                }
                if(b[i]=='w'||b[i]=='W'){
                    abc[22]++;
                }
                if(b[i]=='x'||b[i]=='X'){
                    abc[23]++;
                }
                if(b[i]=='y'||b[i]=='Y'){
                    abc[24]++;
                }
                if(b[i]=='z'||b[i]=='Z'){
                    abc[25]++;
                }
            }
            
           A.setText(Integer.toString(abc[0]));
        B.setText(Integer.toString(abc[1]));
        C.setText(Integer.toString(abc[2]));
        D.setText(Integer.toString(abc[3]));
        E.setText(Integer.toString(abc[4]));
        F.setText(Integer.toString(abc[5]));
        G.setText(Integer.toString(abc[6]));
        H.setText(Integer.toString(abc[7]));
        I.setText(Integer.toString(abc[8]));
        J.setText(Integer.toString(abc[9]));
        K.setText(Integer.toString(abc[10]));
        L.setText(Integer.toString(abc[11]));
        M.setText(Integer.toString(abc[12]));
        N.setText(Integer.toString(abc[13]));
        O.setText(Integer.toString(abc[14]));
        P.setText(Integer.toString(abc[15]));
        Q.setText(Integer.toString(abc[16]));
        R.setText(Integer.toString(abc[17]));
        S.setText(Integer.toString(abc[18]));
        T.setText(Integer.toString(abc[19]));
        U.setText(Integer.toString(abc[20]));
        V.setText(Integer.toString(abc[21]));
        W.setText(Integer.toString(abc[22]));
        X.setText(Integer.toString(abc[23]));
        Y.setText(Integer.toString(abc[24]));
        Z.setText(Integer.toString(abc[25]));
            
        
        
        }
        
        
        
        
        
        
        
        });
        
        
        


        
        
        
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
