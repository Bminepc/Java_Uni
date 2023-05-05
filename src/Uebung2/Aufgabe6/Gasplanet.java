package Uebung2.Aufgabe6;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Gasplanet extends Planet {
    private double dichte;


    // Konstruktoren (Einer mit Monden einer ohne Monde)
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
