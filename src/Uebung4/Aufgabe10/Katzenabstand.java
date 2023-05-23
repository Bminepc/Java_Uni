package Uebung4.Aufgabe10;

import javax.swing.*;

public class Katzenabstand extends JFrame {

    JPanel eingabe = new JPanel();
    JButton berechne = new JButton("Berechnen");
    JLabel eingabeInfo = new JLabel("Abstand zur Katze:");
    JLabel meter = new JLabel("m");
    JLabel zurechnungsfahigkeit = new JLabel("Zurechnungsfähigkeit: ");

    public Katzenabstand(){
        super("Katzenabstand");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Katzenabstand::new);
    }
}

