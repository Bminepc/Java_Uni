/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 5, Aufgabe: 13                   */
/* Thema: Parallele Berechnung von Pi mit Threads */
/* Datum: 23.06.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

import java.math.BigDecimal;

public class PiBerechnen {

    private static final int N = 1000; // Einzustellende Anzahl der Unterberechnungen und damit auch Threads
    // Result with N = 10000000
    // 3.141592653589791571707934281221241690218448638916015625

    public static void main(String[] args) {
        ApproxPi approxPi = new ApproxPi(); // Verwalterklasse für den approximierten Wert von Pi
        Rechner[] calc = new Rechner[N - 1]; // Array zur Verwaltung der Threads
        for (int i = 0; i < calc.length; i++) {
            calc[i] = new Rechner(i + 1, N, approxPi); // Threads erstellen und initialisieren
            calc[i].start(); // Threads starten
        }
        for (int i = 0; i < calc.length; i++) {
            try {
                calc[i].join(); // Warten, bis alle Threads fertig sind
            } catch (InterruptedException e) {
                System.out.println("Something went wrong. Please try again");
            }
        }
        approxPi.addPart(new BigDecimal(2)); //Wert für f(0) = 2 (Berechnung für statischen Wert per Hand)
        approxPi.addPart(new BigDecimal(1)); //Wert für f(1) = 1 (Berechnung für statischen Wert per Hand)
        approxPi.scaleMe(N); // Skalierung aus der Aufgabenstellung anwenden

        System.out.println("Ausgabe:");
        System.out.println(approxPi);


    }
}
