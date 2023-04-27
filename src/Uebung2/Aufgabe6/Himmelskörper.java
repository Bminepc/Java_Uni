package Uebung2.Aufgabe6;

public abstract class Himmelskörper {
    private String name;
    private double durchmesser;
    private double alter;


    public String toString(){
        return "Name: " + name + ", Durchmesser: " + durchmesser + ", Alter: " + alter;
    }
}
