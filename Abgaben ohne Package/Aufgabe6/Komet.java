/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Komet extends Kleinkörper {
    private double periode;

    // Konstruktoren
    public Komet(String name, double durchmesser, double alter, Himmelskörper parent, double periode) {
        super(name, durchmesser, alter, parent);
        this.periode = periode;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Periode: " + periode;
    }
}
