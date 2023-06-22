package Uebung5.Aufgabe13;

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
