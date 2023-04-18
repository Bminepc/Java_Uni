/****************************************/
/* Matthis Steinhage, Benjamin Wendt */
/* Gruppe: Di10 */
/* Uebungsblatt: 1, Aufgabe: 1 */
/* Thema: Kommandozeilenparameter und Mittelwerte */
/* Datum: 17.04.2023 */
/* Status: lauffaehig - nicht Dokumentiert */

/****************************************/

public class Mittel {

    public static void main(String[] args) {

        // Variablen Deklarieren und Initialisieren
        double aritmetischesMittel;
        double geo;
        double har;
        double sum = 0.0;
        // Dies ist möglich, da die Parameter zur Laufzeit gegeben sind.
        double[] numbers = new double[args.length];

        // Fehlerhafte Eingaben ausschließen
        if (args.length == 0) { // Wenn es keine Argumente gibt
            System.out.println("Wo Zahlen?"); // Gebe eine Fehlermeldung aus
            return; // und beende das Programm
        }


        for (int i = 0; i < args.length; i++) { // Für alle gemachten Eingaben
            //TODO Overkill, weil im Moment angenommen werden kann, dass es nur Zahlen als Eingabe geben kann
            try { // Versuche
                numbers[i] = Double.parseDouble(args[i]); // Die Zahlen als Double zu parsen
            } catch (NumberFormatException e) { // Wenn das nicht klappt (ein Parameter ist kein Double)
                System.out.println("Bitte geben die nur positive Doublewerte ein."); // Gebe eine Fehlermeldung aus
                return; // und beende das Programm
            }
        }

        // Aritmetisches Mittel

        // Alle Zahlen aufsummieren
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // und durch die Anzahl teilen
        aritmetischesMittel = sum / numbers.length;

        //Geometrisches Mittel (Verfahren aus der Aufgabenstelluung übernommen)
        sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum *= numbers[i];
        }
        geo = Math.pow(sum, 1 / numbers.length);

        //Harmonisches Mittel (Verfahren aus der Aufgabenstellung übernommen)
        sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1 / numbers[i];
        }
        har = numbers.length / sum;

        //Ausgaben
        System.out.println("Aritmetisches Mittel:");
        System.out.println(aritmetischesMittel);
        System.out.println("Geometrisches Mittel");
        System.out.println(geo);
        System.out.println("Harmonisches Mittel");
        System.out.println(har);
    }
}
