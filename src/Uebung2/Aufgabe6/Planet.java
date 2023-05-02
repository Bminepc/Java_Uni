package Uebung2.Aufgabe6;

public abstract class Planet extends Satellit {
    private final int MONDE_MAX = 3;
    private int nMonde;
    private Satellit[] Monde = new Satellit[MONDE_MAX];

    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
        Monde = monde;
    }

    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
    }

    @Override
    public String toString() {
        String ausgabeString = super.toString() + ", Anzahl Monde: " + nMonde + ", Satelliten: { ";
        for (int i = 0; i<nMonde;i++) {
            ausgabeString = ausgabeString + Monde[i].toString() + "; ";
        }
        return ausgabeString;
    }

    public void setMonde(Satellit[] monde) {
        Monde = monde;
    }

    public void addMond(Satellit mond, int place){
        Monde[place] = mond;
    }
}
