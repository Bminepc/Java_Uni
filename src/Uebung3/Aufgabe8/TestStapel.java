package Uebung3.Aufgabe8;
/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 3, Aufgabe: 8                    */
/* Thema: Klasse für Stapel | Generics            */
/* Datum: 16.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class TestStapel {
    public static void main(String[] args) {
        System.out.println("Test für Datentyp int:");
        Stapel<Integer> IntStack = new Stapel<>();
        //Testen von Methode leer()
        System.out.println(IntStack.leer());
        //Testen von Methode ablegen()
        IntStack.ablegen(5);
        IntStack.ablegen(19);
        //Testen von Methode entnehmen()
        try {
            System.out.println(IntStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        try {
            System.out.println(IntStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        //Testen der Exception bei Aufruf von entnehmen() bei leerem Stack
        try {
            System.out.println(IntStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        System.out.println("-----------------------");
        System.out.println("Test für Datentyp char:");
        Stapel<Character> CharStack = new Stapel<>();
        //Testen von Methode leer()
        System.out.println(CharStack.leer());
        //Testen von Methode ablegen()
        CharStack.ablegen('x');
        CharStack.ablegen('?');
        //Testen von Methode entnehmen()
        try {
            System.out.println(CharStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        try {
            System.out.println(CharStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        //Testen der Exception bei Aufruf von Methode entnehmen() bei leeren Stack
        try {
            System.out.println(CharStack.entnehmen());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
    }
}
