package Uebung3.Aufgabe7;


public class Anschrift {
    // Variablen deklarieren
    private String strasse;
    private String ort;
    private int hausnummer;
    private int plz;
    private char zusatz;

    // Konstruktor ohne Adresszusatz
    public Anschrift(String s, int h, int p, String o) throws AnschriftException{
        this.strasse = s;
        this.hausnummer = h;
        // Prüfung, ob die PLZ eine Länge von 5 hat und ob diese größer als Null und somit positiv ist.
        if(String.valueOf(p).length() != 5 || p < 0){
            // Wenn nicht, wird hier unsere eigene Exception geworfen.
            throw new AnschriftException(AnschriftException.FehlerTyp.PLZFEHLER);
        }
        this.plz = p;
        // Überprüfung, ob der eigegebene Ortsname den gegebenen Kriterien entspricht
        if (!o.matches("[a-zA-Z]+")){
            // Wenn nicht, wird hier unsere eigene Exception geworfen.
            throw new AnschriftException(AnschriftException.FehlerTyp.ORTFEHLER);
        }
        this.ort = o;
        this.zusatz = '0';
    }

    public Anschrift(String s, int h, char z, int p, String o) throws AnschriftException {
        this.strasse = s;
        this.hausnummer = h;
        // Überprüfung, ob der Adresszusatz ein Buchstabe ist.
        if(!Character.isAlphabetic(z)){
            // Wenn nicht, wird hier unsere eigene Exception geworfen.
            throw new AnschriftException(AnschriftException.FehlerTyp.ZUSATZFEHLER);
        }
        this.zusatz = z;
        // Prüfung, ob die PLZ eine Länge von 5 hat und ob diese größer als Null und somit positiv ist.
        if(String.valueOf(p).length() != 5 || p < 0){
            // Wenn nicht, wird hier unsere eigene Exception geworfen.
            throw new AnschriftException(AnschriftException.FehlerTyp.PLZFEHLER);
        }
        this.plz = p;
        // Überprüfung, ob der eigegebene Ortsname den gegebenen Kriterien entspricht
        if (!o.matches("[a-zA-Z]+")){
            // Wenn nicht, wird hier unsere eigene Exception geworfen.
            throw new AnschriftException(AnschriftException.FehlerTyp.ORTFEHLER);
        }
        this.ort = o;
    }

    // Einfache To-String Methode mit einer Unterscheidung für den Adresszusatz und einer wie in der Aufgabestellung formatierten Ausgabe
    @Override
    public String toString() {
        if (zusatz == '0') {
            return strasse + " " + hausnummer + "\n" + plz + " " + ort;
        } else {
            return strasse + " " + hausnummer + zusatz + "\n" + plz + " " + ort;
        }
    }
}
