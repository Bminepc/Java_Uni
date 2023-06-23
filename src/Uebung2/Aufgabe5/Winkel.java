/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 2, Aufgabe: 5                    */
/* Thema: Klassenimplementation                   */
/* Datum: 04.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/
import java.util.Scanner;

/**
 * Klasse Winkel
 * @author Benjamin Wendt, Mathis Steinhage
 * @version 26.04.2023
 */
public class Winkel implements Cloneable {
    private int grad = 0;
    private int minuten = 0;
    private double sekunden = 0;

    /**
     * Konstruktor für Klasse Winkel
     * @param g der zu übergebende Wert für grad
     * @param m der zu übergebende Wert für minuten
     * @param s der zu übergebende Wert für sekunden
     */
    Winkel(int g, int m, double s){
        this.setze(g, m, s);
        this.normalisiere();
    }

    /**
     * Konstruktor für Klasse Winkel ohne Initialisierung von sekunden
     * @param g der zu übergebende Wert für grad
     * @param m der zu übergebende Wert für minuten
     */
    Winkel(int g, int m){
        this.setze(g, m, 0);
        this.normalisiere();
    }

    /**
     * Konstruktor für Klasse Winkel mit ausschliesslicher Initialisierung von grad
     * @param g der zu übergebende Wert für grad
     */
    Winkel(int g){
        this.setze(g, 0, 0);
        this.normalisiere();
    }

    /**
     * Standardkonstruktor für Klasse Winkel
     */
    Winkel(){}

    /**
     * liest neue Attributwerte aus einem String aus
     * @param str der eingelesene String mit Delimiter \
     */
    Winkel(String str){
        Scanner strsc = new Scanner(str);
        strsc.useDelimiter("[°'\"]");

        this.grad = Integer.parseInt(strsc.next());
        this.minuten = Integer.parseInt(strsc.next());
        this.sekunden = Double.parseDouble(strsc.next());

        strsc.close();
    }

    /**
     * Überschreiben der Attributwerte mt eingegebenen Parametern
     * @param g der eingegebene Wert für grad
     * @param m der eingegebene Wert für minuten
     * @param s der eingegebene Wert für sekunden
     */
    void setze(int g, int m, double s){
        this.grad = g;
        this.minuten = m;
        this.sekunden = s;
    }

    /**
     * Funktion, welche den Wert von grad als Double zurückgibt
     * @return gibt den nach double gecasteten Wert von grad zurück
     */
    double alsDouble(){
        return (double) grad;
    }

    /**
     * Funktion, welche den umgerechneten Wert von Grad im Bogenmaß zurückgibt
     * @return umgerechneter Wert von grad im Bogenmaß
     */
    double imBogenmass(){
        return 2 * Math.PI * this.grad;
    }

    /**
     * Funktion, welche zwei Winkel addiert und den grad-Wert von this mit dem Ergebnis überschreibt
     * @param a das Objekt der KLasse Winkel, dessen grad addiert werden soll
     * @return gibt dasselbe Objekt mit aktualisiertem grad-Wert zurück
     */
    Winkel plus(Winkel a){
        this.grad = this.grad + a.grad - 180;
        return this;
    }

    /**
     * Überschriebene Version von Standardmethode toString()
     * @return gibt Attributwerte des Objekts als String zurück
     */
    @Override public String toString(){
        return "Grad = " + this.grad + " , Minuten = " + this.minuten + " , Sekunden = " + this.sekunden;
    }

    /**
     * Überschriebene Version der Standardmethode equals()
     * @param obj das zu vergleichende Objekt
     * @return gibt den entsprechenden Boolean zur Gleichheit zurück
     */
    @Override public boolean equals(Object obj){
        if(obj == null || obj.getClass() != getClass())
            return false;
        return (this.grad == ((Winkel)obj).grad && this.minuten == ((Winkel)obj).minuten && this.sekunden == ((Winkel)obj).sekunden);
    }

    /**
     * Überschriebene Version der Standardmethode clone()
     * @return gibt ein identisches neues Objekt der Klasse Winkel zurück
     */
    @Override public Winkel clone(){
        return new Winkel(this.grad, this.minuten, this.sekunden);
    }

    /**
     * Normalisieren von ungültigen Attributwerten
     */
    void normalisiere(){
        int temp;
        //Normalisieren des Gradwertes
        if (this.grad >= 360){
            this.grad = this.grad % 360;
        }
        if (this.grad < 0){
            this.grad = (360 + this.grad) % 360;
        }
        //Normalisieren der Sekundenanzahl
        if(this.sekunden >= 60){
            temp = (int) this.sekunden / 60;
            this.sekunden = this.sekunden % 60;
            this.minuten += temp;
        }
        if (this.sekunden < 0){
            temp = (int) this.sekunden / (-60);
            this.sekunden = 60 + this.sekunden % 60;
            this.minuten -= temp;
        }
        //Normalisieren der Minutenanzahl
        if(this.minuten >= 60){
            this.minuten = this.minuten % 60;
        }
        if (this.minuten < 0){
            this.minuten = 0;
        }
    }
}
