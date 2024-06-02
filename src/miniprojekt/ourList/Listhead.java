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
    private int length = 0;
    private int currentNumber = 0;

    /**
     * Konstruktor mit direkt einem Wert in der Liste
     * @param value Erster Wert der Liste
     */
    public Listhead(T value){
        start = new Listnode<T>(value);
        current = start;
        end = start;
        length = 1;
        currentNumber = 1;
    }

    /**
     * Gibt den Wert der aktuellen Zelle zurück
     * @return Wert der aktuallen Zelle
     */
    public T getCurrent(){
        return current.get();
    }

    /**
     * Getter für die Länge
     * @return Länge der Liste
     */
    public int length(){
        return length;
    }

    /**
     * Nächste Zelle auswählen
     * @throws Exception Out Of Bounds
     */
    public void advance() throws Exception {
        if(currentNumber<length){
            current = current.getnext();
            currentNumber++;
        }else {
            throw new Exception("Du bist am Ende der Liste.");
        }
    }

    /**
     * Letzte Zelle auswählen
     * @throws Exception Out Of Bounds
     */
    public void retreat() throws Exception {
        if(currentNumber>1) {
            current = current.getPrevious();
            currentNumber--;
        }else {
            throw new Exception("Du bist am Anfang der Liste.");
        }
    }

    /**
     * Neuer Wert wird hinzugefügt
     * @param value Neuer Wert für die Liste
     */
    public void add(T value){
        end.setNext(new Listnode<T>(value, end));
        end = end.getnext();
        length++;
    }

    /**
     * Gibt den Wert an der gewünschten Stelle zurück
     * @param pos Gewünschte Stelle
     * @return Wert an der gewünschten Stelle
     * @throws Exception Out Of Bounds
     */
    public T getSpecific(int pos) throws Exception {
        if(pos < length && pos >= 0) {
            Listnode<T> temp = start;
            for (int i = 0; i < pos; i++) {
                temp = temp.getnext();
            }
            return temp.get();
        }else {
            throw new Exception("Diese Stelle git es nicht in der Liste");
        }
    }
}