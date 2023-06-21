package Uebung5.Aufgabe15;

import javax.swing.*;
import java.awt.*;
import java.lang.annotation.AnnotationTypeMismatchException;

import static javax.swing.SwingConstants.HORIZONTAL;
import static javax.swing.SwingConstants.VERTICAL;

public class Fortschrittsbalken extends JFrame {
    int threadAnzahl;
    Thread[] t;
    WinnerAnnouncer w = new WinnerAnnouncer();
    public Fortschrittsbalken(){
        super("Rennen");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setRootPaneCheckingEnabled(false);
        this.setLayout( new GridLayout(threadAnzahl, 1));
    }

    public void runFortschrittsbalken(int n){
        this.threadAnzahl = n;
        t = new Thread[n];
        for (int i = 0; i < threadAnzahl; i++){
            Balken temp = new Balken(HORIZONTAL, 0, 100);
            temp.setString("Rennthread " + i);
            temp.setStringPainted(true);
            t[i] = new Threader(temp, w);
            add(temp);
        }
        pack();
        setVisible(true);
        for (int i = 0; i < n; i++) {
            t[i].start();
        }
    }

    public static void main(String[] args){
        Fortschrittsbalken ftemp = new Fortschrittsbalken();
        try {
            ftemp.runFortschrittsbalken(Integer.parseInt(args[0]));
        }catch (AnnotationTypeMismatchException e){

        }
    }
}
