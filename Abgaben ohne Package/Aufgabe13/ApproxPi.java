/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 5, Aufgabe: 13                   */
/* Thema: Parallele Berechnung von Pi mit Threads */
/* Datum: 23.06.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

import java.math.BigDecimal;
import java.math.MathContext;

public class ApproxPi {
    private BigDecimal approxPi;

    public ApproxPi() {
        approxPi = new BigDecimal(0, MathContext.DECIMAL128); // Konstruktor mit Initialisierung der Pi-Variable
    }

    public synchronized void addPart(BigDecimal part) {
        approxPi = approxPi.add(part); // Hinzufügen eines neuen Teils aus einem neuen Thread
    }

    public void scaleMe(int N){
        approxPi = approxPi.divide(new BigDecimal(N)); // Skalierung aus der Aufgabenstellung
    }

    @Override
    public String toString() {
        return approxPi.toPlainString(); // Ausgabemöglichkeit
    }
}
