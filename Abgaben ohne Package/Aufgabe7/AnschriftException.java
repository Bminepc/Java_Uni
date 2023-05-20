/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 3, Aufgabe: 7                    */
/* Thema: Anschrift | Ausnahmen                   */
/* Datum: 16.05.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

public class AnschriftException extends Exception {
    // Enum für die Fehlertypen
    public enum FehlerTyp {
        ORTFEHLER,
        PLZFEHLER,
        ZUSATZFEHLER,
        UNDEFINED
    }

    private FehlerTyp error;

    // Konstruktor ohne Parameter
    public AnschriftException() {
        error = FehlerTyp.UNDEFINED;
    }

    // Konstruktor mit Parameter Fehlertyp
    public AnschriftException(FehlerTyp Error) {
        error = Error;
    }

    // Ungenutzt, aber üblicherweise sollte diese Methode enthalten sein.
    public FehlerTyp getExceptionCode() {
        return error;
    }

    // Einfache toString mit einem Switch-Case um zwischen den Fehlertypen zu unterscheiden und passende Ausgaben zu generieren.
    @Override
    public String toString() {
        switch (error) {
            case ORTFEHLER -> {
                return "Beim einlesen den Ortes wurde ein Fehler gefunden.";
            }
            case PLZFEHLER -> {
                return "Bei einlesen der Postleitzahl wurde ein Fehler gefunden.";
            }
            case UNDEFINED -> {
                return "Es ist ein nicht definierter Fehler aufgetreten.";
            }
            case ZUSATZFEHLER -> {
                return "Bei einlesen des Adresszusatzes ist ein Fehler aufgetreten.";
            }
            default -> {
                return "Unexpected Error. Please contact your admin.";
            }
        }
    }
}
