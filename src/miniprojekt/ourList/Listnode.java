package miniprojekt.ourList;
/**
 * Custom Listnode für meine Übungsgruppe
 * @author Benjamin Wendt
 * @version 1.0
 */
public class Listnode<T> {

    private T value;
    private Listnode next;
    private Listnode previous;

    /**
     * Konstruktor für die erste Zelle der Liste
     * @param value Wert der Zelle
     */
    public Listnode(T value) {
        this.value = value;
    }

    /**
     * Konstruktor für alle weiteren Zellen der Liste
     * @param value Wert der Zelle
     * @param previous Vorherige Zelle
     */
    public Listnode(T value, Listnode previous){
        this.previous = previous;
        this.value = value;
    }

    /**
     * Getter für den Wert der Zelle
     * @return Wert der Zelle
     */
    public T get(){
        return value;
    }

    /**
     * Getter für die nächste Zelle
     * @return Nächste Zelle
     */
    public Listnode getnext(){
        return next;
    }

    /**
     * Getter für die vorherige Zelle
     * @return Vorherige Zelle
     */
    public Listnode getPrevious(){
        return previous;
    }

    /**
     * Setter für die nächste Zelle
     * @param next Nächste Zelle
     */
    public void setNext(Listnode next){
        this.next = next;
    }
}