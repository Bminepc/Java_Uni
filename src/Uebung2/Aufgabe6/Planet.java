package Uebung2.Aufgabe6;

public abstract class Planet extends Satellit {
    final int MONDE_MAX = 3;
    private int nMonde;
    private Satellit[] Monde = new Satellit[MONDE_MAX];

    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
        Monde = monde;
    }

    @Override
    public String toString() {
        String ausgabeString = super.toString() + ", Anzahl Monde: " + nMonde + ", Satelliten: { ";
        for (Satellit satellit : Monde) {
            ausgabeString = ausgabeString + satellit.toString() + "; ";
        }
        return ausgabeString;
    }
}
