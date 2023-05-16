package Uebung3.Aufgabe7;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

// TODO Hier fehlen die Abfragen für "Eingabefehler"
public class AnschriftTest {
    public static void main(String[] args) {
        // Eingaben in einem Try Catch um typemissmatch Fehler abzufangen!
        Scanner sc = new Scanner(System.in);
        int h1 = 0, h2 = 0, p1 = 0, p2 = 0;
        char z2 = ' ';
        String o1 = "", o2 = "", s1 = "", s2 = "";

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
            // TODO Das hier ist extrem unschön! Bitte einmal nachsehen, wie man es richtig macht!
            System.out.println("Adresszusatz");
            z2 = sc.next().toCharArray()[0];
            System.out.println("Postleitzahl");
            p2 = sc.nextInt();
            sc.skip("\n");
            System.out.println("Ort");
            o2 = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Sie haben etwas eingegeben, was vom Typen her nicht passt. Bitte versuchen Sie es erneut.");
            return;
        }
        try {
            Anschrift anschrift2 = new Anschrift(s2, h2, z2, p2, o2);
            Anschrift anschrift1 = new Anschrift(s1, h1, p1, o1);
            System.out.println("Adresse 1: ");
            System.out.println(anschrift1);
            System.out.println("Adresse 2: ");
            System.out.println(anschrift2);
        }catch (AnschriftException e){
            System.out.println(e);
        }
        sc.close();
    }
}
