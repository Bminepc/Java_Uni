package Uebung2.Aufgabe6;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Stern extends Himmelskörper {
    // Festlegen der Enums
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

    // Konstruktoren
    public Stern(String name, double durchmesser, double alter, Spektralklasse spektralklasse, Leuchtkraftklasse leuchtkraftklasse) {
        super(name, durchmesser, alter);
        this.spektralklasse = spektralklasse;
        this.leuchtkraftklasse = leuchtkraftklasse;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Spektralklasse: " + spektralklasse + ", Leuchtkraftklasse: " + leuchtkraftklasse;
    }

}
