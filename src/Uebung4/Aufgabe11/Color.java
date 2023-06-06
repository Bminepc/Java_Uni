package Uebung4.Aufgabe11;

public class Color {
    private java.awt.Color Farbe;
    private int x;
    private int y;

    public Color(java.awt.Color f, int a, int b){
        this.Farbe = f;
        this.x = a;
        this.y = b;
    }

    public java.awt.Color getFarbe(){return this.Farbe;}
    public int getX(){return this.x;}
    public int getY(){return this.y;}
}
