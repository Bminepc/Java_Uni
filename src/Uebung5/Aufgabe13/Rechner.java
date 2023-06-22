package Uebung5.Aufgabe13;

import java.math.BigDecimal;

public class Rechner extends Thread {
    private int stelle;
    private int n;
    private ApproxPi approxPi;

    // Initialisierung der Klasse mit den nötigen Parametern
    public Rechner(int stelle, int n, ApproxPi approxPi) {
        this.n = n;
        this.stelle = stelle;
        this.approxPi = approxPi;
    }

    public void berechneTeil() {
        double d = 4 / (((double) stelle / (double) n) * ((double) stelle / (double) n) + 1); // Rechnung aus der Aufgabenstellung
        approxPi.addPart(new BigDecimal(d)); // Übergabe des berechneten Teils an die Verwalterklasse
        System.out.println((double) stelle / (double) n); // Prozentausgabe des Fortschritts (Nur bei wirklich großen Werten nützlich)
    }

    @Override
    public void run() {
        super.run();
        berechneTeil();
    }
}

