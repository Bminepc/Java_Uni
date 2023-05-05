package Uebung2.Aufgabe6;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public abstract class Himmelskörper {
    private String name;
    private double durchmesser;
    private double alter;


    // Konstruktoren
    public Himmelskörper(String name, double durchmesser, double alter){
        this.alter = alter;
        this.name = name;
        this.durchmesser = durchmesser;
    }
    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        return "Name: " + name + ", Durchmesser: " + durchmesser + ", Alter: " + alter;
    }
}
