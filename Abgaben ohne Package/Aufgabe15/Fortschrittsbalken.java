/*****************************************/
/* Mathis Steinhage, Benjamin Wendt      */
/* Gruppe: Di10                          */
/* Uebungsblatt: 5, Aufgabe: 15          */
/* Thema: Wettlauf der Fortschritsbalken */
/* Datum: 23.06.2023                     */
/* Status: lauffaehig                    */
/*****************************************/

import javax.swing.*;
import java.awt.*;
import java.lang.annotation.AnnotationTypeMismatchException;

import static javax.swing.SwingConstants.HORIZONTAL;

public class Fortschrittsbalken extends JFrame {
    int threadAnzahl;
    Thread[] t;
    WinnerAnnouncer w = new WinnerAnnouncer(); // Verwalterklasse zur Bestimmung des "Gewinners"

    public Fortschrittsbalken() {
        // Standarteinstellungen
        super("Rennen");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setRootPaneCheckingEnabled(false);
        this.setLayout(new GridLayout(threadAnzahl, 1)); // Eine Spalte mit so vielen Zeilen wir es Threads gibt
    }

    public void runFortschrittsbalken(int n) {
        this.threadAnzahl = n;
        t = new Thread[n]; // Array zur verwaltung der Threads
        for (int i = 0; i < threadAnzahl; i++) {
            Balken temp = new Balken(HORIZONTAL, 0, 100); // Erstellen des eigenen Balken
            temp.setString("Rennthread " + i); // Setzen des Namens
            temp.setStringPainted(true); // Anzeigen des Namens
            t[i] = new Threader(temp, w); // Erstellen des Treads und übergeben des Balken
            add(temp); // Hinzufügen des Balken zum JFrame
        }
        pack(); // Aufräumen
        setVisible(true); // Sichtbar machen
        for (int i = 0; i < n; i++) { // Starten der Threads
            t[i].start();
        }
    }

    public static void main(String[] args) {
        Fortschrittsbalken ftemp = new Fortschrittsbalken(); // Erstellen einer neuen Balkenverwaltung
        try {
            ftemp.runFortschrittsbalken(Integer.parseInt(args[0])); // Ausführen der Balkenverwaltung
        } catch (AnnotationTypeMismatchException e) { // Nötig wegen des ParseInt

        }
    }
}
