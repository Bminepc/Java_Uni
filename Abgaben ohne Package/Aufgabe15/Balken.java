/*****************************************/
/* Mathis Steinhage, Benjamin Wendt      */
/* Gruppe: Di10                          */
/* Uebungsblatt: 5, Aufgabe: 15          */
/* Thema: Wettlauf der Fortschritsbalken */
/* Datum: 23.06.2023                     */
/* Status: lauffaehig                    */
/*****************************************/

import javax.swing.*;

public class Balken extends JProgressBar {
    // Aufruf des Konstruktors der Elternklasse
    public Balken(int Orientation, int min, int max) {
        super(Orientation, min, max);
    }

    public synchronized void proceed() {
        this.setValue(this.getValue() + 1); // Fortschreiten des Balkens um genau eine Einheit
    }

}
