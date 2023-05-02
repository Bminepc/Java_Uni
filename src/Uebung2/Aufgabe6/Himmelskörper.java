package Uebung2.Aufgabe6;

public abstract class Himmelskörper {
    private String name;
    private double durchmesser;
    private double alter;

    public Himmelskörper(String name, double durchmesser, double alter){
        this.alter = alter;
        this.name = name;
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Durchmesser: " + durchmesser + ", Alter: " + alter;
    }
}
