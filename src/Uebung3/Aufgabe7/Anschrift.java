package Uebung3.Aufgabe7;


public class Anschrift {
    private String strasse;
    private String ort;
    private int hausnummer;
    private int plz;
    private char zusatz;


    public Anschrift(String s, int h, int p, String o) throws AnschriftException{
        this.strasse = s;
        this.hausnummer = h;
        if(String.valueOf(p).length() != 5 || p < 0){
            throw new AnschriftException(AnschriftException.FehlerTyp.PLZFEHLER);
        }
        this.plz = p;
        if (!o.matches("[a-zA-Z]+")){
            throw new AnschriftException(AnschriftException.FehlerTyp.ORTFEHLER);
        }
        this.ort = o;
        this.zusatz = '0';
    }

    public Anschrift(String s, int h, char z, int p, String o) throws AnschriftException {
        this.strasse = s;
        this.hausnummer = h;
        if(!Character.isAlphabetic(z)){
            throw new AnschriftException(AnschriftException.FehlerTyp.ZUSATZFEHLER);
        }
        this.zusatz = z;
        if(String.valueOf(p).length() != 5 || p < 0){
            throw new AnschriftException(AnschriftException.FehlerTyp.PLZFEHLER);
        }
        this.plz = p;
        if (!o.matches("[a-zA-Z]+")){
            throw new AnschriftException(AnschriftException.FehlerTyp.ORTFEHLER);
        }
        this.ort = o;
    }

    @Override
    public String toString() {
        if (zusatz == '0') {
            return strasse + " " + hausnummer + "\n" + plz + " " + ort;
        } else {
            return strasse + " " + hausnummer + zusatz + "\n" + plz + " " + ort;
        }
    }
}
