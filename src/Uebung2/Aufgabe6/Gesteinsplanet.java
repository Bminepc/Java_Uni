package Uebung2.Aufgabe6;

public class Gesteinsplanet extends Planet {
    private int bevölkerung;

    public Gesteinsplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde, int bevölkerung) {
        super(name, durchmesser, alter, parent, nMonde, monde);
        this.bevölkerung = bevölkerung;
    }

    public Gesteinsplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, int bevölkerung) {
        super(name, durchmesser, alter, parent, nMonde);
        this.bevölkerung = bevölkerung;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bevölkerung: " + bevölkerung;
    }
}
