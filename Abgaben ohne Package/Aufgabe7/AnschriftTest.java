/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 3, Aufgabe: 7                    */
/* Thema: Anschrift | Ausnahmen                   */
/* Datum: 16.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnschriftTest {
    public static void main(String[] args) {
        //Variablen deklarieren und initialisieren
        Scanner sc = new Scanner(System.in);
        int h1, h2, p1, p2;
        char z2;
        String o1, o2, s1, s2;

        // Eingaben in einem Try Catch um inputmissmatch Fehler abzufangen!
        try {
            System.out.println("Erste Anschrift Eingeben: ");
            System.out.println("Strasse");
            s1 = sc.nextLine();
            System.out.println("Hausnummer");
            h1 = sc.nextInt();
            System.out.println("Postleitzahl");
            p1 = sc.nextInt();
            sc.skip("\n");
            System.out.println("Ort");
            o1 = sc.nextLine();

            System.out.println("Zweite Anschrift Eingeben: ");
            System.out.println("Strasse");
            s2 = sc.nextLine();
            System.out.println("Hausnummer");
            h2 = sc.nextInt();
            System.out.println("Adresszusatz");
            z2 = sc.next().toCharArray()[0];
            System.out.println("Postleitzahl");
            p2 = sc.nextInt();
            sc.skip("\n");
            System.out.println("Ort");
            o2 = sc.nextLine();
        } catch (InputMismatchException e) {
            // Es wurde ein fehlerhafter Wert irgendwo in der Eingabe eingegeben.
            System.out.println("Sie haben etwas eingegeben, was vom Typen her nicht passt. Bitte versuchen Sie es erneut.");
            return;
        }
        // Anlegen der Objekte und ausgeben dieser in einem Try-Catch um die von uns implementierte Exception abfangen zu können.
        try {
            Anschrift anschrift2 = new Anschrift(s2, h2, z2, p2, o2);
            Anschrift anschrift1 = new Anschrift(s1, h1, p1, o1);
            System.out.println("Adresse 1: ");
            System.out.println(anschrift1);
            System.out.println("Adresse 2: ");
            System.out.println(anschrift2);
        } catch (AnschriftException e) {
            // Ausgabe des Fehlers
            System.out.println(e);
        }
        // Aufräumen bitte nicht vergessen
        sc.close();
    }
}
