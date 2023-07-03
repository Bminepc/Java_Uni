package Uebung6.Aufgabe17.Assets;

import java.awt.*;

public class Kreissaver {
    private double x,y;
    private Color c;

    public Kreissaver(double x, double y, Color c){
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
