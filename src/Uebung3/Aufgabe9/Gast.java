package Uebung3.Aufgabe9;
import java.util.ArrayList;
import java.util.Scanner;
public class Gast {
    private String name;
    private int alter;

    public Gast(String n, int a){
        this.name = n;
        this.alter = a;
    }
    public Gast() {
        this.name = "Max";
        this.alter = 42;
    }
    public int getAlter(){
        return this.alter;
    }
    @Override public String toString(){
        return this.name + " (" + this.alter + ")";
    }
}
