/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 4, Aufgabe: 11                   */
/* Thema: Farbige Pixel, Swing                    */
/* Datum: 12.06.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class Pix {
    private java.awt.Color Farbe;
    //zwei Attribute für Koordinaten des Pixels
    private int x;
    private int y;

    //Konstruktor
    public Pix(java.awt.Color f, int X, int Y){
        this.Farbe = f;
        this.x = X;
        this.y = Y;
    }
    //getter für alle Attribute der Klasse

    public java.awt.Color getFarbe(){return this.Farbe;}
    public int getX(){return this.x;}
    public int getY(){return this.y;}
}
