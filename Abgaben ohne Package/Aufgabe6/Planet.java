/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 6                    */
/* Thema: Klassenhierarchie für Himmelskörper     */
/* Datum: 05.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public abstract class Planet extends Satellit {
    private final int MONDE_MAX = 3;
    private int nMonde;
    private Satellit[] Monde = new Satellit[MONDE_MAX];

    // Konstruktoren (Einer mit Monden einer ohne Monde)
    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde, Satellit[] monde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
        Monde = monde;
    }

    public Planet(String name, double durchmesser, double alter, Himmelskörper parent, int nMonde) {
        super(name, durchmesser, alter, parent);
        this.nMonde = nMonde;
    }

    // To String mit Aufruf der to String des Parents
    @Override
    public String toString() {
        String ausgabeString = super.toString() + ", Anzahl Monde: " + nMonde + ", Satelliten (Hash der Monde): { ";
        // Dies ist die Ausgabe der Hashcodes der Monde des Planeten. Hier werden keine anderen Informationen des Mondes ausgegeben, da dies entwerder zu einer Rekursion führt (Mond gibt seinen Parent aus, dieser wieder den Mond usw.) oder weitere getter notwendig wären.
        for (int i = 0; i<nMonde;i++) {
            ausgabeString = ausgabeString + Monde[i].hashCode() + "; ";
        }
        return ausgabeString + "}";
    }

    // Add Mond Methode um nach dem Erstellen eines Planeten noch Monde hinzufügen zu können, da diese zur Instanziirung einen Parent-Himmelskörper benötigen.
    public void addMond(Satellit mond, int place){
        Monde[place] = mond;
    }
}
