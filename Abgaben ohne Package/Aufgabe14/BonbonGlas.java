/*************************************************************/
/* Mathis Steinhage, Benjamin Wendt                          */
/* Gruppe: Di10                                              */
/* Uebungsblatt: 5, Aufgabe: 14                              */
/* Thema: Das Bonbonglas, Threads, Einfache Synchronisierung */
/* Datum: 23.06.2023                                         */
/* Status: lauffaehig                                        */
/*************************************************************/

public class BonbonGlas {
    private int anzahl_bonbons;
    boolean verfuegbar = true;

    public BonbonGlas(int anzahl) { // Konstruktor mit Initialisierung des Glases
        this.anzahl_bonbons = anzahl;
    }

    public synchronized void bonbonNehmen() { // Synchronisierte Methode um das Entnehmen mehreren Threads zeitgleich zu ermöglichen (mit selbst implementiertem Lock)
        while (!verfuegbar) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        verfuegbar = false;
        anzahl_bonbons--;
        verfuegbar = true;
        notify();

    }

    public String toString() { // Einfache Ausgabemöglichkeit
        return " " + anzahl_bonbons;
    }
}
