package Uebung3.Aufgabe8;

public class Stapel<T> {
    private Element<T> erstesElement;
    public Stapel(){
        erstesElement= null;
    }
    public void ablegen(T e){
        Element<T> temp = erstesElement;
        erstesElement.setDaten(e);
        erstesElement.setNachfolger(temp);
    }

    public T entnehmen() {
        T ausgabeDaten = erstesElement.getDaten();
        if (!this.leer()) {
            erstesElement.setDaten(erstesElement.getNachfolger().getDaten());
            erstesElement.setNachfolger(erstesElement.getNachfolger().getNachfolger());
            return ausgabeDaten;
        }
        else{
            System.out.println("Der Stack ist leer");
            return null;
        }
    }
    public boolean leer(){
        return erstesElement == null;
    }
}
