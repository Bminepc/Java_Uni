package Uebung2.Aufgabe6;

public abstract class Kleinkörper extends Satellit {

    public Kleinkörper(String name, double durchmesser, double alter, Himmelskörper parent) {
        super(name, durchmesser, alter, parent);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
