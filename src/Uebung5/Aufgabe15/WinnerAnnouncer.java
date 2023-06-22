package Uebung5.Aufgabe15;

public class WinnerAnnouncer {
    boolean oneHasWon = false;

    public synchronized void setWon() { // Setzten des "Gewonnen" Status zum Beenden des Programms
        oneHasWon = true;
    }

    public synchronized boolean hasWon() { // Abfragemöglichkeit des Status
        return oneHasWon;
    }
}
