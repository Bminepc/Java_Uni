package Uebung1;
/********************************************/
/* Mathis Steinhage, Benjamin Wendt         */
/* Gruppe: Di10                             */
/* Uebungsblatt: 1, Aufgabe: 2              */
/* Thema: Wissenswertes über Zahlen, switch */
/* Datum: 17.04.2023                        */
/* Status: Zeichenketten, Sortieren         */
/********************************************/

import java.util.Scanner;

public class Eisverkauf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialisierung der Variablen für Kugelanzahl und Eissorte
        int anzahl;
        String auswahl;

        //Eingabe der Kugelanzahl
        System.out.println("Wie viele Eiskugeln wünschen sie?");
        anzahl = sc.nextInt();
        //Überprüfen von anzahl
        if (anzahl > 5) {
            //Ausgabe für ungültige Kugelanzahl
            System.out.println("Es passen maximal 5 Eiskugeln in eine Waffel.");
        }else{
            //Eingabe der Eissorte
            System.out.println("Welche Sorte wünschen sie?");
            auswahl = sc.next();
            //Überprüfen der Eissorte
            if(auswahl.equals("Schokolade")){
                //Ausgabe für ungültige Eissorte
                System.out.println("Schokoladeneis ist leider ausverkauft.");
            }else{
                //Endgültige Ausgabe mit Kugelanzahl und Eissorte
                System.out.println("Hier sind " + anzahl + " Kugeln  der Sorte " + auswahl + " in einer Waffel.");

            }
        }
    }
}
