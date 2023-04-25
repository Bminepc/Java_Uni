/**************************************************/
/* Matthis Steinhage, Benjamin Wendt              */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 1, Aufgabe: 1                    */
/* Thema: Kommandozeilenparameter und Mittelwerte */
/* Datum: 17.04.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

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
            numbers[i] = Double.parseDouble(args[i]); // Parse die Zahlen als Double
            if (numbers[i] < 0) { // Und prüfe, ob sie positiv sind. Falls nicht
                System.out.println("Bitte geben die nur positive Doublewerte ein."); // Gebe eine Fehlermeldung aus
                return;
                // Hinweis: Diese Überprüfung prüft nicht, ob die Eingaben Double sind, sondern nur, ob die Werte positiv sind.
                // Hier könnte mit einem Try Catch um das Parsestatement das ganze abgefangen werden.
            }
        }

        // Aritmetisches Mittel

        // Alle Zahlen aufsummieren
        for (double number : numbers) {
            sum += number;
        }
        // und durch die Anzahl teilen
        aritmetischesMittel = sum / numbers.length;

        //Geometrisches Mittel (Verfahren aus der Aufgabenstelluung übernommen)
        sum = 0.0;
        for (double number : numbers) {
            sum *= number;
        }
        //FIX 1.0 um keine Integerdivision zu haben
        geo = Math.pow(sum, 1.0 / numbers.length);

        //Harmonisches Mittel (Verfahren aus der Aufgabenstellung übernommen)
        sum = 0.0;
        for (double number : numbers) {
            sum += 1 / number;
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
