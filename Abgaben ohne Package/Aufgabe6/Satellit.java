/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public abstract class Satellit extends Himmelskörper {
    private Himmelskörper parent;

    // Konstruktoren
    public Satellit(String name, double durchmesser, double alter, Himmelskörper parent) {
        super(name, durchmesser, alter);
        this.parent = parent;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Parent: {" + parent.toString() + "}";
    }
}
