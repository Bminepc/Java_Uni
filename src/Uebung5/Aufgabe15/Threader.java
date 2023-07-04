package Uebung5.Aufgabe15;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threader extends Thread {
    Balken jpb;
    Random rand = new Random();
    WinnerAnnouncer w;

    private static final Lock lock = new ReentrantLock();

    public Threader(Balken jpb, WinnerAnnouncer w) { // Konstruktor mit Initialisierung des Balkens und der Hilfsklasse
        this.jpb = jpb;
        this.w = w;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) { // Wiederhole 100 Mal
            try {
                sleep(rand.nextInt(200)); // Warte eine zufällige Zeit zwischen 1 und 200 Millisekunden
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.lock();
            if (w.hasWon()) return; // Wenn noch keiner die 100% erreicht hat
            jpb.proceed(); // Bewege den Balken um einen weiter
            if(i<99)
                lock.unlock();
        }
        w.setWon(); // Wenn 100 Mal ausgeführt und nicht vorher terminiert, setzte den Gewonnen-Status auf gewonnen
        lock.unlock();
    }
}
