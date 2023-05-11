package Uebung3.Aufgabe8;

public class Element<T> {
    private T daten;
    private Element<T> nachfolger;
    //Konstruktor für Klasse Element
    public Element(T d, Element<T> n){
        this.daten = d;
        this.nachfolger = n;
    }
    //Standardkonstruktor für Klasse Element
    public Element(){
        this.daten = null;
        this.nachfolger = null;
    }
    //Methode zur Rückgabe von Attribut daten
    public T getDaten(){return this.daten;}
    //Methode zum Ändern des Attributs daten
    public void setDaten(T d){this.daten = d;}
    //Methode zur Rückgabe von Attribut nachfolger
    public Element<T> getNachfolger(){
        return this.nachfolger;
    }
    //Methode zum Ändern des Attributs nachfolger
    public void setNachfolger(Element<T> n){
        this.nachfolger = n;
    }
}
