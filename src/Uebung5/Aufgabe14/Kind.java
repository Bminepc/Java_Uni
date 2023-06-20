package Uebung5.Aufgabe14;

public class Kind extends Thread implements Runnable{
    private BonbonGlas glas;
    public Kind(BonbonGlas glas){
        this.glas = glas;
    }
    @Override
    public void run() {
        for (int i = 0; i<1000;i++) {
            glas.bonbonNehmen();
        }
    }
}
