package Uebung6.Aufgabe16;

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
