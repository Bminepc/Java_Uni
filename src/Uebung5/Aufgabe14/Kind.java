package Uebung5.Aufgabe14;

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
