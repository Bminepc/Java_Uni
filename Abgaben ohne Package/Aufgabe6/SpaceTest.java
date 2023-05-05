/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class SpaceTest {

    public static void main(String[] args) {

        // Erstellen einer Sonne
        Stern sonne = new Stern("Sonne", 1200000000, 120000000000.0, Stern.Spektralklasse.sk_G, Stern.Leuchtkraftklasse.lk_I);
        // Deklarieren eines Arrays für drei Planeten
        Planet[] planetes = new Planet[3];
        // Erstellen eines Planeten OHNE Monde
        planetes[0] = new Gesteinsplanet("Merkur", 4879.0, 120000.0, sonne, 0, 0);
        // Erstellen eines Planeten mit der Intention Monde hinzuzufügen
        planetes[1] = new Gesteinsplanet("Erde", 12756.0, 12000.0, sonne, 1, 8000000);
        // Erstellen eines Mondes des Planeten an der Stelle 1 im Array
        Gesteinsplanet erdmond = new Gesteinsplanet("Erdmond", 3.0, 23.9, planetes[1], 0, 0);
        // Hinzufügen des Mondes zu dem Planeten an der Stelle 1 im Array
        planetes[1].addMond(erdmond, 0);
        // Erstellen eines Gasplaneten
        planetes[2] = new Gasplanet("Jupiter", 235432.0, 120000.0, sonne, 0, 12.0);
        // Deklarieren eines Arrays für drei Kleinkörper
        Kleinkörper[] kleinkorper = new Kleinkörper[3];
        // Erstellen zweier Kometen
        kleinkorper[0] = new Komet("Seltsamer1", 1, 1.0, sonne, 34.0);
        kleinkorper[1] = new Komet("Seltsamer2", 2, 2.0, sonne, 34.0);
        // Erstellen eines Asteroiden
        kleinkorper[2] = new Asteroid("Asto", 30, 120000.0, sonne, true);

        // Ausgaben
        System.out.println("Ausgabe der Sonne:");
        System.out.println(sonne);
        System.out.println("------------------------------------------");
        System.out.println("Ausgabe der Planeten:");
        for (Planet p : planetes) {
            System.out.println(p);
        }
        System.out.println("------------------------------------------");
        System.out.println("Ausgabe der Kleinkörper");
        for (Kleinkörper k : kleinkorper) {
            System.out.println(k);
        }
    }
}
