/********************************************/
/* Matthis Steinhage, Benjamin Wendt        */
/* Gruppe: Di10                             */
/* Uebungsblatt: 1, Aufgabe: 4              */
/* Thema: Wissenswertes über Zahlen, switch */
/* Datum: 17.04.2023                        */
/* Status: lauffaehig - nicht Dokumentiert  */
/********************************************/

import java.util.Scanner;

public class numberKnowledge {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {


            System.out.println("Über welche Zahl wollen Sie etwas wissen?");
            int Zahl = sc.nextInt();
            switch (Zahl) {
                case 1:
                    System.out.println("Die Zahl 1 ist Teiler jeder natürlichen Zahl.");
                    break;
                case 2:
                    System.out.println("Die Zahl 2 ist die kleinste Primzahl.");
                    break;
                case 3:
                    System.out.println("Drei ist die kleinste ungerade Primzahl.");
                    break;
                case 4:
                    System.out.println("Die Zahl 4 ist eine Quadratzahl.");
                    break;
                case 5:
                    System.out.println("Die 5 ist die Summe aller Primzahlen die kleiner sind als 5.");
                    break;
                case 6:
                    System.out.println("Ein Würfel hat 6 Flächen.");
                    break;
                case 7:
                    System.out.println("Die Zahl 7 gilt als Glückszahl.");
                    break;
                default:
                    System.out.println("Über die Zahl " + Zahl + " weiß ich nichts");
            }
        System.out.println("Möchten Sie noch Infos über eine weitere Zahl erhalten, dann schreiben Sie <true>, ansonsten schreiben Sie <false>.");
        }while (sc.nextBoolean());

    }
}
