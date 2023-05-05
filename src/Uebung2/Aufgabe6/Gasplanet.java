package Uebung2.Aufgabe6;

public class Gasplanet extends Planet {
    private double dichte;


    // Konstruktoren
    public Gasplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde, double dichte) {
        super(name, durchmesser, alter, parent, nMonde, monde);
        this.dichte = dichte;
    }

    public Gasplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, double dichte) {
        super(name, durchmesser, alter, parent, nMonde);
        this.dichte = dichte;
    }


    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Dichte: " + dichte;
    }
}
