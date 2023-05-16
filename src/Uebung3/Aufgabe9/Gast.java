package Uebung3.Aufgabe9;
import java.util.ArrayList;
import java.util.Scanner;
public class Gast {
    private String name;
    private int alter;

    //Konstruktor für Klasse Gast
    public Gast(String n, int a){
        this.name = n;
        this.alter = a;
    }
    //Standardkonstruktor für Klasse Gast
    public Gast() {
        this.name = "Max";
        this.alter = 42;
    }
    //Getter für Attribut alter
    public int getAlter(){
        return this.alter;
    }
    //Überschriebene toString() Methode
    @Override public String toString(){
        return this.name + " (" + this.alter + ")";
    }
}
