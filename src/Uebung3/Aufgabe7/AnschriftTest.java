package Uebung3.Aufgabe7;

import java.util.Scanner;

public class AnschriftTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Erste Anschrift Eingeben: ");
        System.out.println("Strasse");
        String s = sc.nextLine();
        System.out.println("Hausnummer");
        int h = sc.nextInt();
        System.out.println("Postleitzahl");
        int p = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ort");
        String o = sc.nextLine();

        Anschrift anschrift1 = new Anschrift(s, h, p, o);
        System.out.println("Zweite Anschrift Eingeben: ");
        System.out.println("Strasse");
        s = sc.nextLine();
        System.out.println("Hausnummer");
        h = sc.nextInt();
        // TODO Das hier ist extrem unschön! Bitte einmal nachsehen, wie man es richtig macht!
        System.out.println("Adresszusatz");
        char z = sc.next().toCharArray()[0];
        System.out.println("Postleitzahl");
        p = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ort");
        o = sc.nextLine();

        Anschrift anschrift2 = new Anschrift(s,h,z,p,o);
        System.out.println("Adresse 1: ");
        System.out.println(anschrift1);
        System.out.println("Adresse 2: ");
        System.out.println(anschrift2);
    }
}
