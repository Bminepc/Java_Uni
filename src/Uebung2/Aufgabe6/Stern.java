package Uebung2.Aufgabe6;

public class Stern extends Himmelskörper {
    // TODO Add the Enums
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

}
