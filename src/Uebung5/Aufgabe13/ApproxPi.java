package Uebung5.Aufgabe13;

import java.math.BigDecimal;
import java.math.MathContext;

public class ApproxPi {
    BigDecimal approxPi;

    public ApproxPi() {
        approxPi = new BigDecimal(0, MathContext.DECIMAL128);
    }

    public synchronized void addPart(BigDecimal part) {
        approxPi = approxPi.add(part);
    }

    public void scaleMe(int N){
        approxPi = approxPi.divide(new BigDecimal(N));
    }

    @Override
    public String toString() {
        return approxPi.toPlainString();
    }
}
