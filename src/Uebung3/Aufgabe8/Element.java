package Uebung3.Aufgabe8;

public class Element<T> {
    private T daten;
    private Element<T> nachfolger;

    public Element(T d, Element<T> n){
        this.daten = d;
        this.nachfolger = n;
    }
    public Element(){
        this.daten = null;
        this.nachfolger = null;
    }
    public T getDaten(){
        return this.daten;
    }
    public void setDaten(T d){
        this.daten = d;
    }
    public Element<T> getNachfolger(){
        return this.nachfolger;
    }
    public void setNachfolger(Element<T> n){
        this.nachfolger = n;
    }
}
