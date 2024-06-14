package miniprojekt.tools;

import java.util.Random;

public class CirclePosition {

    public Coordinate calcRandomPosition(int radius, Coordinate start) {
        Random r = new Random();
        return calcPosition(radius, r.nextInt(0, 356), start);
    }

    public Coordinate calcPosition(int radius, int angle, Coordinate start) {
        //Formel für Kreis (x-start.getX())^2+(y-start.getY())^2 = radius
        if (angle == 90) {
            return new Coordinate(start.getX(), start.getY() + radius);
        }
        if (angle == 270) {
            return new Coordinate(start.getX(), start.getY() - radius);
        }
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
            double x = 0;
            double y = 0;
            for (double sign : new double[]{1, -1}) {
                x = (-B + sign * sqrtD) / (2 * A);
                y = m * x + c;
                if (angle < 90 || angle > 270) {
                    return new Coordinate((int) x, (int) y);
                }
            }
            return new Coordinate((int) x, (int) y);
        } else {
            System.out.println("Keine reellen Schnittpunkte." + angle);
        }

        return new Coordinate(0, 0);
    }

}
