package Uebung4.Aufgabe12;

import Uebung4.Aufgabe11.FarbigePixel;

import javax.swing.*;

public class Speiseplan extends JFrame{

    private static String[] rawData;
    public Speiseplan(){
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        args[0];
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Speiseplan::new);
    }
}
