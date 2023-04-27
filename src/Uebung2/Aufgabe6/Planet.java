package Uebung2.Aufgabe6;

public abstract class Planet extends Satellit {
    // TODO Monde bitte was?
    private int nMonde;
    private Satellit[MONDE_MAX];

    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
    }

    // TODO For für alle Satteliten!
    public String toString() {
        return super.toString() + ", Anzahl Monde: " + nMonde + ", Satelliten: {" +
    }
}
