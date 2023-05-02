package Uebung2.Aufgabe6;


public class SpaceTest {

    public static void main(String[] args) {

        // Initialisieren
        Stern sonne = new Stern("Sonne", 1200000000, 120000000000.0, Stern.Spektralklasse.sk_G, Stern.Leuchtkraftklasse.lk_I);
        Planet[] planetes = new Planet[2];
        planetes[0] = new Gesteinsplanet("Merkur", 4879.0, 120000.0, sonne, 0, 0);
        planetes[1] = new Gesteinsplanet("Erde", 12756.0, 12000.0, sonne, 1, 8000000);
        Gesteinsplanet erdmond = new Gesteinsplanet("Erdmond", 3.0, 23.9, planetes[1], 0, 0);
        planetes[1].addMond(erdmond, 0);
        Kleinkörper[] kleinkorper = new Kleinkörper[3];
        kleinkorper[0] = new Komet("Seltsamer1", 1, 1.0, sonne, 34.0);
        kleinkorper[1] = new Komet("Seltsamer2", 2, 2.0, sonne, 34.0);
        kleinkorper[2] = new Asteroid("Asto", 30, 120000.0, sonne, true);
        // Ausgaben
        System.out.println(sonne);
        for (Planet p : planetes) {
            System.out.println(p.toString());
        }
        for (Kleinkörper k : kleinkorper) {
            System.out.println(k.toString());
        }
    }
}
