package Uebung4.Aufgabe12;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class SpeiseplanMuster extends JFrame{
    private JTable jTable;
    public SpeiseplanMuster(String[][] plan){
        super("Speiseplan");

        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jTable = new JTable(plan, plan[0]);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(150);

        super.add(jTable);
        super.pack();
        super.setVisible(true);
    }
    public static void main(String[] argv){
        String[][] speiseplan;
        int anzZeilen = 0;
        int anzSpalten = 0;

        Vector<String> zeilen = new Vector<>();

        try{
            File datei = new File(argv[0]);
            FileReader fr = new FileReader(datei);

            BufferedReader br = new BufferedReader(fr);
            String zeile = br.readLine();

            while(zeile != null){
                zeilen.add(zeile);
                zeile = br.readLine();
            }

            anzZeilen = zeilen.size();

            anzSpalten = zeilen.elementAt(0).split(";").length;

            String zeile1 = zeilen.elementAt(0);
            String[] splitZeile = zeile1.split(";");
            anzZeilen = splitZeile.length;

            speiseplan = new String[anzZeilen][anzSpalten];

            int i = 0;
            int j= 0;

            for(String z: zeilen){
                StringTokenizer st = new StringTokenizer(z, ";");

                while(st.hasMoreTokens()){
                    speiseplan[i][j] = st.nextToken();
                    j++;
                }
                j = 0;
                i++;
            }
            new SpeiseplanMuster(speiseplan);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
