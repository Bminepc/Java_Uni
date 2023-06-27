/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 5                    */
/* Thema: Klassenimplementation                   */
/* Datum: 04.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/
public class WinkelTest {
    public static void main(String[] args){
        System.out.println("Test für Winkel(int g, int m, double s)");
        Winkel Testobjekt1 = new Winkel(50, 46, 30);
        System.out.println(Testobjekt1.toString());

        System.out.println("Test für Winkel(int g, int m)");
        Winkel Testobjekt2 = new Winkel(30, 27);
        System.out.println(Testobjekt2.toString());

        System.out.println("Test für Winkel(int g)");
        Winkel Testobjekt3 = new Winkel(89);
        System.out.println(Testobjekt3.toString());

        System.out.println("Test für Winkel()");
        Winkel Testobjekt4 = new Winkel();
        System.out.println(Testobjekt4.toString());

        System.out.println("Test für Winkel(String str)");
        Winkel Testobjekt5 = new Winkel("68°14'42.56\"");
        System.out.println(Testobjekt5.toString());

        System.out.println("Test für setze()");
        Testobjekt3.setze(45, 2, 14.7);
        System.out.println(Testobjekt3.toString());

        System.out.println("Test für alsDouble()");
        System.out.println(Testobjekt3.alsDouble());

        System.out.println("Test für imBogenmass()");
        System.out.println(Testobjekt3.imBogenmass());

        System.out.println("Test für plus()");
        Testobjekt3.plus(Testobjekt1);
        System.out.println(Testobjekt3);

        System.out.println("Test für clone()");
        Winkel WinkelKlon = Testobjekt5.clone();
        System.out.println(WinkelKlon.toString());

        System.out.println("Test für equals(Object obj)");
        if(WinkelKlon.equals(Testobjekt5)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(WinkelKlon.equals(Testobjekt4)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println("Test für normalisiere()");
        Testobjekt1.setze(679, 83, 931.7);
        Testobjekt1.normalisiere();
        System.out.println(Testobjekt1);

    }
}
