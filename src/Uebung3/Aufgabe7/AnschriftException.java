package Uebung3.Aufgabe7;

public class AnschriftException extends Exception{
    public enum FehlerTyp{
        ORTFEHLER,
        PLZFEHLER,
        ZUSATZFEHLER,
        UNDEFINED;
    }

    private FehlerTyp error;

    public AnschriftException(){
        error = FehlerTyp.UNDEFINED;
    }

    public AnschriftException(FehlerTyp Error) {
        error = Error;
    }

    public FehlerTyp getExceptioinCode(){
        return error;
    }

    @Override
    public String toString(){
        switch (error){
            case ORTFEHLER : {
                return "Beim einlesen den Ortes wurde ein Fehler gefunden.";
            }
            case PLZFEHLER : {
                return "Bei einlesen der Postleitzahl wurde ein Fehler gefunden.";
            }
            case UNDEFINED :{
                return "Es ist ein nicht definierter Fehler aufgetreten.";
            }
            case ZUSATZFEHLER : {
                return "Bei einlesen des Adresszusatzes ist ein Fehler aufgetreten.";
            }
            default: {
                return "Unexpected Error. Please contact your admin.";
            }
        }
    }
}
