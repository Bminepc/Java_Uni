package Uebung4.Aufgabe12;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Speiseplan extends JFrame{

    public Speiseplan(){
        // Standardeinstellungen für ein Fenster
        super("Speiseplan");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        // Erstellen einer Arraylist um für eine variable Größe der Eingangsdaten vorbereitet zu sein
        ArrayList<String> rawData = new ArrayList<String>();
        // Filereader und Bufferedreader als automatisch gemanaged öffnen und ein Try-Catch für deren Fehler erstellen.
        try (FileReader fr = new FileReader(new File(args[0]));
             BufferedReader br = new BufferedReader(fr))
        {
            // Einlesen aller Zeilen und hinzufügen zu der oben erstellenen Arraylist.
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
        // Erstellen eines Speiseplans (und selbst) als JFrame der Software
        Speiseplan f = new Speiseplan();

        // Umwandeln der Daten in Stringarrays zur einfachen Nutzung

        // Umwandlung der theoretisch unbekannt langen Arraylist in ein Stringarray mit fester Größe
        String[] datasets = new String[rawData.size()];
        for( int i = 0; i<rawData.size();i++){
            datasets[i] = rawData.get(i);
        }
        // Aufteilen der als CSV formatierten Daten in einzelne Datensätze dank der String.split Methode.

        // Ein Stringarray als Refferenz erstellen
        String[] c = datasets[0].split(";");
        // Das zweidimensionale Array für die Tabelle instanziieren
        String[][] dataset = new String[datasets.length][c.length];
        // Das Array mit den entsprechenden Daten füllen
        for (int i = 0; i<dataset.length;i++){
            dataset[i] = datasets[i].split(";");
        }

        // Einen JTable erstellen mit dem Konstruktor für zweidimensionale Arrays als Daten
        JTable table = new JTable(dataset,dataset[0]);
        // Hinzufügen der Tables zu unserem Fenster
        f.add(table);
        // Aufräumen
        f.pack();
        // Quick and Dirty but works
        // Hier wird die Größe so angepasst, dass alles zu lesen ist. Es gibt mit Sicherheit eine schönere Möglichkeit, aber diese sollte in jedem Fall zum gewünschten Ergebniss führen. (Wie es richtig geht wird bald per Lösung aus der Übung ergänzt)
        f.setSize(800,200);
        // Alles sichtbar machen und zufrieden sein
        f.setVisible(true);
    }
}
