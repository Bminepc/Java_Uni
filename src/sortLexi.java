/****************************************/
/* Matthis Steinhage, Benjamin Wendt */
/* Gruppe: Di10 */
/* Uebungsblatt: 1, Aufgabe: 3 */
/* Thema: Wissenswertes über Zahlen, switch */
/* Datum: 17.04.2023 */
/* Status: Zeichenketten, Sortieren */
/****************************************/

import java.util.Scanner;

public class sortLexi {

    //Scanner deklarieren und initialisieren
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Einlesen der Anzahl der zu verarbeitenden Strings
        System.out.println("Geben Sie eine Anzahl an Strings an");
        int anzahl = sc.nextInt();
        // Erstellen des Stringarrays mit der eingelesenen Größe
        String[] strings = new String[anzahl];

        // Einlesen von <anzahl> Strings in das neu definierte Array
        System.out.println("Geben Sie " + anzahl + " Strings ein.");
        sc.skip("\n");
        for (int i = 0; i < anzahl; i++) {
            strings[i] = sc.nextLine();
        }

        //Selectionsort
        int cur_min;
        for (int i = 0; i < anzahl; i++) {
            cur_min = i;
            for (int j = i + 1; j < anzahl; j++) {
                if (strings[j].compareToIgnoreCase(strings[cur_min]) < 0) {
                    cur_min = j;
                }
            }
            String temp = strings[i];
            strings[i] = strings[cur_min];
            strings[cur_min] = temp;
        }

        System.out.println("Hier Ihre Strings in sortierter Reihenfolge:");
        for (int i = 0; i < anzahl; i++) {
            System.out.println(strings[i]);
        }
    }
}
