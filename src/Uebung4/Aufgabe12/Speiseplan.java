package Uebung4.Aufgabe12;

import Uebung4.Aufgabe11.FarbigePixel;

import javax.swing.*;
import java.io.*;

public class Speiseplan extends JFrame{

    private static String[] rawData;
    public Speiseplan(){
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(Speiseplan::new);
        try (FileReader fr = new FileReader(new File(args[0]));
             BufferedReader br = new BufferedReader(fr))
        {
            System.out.println("Inhalt␣von␣" + args[0]);
            String zeile = br.readLine();
            while (zeile != null)
            {
                System.out.println(zeile);
                zeile = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
