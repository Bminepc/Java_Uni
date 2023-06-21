package Uebung5.Aufgabe15;

public class WinnerAnnouncer {
    boolean oneHasWon = false;

    public synchronized  void setWon(){
        oneHasWon = true;
    }

    public synchronized boolean hasWon(){
        return oneHasWon;
    }
}
