/*************************************************************/
/* Mathis Steinhage, Benjamin Wendt                          */
/* Gruppe: Di10                                              */
/* Uebungsblatt: 5, Aufgabe: 14                              */
/* Thema: Das Bonbonglas, Threads, Einfache Synchronisierung */
/* Datum: 23.06.2023                                         */
/* Status: lauffaehig                                        */
/*************************************************************/

public class Kind extends Thread implements Runnable {
    private BonbonGlas glas;

    public Kind(BonbonGlas glas) { // Initialisierung der Klasse und Übergabe des Glases mit Bonbons
        this.glas = glas;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) { // 1000 Bonbons entnehmen
            glas.bonbonNehmen();
        }
    }
}
