package Uebung4.Aufgabe11;

public class Pix {
    private java.awt.Color Farbe;
    private int x;
    private int y;

    public Pix(java.awt.Color f, int X, int Y){
        this.Farbe = f;
        this.x = X;
        this.y = Y;
    }

    public java.awt.Color getFarbe(){return this.Farbe;}
    public int getX(){return this.x;}
    public int getY(){return this.y;}
}
