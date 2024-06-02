package miniprojekt.ourList;

/**
 * Custom Liste für meine Übungsgruppe
 * @author Benjamin Wendt
 * @version 1.0
 */

public class Listhead<T> {

    private Listnode<T> start;
    private Listnode<T> end;
    private Listnode<T> current;

    /**
     * Konstruktor mit direkt einem Wert in der Liste
     * @param value Erster Wert der Liste
     */
    public Listhead(T value){
        start = new Listnode<T>(value);
        current = start;
        end = start;
    }

    /**
     * Gibt den Wert der aktuellen Zelle zurück
     * @return Wert der aktuallen Zelle
     */
    public T getCurrent(){
        return current.get();
    }

    /**
     * Nächste Zelle auswählen
     */
    public void advance(){
        current = current.getnext();
    }

    /**
     * Letzte Zelle auswählen
     */
    public void retreat(){
        current = current.getPrevious();
    }

    /**
     * Neuer Wert wird hinzugefügt
     * @param value Neuer Wert für die Liste
     */
    public void add(T value){
        end.setNext(new Listnode<T>(value, end));
        end = end.getnext();
    }
}