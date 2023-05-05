/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Gesteinsplanet extends Planet {
    private int bevölkerung;

    // Konstruktoren (Einer mit Monden einer ohne Monde)
    public Gesteinsplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde, int bevölkerung) {
        super(name, durchmesser, alter, parent, nMonde, monde);
        this.bevölkerung = bevölkerung;
    }

    public Gesteinsplanet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, int bevölkerung) {
        super(name, durchmesser, alter, parent, nMonde);
        this.bevölkerung = bevölkerung;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Bevölkerung: " + bevölkerung;
    }
}
