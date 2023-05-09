package Uebung3.Aufgabe7;

public class Anschrift {
    private String strasse;
    private String ort;
    private int hausnummer;
    private int plz;
    private char zusatz;


    public Anschrift(String s, int h, int p, String o){
        this.strasse = s;
        this.hausnummer = h;
        this.plz = p;
        this.ort = o;
        this.zusatz = '0';
    }

    public Anschrift(String s, int h, char z, int p, String o){
        this.strasse = s;
        this.hausnummer = h;
        this.zusatz = z;
        this.plz = p;
        this.ort = o;
    }

    @Override public String toString(){
        return "Strasse: ";
    }
}
