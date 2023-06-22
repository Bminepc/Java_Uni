package Uebung5.Aufgabe14;

public class Main {
    public static void main(String[] args) {
        BonbonGlas bglas = new BonbonGlas(10000); // Erstellen eines Glases
        System.out.println(bglas); // Ausgabe vor dem Entnehmen
        Kind[] kinder = new Kind[10]; // Anlegen eines Arrays zur Verwaltung der Threads
        for (int i = 0; i < 10; i++) {
            kinder[i] = new Kind(bglas); // Initialisierung jedes Threads
            kinder[i].run(); // Starten jedes Threads
        }
        for (int i = 0; i < 10; i++) {
            try {
                kinder[i].join(); // Abwarten bis alle Threads "fertig" sind
            } catch (InterruptedException e) {
                System.out.println("Well that's something");
            }
        }
        System.out.println(bglas); // Ausgabe nach dem Entnehmen

    }
}
