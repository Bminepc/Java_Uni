package Uebung5.Aufgabe14;

public class BonbonGlas {
    private int anzahl_bonbons;
    boolean verfuegbar = true;


    public BonbonGlas(int anzahl){
        this.anzahl_bonbons = anzahl;
    }
    public synchronized void bonbonNehmen(){
        while(!verfuegbar){
            try{wait();}
            catch (InterruptedException e) {}
        }
        verfuegbar = false;
        anzahl_bonbons--;
        verfuegbar = true;
        notify();

    }
    public String toString(){
        return " " + anzahl_bonbons;
    }
}
