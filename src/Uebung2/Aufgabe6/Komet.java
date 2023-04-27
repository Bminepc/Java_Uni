package Uebung2.Aufgabe6;

public class Komet extends Kleinkörper {
    private double periode;

    public Komet(String name, double durchmesser, double alter, Himmelskörper parent, double periode) {
        super(name, durchmesser, alter, parent);
        this.periode = periode;
    }

    public String toString() {
        return super.toString() + ", Periode: " + periode;
    }
}
