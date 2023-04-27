package Uebung2.Aufgabe6;

public class Stern extends Himmelskörper {
    enum Leuchtkraftklasse {
        lk_0,
        lk_I,
        lk_II,
        lk_III,
        lk_IV,
        lk_V,
        lk_VI,
        lk_VII
    }

    enum Spektralklasse {
        sk_O,
        sk_B,
        sk_A,
        sk_F,
        sk_G,
        sk_K,
        sk_M
    }

    private Spektralklasse spektralklasse;
    private Leuchtkraftklasse leuchtkraftklasse;

    public Stern(String name, double durchmesser, double alter, Spektralklasse spektralklasse) {
        super(name, durchmesser, alter);
        this.spektralklasse = spektralklasse;
    }

    public String toString() {
        return super.toString() + ", Spektralklasse: " + spektralklasse + ", Leuchtkraftklasse: " + leuchtkraftklasse;
    }

}
