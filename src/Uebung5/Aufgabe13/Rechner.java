package Uebung5.Aufgabe13;

import java.math.BigDecimal;

public class Rechner extends Thread {
    private int stelle;
    int n;
    private ApproxPi approxPi;
    private BigDecimal result;

    public Rechner(int stelle, int n, ApproxPi approxPi) {
        this.n = n;
        this.stelle = stelle;
        this.approxPi = approxPi;
    }

    public void berechneTeil() {
        double d = 4 / (((double) stelle / (double) n) * ((double) stelle / (double) n) + 1);
        result = new BigDecimal(d);
        approxPi.addPart(result);
        System.out.println((double) stelle / (double) n);
    }

    @Override
    public void run() {
        super.run();
        berechneTeil();
    }
}

