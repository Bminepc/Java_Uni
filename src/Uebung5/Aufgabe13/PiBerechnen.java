package Uebung5.Aufgabe13;

import java.math.BigDecimal;

public class PiBerechnen {

    private static int N = 1000;
    // Result with N = 10000000
    // 3.141592653589791571707934281221241690218448638916015625

    public static void main(String[] args) {
        ApproxPi approxPi = new ApproxPi();
        Rechner[] calc = new Rechner[N - 1];
        for (int i = 0; i < calc.length; i++) {
            calc[i] = new Rechner(i + 1, N, approxPi);
            calc[i].start();
        }
        for (int i = 0; i < calc.length; i++) {
            try {
                calc[i].join();
            } catch (InterruptedException e) {
                System.out.println("Something went wrong. Please try again");
            }
        }
        approxPi.addPart(new BigDecimal(2)); //Wert für f(0) = 2 (Berechnung für statischen Wert per Hand)
        approxPi.addPart(new BigDecimal(1)); //Wert für f(1) = 1 (Berechnung für statischen Wert per Hand)
        approxPi.scaleMe(N);

        System.out.println("Ausgabe:");
        System.out.println(approxPi);


    }
}
