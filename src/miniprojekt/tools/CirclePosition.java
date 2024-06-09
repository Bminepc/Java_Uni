package miniprojekt.tools;

import java.util.Random;

public class CirclePosition {

    public Coordinate calcRandomPosition(int radius, Coordinate start) {
        Random r = new Random();
        return calcPosition(radius, r.nextInt(0, 356), start);
    }

    public Coordinate calcPosition(int radius, int angle, Coordinate start) {
        //Formel für Kreis (x-start.getX())^2+(y-start.getY())^2 = radius

        // Ganz ehrlich? ChatGPT!
        // Kreisparameter
        double h = start.getX(), k = start.getY(), r = radius;
        // Geradenparameter
        double x0 = start.getX(), y0 = start.getY(), theta = Math.toRadians(angle);
        // Berechnung der Steigung und y-Achsenabschnitt der Geraden
        double m = Math.tan(theta), c = y0 - m * x0;
        // Koeffizienten der quadratischen Gleichung
        double A = 1 + m * m, B = 2 * (m * (c - k) - h), C = h * h + (c - k) * (c - k) - r * r;
        // Diskriminante
        double D = B * B - 4 * A * C;
        if (D >= 0) {
            double sqrtD = Math.sqrt(D);
            for (double sign : new double[]{1, -1}) {
                double x = (-B + sign * sqrtD) / (2 * A);
                double y = m * x + c;
                return new Coordinate((int) x, (int) y);
            }
        } else {
            System.out.println("Keine reellen Schnittpunkte.");
        }

        return new Coordinate(0, 0);
    }

}
