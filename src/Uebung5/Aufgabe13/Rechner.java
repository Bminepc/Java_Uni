package Uebung5.Aufgabe13;

import java.math.BigDecimal;

public class Rechner {

    private BigDecimal result;
    public BigDecimal berechneTeil(int stelle, int n){
        double d = 4/(((double)stelle/(double) n)*((double)stelle/(double) n)+1);
        result = new BigDecimal(d);
        return result;
    }
}
