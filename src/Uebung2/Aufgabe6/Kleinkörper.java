package Uebung2.Aufgabe6;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public abstract class Kleinkörper extends Satellit {

    // Konstruktoren
    public Kleinkörper(String name, double durchmesser, double alter, Himmelskörper parent) {
        super(name, durchmesser, alter, parent);
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return super.toString();
    }

}
