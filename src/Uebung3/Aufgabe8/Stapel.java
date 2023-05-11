package Uebung3.Aufgabe8;

public class Stapel<T> {
    private Element<T> erstesElement;
    //Standardkonstruktor für Klasse Stapel
    public Stapel(){ erstesElement = new Element<T>(null, null);}
    public void ablegen(T e){
        //Falls Stack bereits gefüllt
        if(erstesElement != null) {
            //erstelle Nachfolgeelement, aktualisiere Daten von erstesElement und Nachfolgeelement
            Element<T> nachfolger = new Element<T>(erstesElement.getDaten(), erstesElement.getNachfolger());
            erstesElement.setDaten(e);
            erstesElement.setNachfolger(nachfolger);
        //Falls Stack leer
        }else{
            //aktualisiere erstesElement mit neuen Daten
            erstesElement = new Element<T>(e, null);
        }
    }

    public T entnehmen() throws Exception{
        //speichere Daten von erstesElement
        T ausgabeDaten = erstesElement.getDaten();
        if (!this.leer()) {
            //aktualisiere Daten von erstesElement mit Nachfolgeelement
            erstesElement.setDaten(erstesElement.getNachfolger().getDaten());
            erstesElement.setNachfolger(erstesElement.getNachfolger().getNachfolger());
        }
        //Exception bei Aufruf von entnehmen() bei leerem Stack
        else{
            throw new Exception("Der Stack ist leer");
        }
        //gebe gespeicherte Daten aus
        return ausgabeDaten;
    }
    //Methode gibt zurück, ob der Stack leer ist
    public boolean leer(){return erstesElement.getDaten() == null;}
}
