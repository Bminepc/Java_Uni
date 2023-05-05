package Uebung2.Aufgabe6;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Asteroid extends Kleinkörper {
    private boolean eisenkern;

    // Konstruktoren
    public Asteroid(String name, double durchmesser, double alter, Himmelskörper parent, boolean eisenkern) {
        super(name, durchmesser, alter, parent);
        this.eisenkern = eisenkern;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString() + ", Hat Eisenkern: " + eisenkern;
    }
}
