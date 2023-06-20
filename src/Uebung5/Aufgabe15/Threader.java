package Uebung5.Aufgabe15;

import java.util.Random;
public class Threader extends Thread{
    Balken jpb;
    Random rand = new Random();
    WinnerAnnouncer w;
    public Threader(Balken jpb, WinnerAnnouncer w){
        this.jpb = jpb;
        this.w = w;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            try {
                sleep(rand.nextInt(200));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(w.hasWon()) return;
            jpb.procced();
        }
        w.setWon();
    }
}
