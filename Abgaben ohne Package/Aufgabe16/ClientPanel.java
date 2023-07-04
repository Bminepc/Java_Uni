/*************************************************************/
/* Mathis Steinhage, Benjamin Wendt                          */
/* Gruppe: Di10                                              */
/* Uebungsblatt: 6, Aufgabe: 16                              */
/* Thema: Kugeln & java.net                                  */
/* Datum: 04.07.2023                                         */
/* Status: lauffaehig                                        */
/*************************************************************/
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ClientPanel extends JPanel {
    private ArrayList<KreisSaver> kreise = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Zeichne übergebene Kreise
        for (int i = 0; i < kreise.size(); i++) {
            g.setColor(kreise.get(i).getColor());
            g.fillOval((int) kreise.get(i).getX(), (int) kreise.get(i).getY(), 10, 10);
        }
    }

    public void addKreis(double kx, double ky, Color c) {
        // Füge Kreise zu dem Array hinzu
        kreise.add(new KreisSaver(kx, ky, c));
    }
}
