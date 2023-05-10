package Uebung3.Aufgabe8;

public class Stapel<T> {
    private Element<T> erstesElement;
    //Konstruktor für Klasse Stapel
    public Stapel(){ erstesElement = new Element<T>(null, null);}
    public void ablegen(T e){
        //Falls Stack bereits gefüllt
        if(erstesElement != null) {
            Element<T> nachfolger = new Element<T>(erstesElement.getDaten(), erstesElement.getNachfolger());
            erstesElement.setDaten(e);
            erstesElement.setNachfolger(nachfolger);
        //Falls Stack leer
        }else{
            erstesElement = new Element<T>(e, null);
        }
    }

    public T entnehmen() throws Exception{
        T ausgabeDaten = erstesElement.getDaten();
        if (!this.leer()) {
            erstesElement.setDaten(erstesElement.getNachfolger().getDaten());
            erstesElement.setNachfolger(erstesElement.getNachfolger().getNachfolger());
        }
        //Exception bei Aufruf von entnehmen() bei leerem Stack
        else{
            throw new Exception("Der Stack ist leer");
        }
        return ausgabeDaten;
    }
    public boolean leer(){return erstesElement.getDaten() == null;}
}
