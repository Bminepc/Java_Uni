package Uebung2.Aufgabe6;

public class Gasplanet extends Planet {
    private double dichte;

    public Gasplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, double dichte) {
        super(name, durchmesser, alter, parent, nMonde);
        this.dichte = dichte;
    }

    public String toString() {
        return super.toString() + ", Dichte: " + dichte;
    }
}
