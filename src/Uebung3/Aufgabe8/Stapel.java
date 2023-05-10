package Uebung3.Aufgabe8;

public class Stapel<T> {
    private Element<T> erstesElement;
    public Stapel(){
        erstesElement = new Element<T>(null, null);

    }
    public void ablegen(T e){
        if(erstesElement != null) {
            Element<T> nachfolger = new Element<T>(erstesElement.getDaten(), erstesElement.getNachfolger());
            erstesElement.setDaten(e);
            erstesElement.setNachfolger(nachfolger);
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
        else{
            throw new Exception("Der Stack ist leer");
        }
        return ausgabeDaten;
    }
    public boolean leer(){return erstesElement.getDaten() == null;}
}
