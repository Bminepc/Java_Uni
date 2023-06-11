package Uebung4.Aufgabe12;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Speiseplan extends JFrame{


    public static void main(String[] args){
        ArrayList<String> rawData = new ArrayList<String>();
        try (FileReader fr = new FileReader(new File(args[0]));
             BufferedReader br = new BufferedReader(fr))
        {
            System.out.println("Inhalt␣von␣" + args[0]);
            String zeile = br.readLine();
            while (zeile != null)
            {
                rawData.add(zeile);
                zeile = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Speiseplan f = new Speiseplan();

        String[] datasets = new String[rawData.size()];
        for( int i = 0; i<rawData.size();i++){
            datasets[i] = rawData.get(i);
        }
        String[] c = datasets[0].split(";");
        String[][] dataset = new String[datasets.length][c.length];
        for (int i = 0; i<dataset.length;i++){
            dataset[i] = datasets[i].split(";");
        }

        JTable table = new JTable(dataset,dataset[0]);
        f.add(table);
        f.pack();
        f.setSize(800,200);
        f.setVisible(true);
    }
}
