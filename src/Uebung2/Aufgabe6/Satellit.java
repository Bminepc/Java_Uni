package Uebung2.Aufgabe6;

public abstract class Satellit extends Himmelskörper {
    private Himmelskörper parent;

    public String toString() {
        return super.toString() + ", Parent: {" + parent.toString() + "}";
    }
}
