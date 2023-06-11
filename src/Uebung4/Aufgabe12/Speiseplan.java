package Uebung4.Aufgabe12;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Speiseplan extends JFrame{

    private String[] datasets;
    public Speiseplan(){
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        makeTable();
    }

    public void setDatasets(String[] Datasets){
        datasets = Datasets;
    }

    public void makeTable(){
        String[] c = datasets[0].split(";");
        String[][] dataset = new String[datasets.length][c.length];
        for (int i = 0; i<dataset.length;i++){
                dataset[i] = datasets[i].split(";");

        }
        System.out.println(c);
        JTable table = new JTable(dataset,dataset[0]);
        this.add(table);
    }

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
        String[] datasetss = new String[rawData.size()];
        for( int i = 0; i<rawData.size();i++){
            datasetss[i] = rawData.get(i);
        }
        Speiseplan s = new Speiseplan();
        s.setDatasets(datasetss);
        SwingUtilities.invokeLater((Runnable) s);
    }
}
