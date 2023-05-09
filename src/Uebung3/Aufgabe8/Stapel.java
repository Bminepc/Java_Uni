package Uebung3.Aufgabe8;

public class Stapel<T> {
    private Element<T> erstesElement;
    public Stapel(){
        erstesElement= new Element<T>();
    }
    public void ablegen(Element<T> e){
        erstesElement.setNachfolger(new Element<>(erstesElement.getDaten(), erstesElement.getNachfolger()));
        erstesElement.setDaten(e.getDaten());
        erstesElement.setNachfolger(e.getNachfolger());
    }

    public T entnehmen(){
        return erstesElement.getDaten();
    }

    public boolean leer(){
        return false;
    }
}
