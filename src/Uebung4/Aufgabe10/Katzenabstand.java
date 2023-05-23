package Uebung4.Aufgabe10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math.*;

public class Katzenabstand extends JFrame {

    JPanel eingabe = new JPanel();
    JPanel ausgabe = new JPanel();
    JButton berechne = new JButton("Berechnen");
    JLabel eingabeInfo = new JLabel("Abstand zur Katze:");
    JLabel meter = new JLabel("m");
    JLabel zurechnungsfahigkeit = new JLabel("Zurechnungsfähigkeit: ");
    JLabel output = new JLabel("XX,XX%");
    JTextField input = new JTextField();

    public Katzenabstand() {
        super("Katzenabstand");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        berechne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dInput = Double.parseDouble(input.getText());
                System.out.println(dInput);
                double dOutput = 100 * (2 * Math.PI * Math.pow(dInput, 5.0)) / ((2 * Math.PI * Math.pow(dInput, 5.0)) + 1);
                output.setText(dOutput + "%");
            }
        });

        input.setColumns(20);
        eingabe.add(eingabeInfo);
        eingabe.add(input);
        eingabe.add(meter);
        ausgabe.add(berechne);
        ausgabe.add(zurechnungsfahigkeit);
        ausgabe.add(output);

        this.setLayout(new BorderLayout());
        this.add(eingabe, BorderLayout.BEFORE_FIRST_LINE);
        this.add(ausgabe, BorderLayout.AFTER_LAST_LINE);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Katzenabstand::new);
    }
}

