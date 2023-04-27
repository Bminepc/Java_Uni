package Uebung2.Aufgabe6;

public abstract class Satellit extends Himmelskörper {
    private Himmelskörper parent;

    public Satellit(String name, double durchmesser, double alter, Himmelskörper parent) {
        super(name, durchmesser, alter);
        this.parent = parent;
    }

    public String toString() {
        return super.toString() + ", Parent: {" + parent.toString() + "}";
    }
}
