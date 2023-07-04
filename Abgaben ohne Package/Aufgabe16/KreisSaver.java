/*************************************************************/
/* Mathis Steinhage, Benjamin Wendt                          */
/* Gruppe: Di10                                              */
/* Uebungsblatt: 6, Aufgabe: 16                              */
/* Thema: Kugeln & java.net                                  */
/* Datum: 04.07.2023                                         */
/* Status: lauffaehig                                        */
/*************************************************************/
import java.awt.*;

// Hilfsklasse zum Abspeichern der Kreise mit x und y Koordinaten und der Farbe
public class KreisSaver {
    private double x,y;
    private Color c;

    public KreisSaver(double x, double y, Color c){
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Color getColor(){
        return c;
    }
}
