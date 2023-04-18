public class Mittel {

    public static void main(String[] args) {

        // Variablen Deklarieren und Initialisieren
        double aritmetischesMittel = 0.0;
        double geo = 0.0;
        double har = 0.0;
        double sum = 0.0;
        double[] numbers = new double[args.length];

        // Fehlerhafte Eingaben ausschließen
        if (args.length == 0) {
            System.out.println("Wo Zahlen?");
            return;
        }


        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben die nur positive Doublewerte ein.");
                return;
            }
        }

        // Aritmetisches Mittel
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        aritmetischesMittel = sum / numbers.length;

        //Geo?
        sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum *= numbers[i];
        }
        geo = Math.pow(sum, 1 / numbers.length);

        //Har?
        sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1 / numbers[i];
        }
        har = numbers.length / sum;

        //Ausgaben
        System.out.println("Aritmetisches Mittel:");
        System.out.println(aritmetischesMittel);
        System.out.println("Geo?");
        System.out.println(geo);
        System.out.println("Har?");
        System.out.println(har);
    }
}
