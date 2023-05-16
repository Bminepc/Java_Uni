/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 3, Aufgabe: 9                    */
/* Thema: Kindergeburtstag, Collections & Lambda  */
/* Datum: 16.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gast> gaesteliste = new ArrayList<>();
        int a;
        System.out.print("Wie lang ist die Liste? ");
        a = sc.nextInt();
        //Eingabe der Gäste
        for (int i = 0; i < a; i++) {
            System.out.print("Alter: ");
            int alter = sc.nextInt();
            System.out.print("Name: ");
            String n = sc.next();
            gaesteliste.add(new Gast(n, alter));
        }
        //Entfernen der unültigen Gäste aus gaesteliste
        gaesteliste.removeIf(x -> (x.getAlter() > 12));
        //Ausgabe der gültigen Gäste
        gaesteliste.forEach(x -> {
            System.out.println(x);
        });
    }
}
