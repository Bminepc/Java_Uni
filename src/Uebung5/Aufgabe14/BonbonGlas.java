package Uebung5.Aufgabe14;

public class BonbonGlas {
    private int anzahl_bonbons;


    public BonbonGlas(int a){
        this.anzahl_bonbons = a;
    }
    public synchronized void bonbonNehmen(){
        boolean verfuegbar = true;
        while(!verfuegbar){
            try{wait();}
            catch (InterruptedException e) {}
        }
        verfuegbar = false;
        notify();

    }
    public String toString(){
        return null;
    }
}
