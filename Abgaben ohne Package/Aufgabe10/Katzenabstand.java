/**************************************************/
/* Mathis Steinhage, Benjamin Wendt               */
/* Gruppe: Di10                                   */
/* Uebungsblatt: 4, Aufgabe: 10                   */
/* Thema: Abstand zur Katze, Swing                */
/* Datum: 12.06.2023                              */
/* Status: lauffaehig                             */
/**************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Katzenabstand extends JFrame {

    // Erstellen der nötigen Elemente
    JPanel eingabe = new JPanel();
    JPanel ausgabe = new JPanel();
    JButton berechne = new JButton("Berechnen");
    JLabel eingabeInfo = new JLabel("Abstand zur Katze:");
    JLabel meter = new JLabel("m");
    JLabel zurechnungsfahigkeit = new JLabel("Zurechnungsfähigkeit: ");
    JLabel output = new JLabel("XX,XX%");
    JTextField input = new JTextField();

    DecimalFormat df = new DecimalFormat("#0.00");

    public Katzenabstand() {
        // Standarteinstellungen für ein Fenster
        super("Katzenabstand");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Hinzufügen (und erstellen) der Aktionen für den Button
        berechne.addActionListener(new ActionListener() {
            // Wenn der Button gedrückt wurde
            @Override
            public void actionPerformed(ActionEvent e) {
                // Einlesen des Abstands aus dem Inputfeld und entsprechendes parsen des Strings
                double dInput = Double.parseDouble(input.getText());
                // Berechnen nach der Formel aus der Aufgabenstellung
                double dOutput = 100 * (2 * Math.PI * Math.pow(dInput, 5.0)) / ((2 * Math.PI * Math.pow(dInput, 5.0)) + 1);
                // Schreiben des Ergebnisses in das Ausgabefeld
                output.setText(df.format(dOutput) + "%");
                // Alles in einer Zeile machbar, aber aus Gründen der Lesbarkeit aufgeteilt
            }
        });

        // Einstellungen und Hinzufügen der Elemente zu ihren Elementen
        input.setColumns(20);
        eingabe.add(eingabeInfo);
        eingabe.add(input);
        eingabe.add(meter);
        ausgabe.add(berechne);
        ausgabe.add(zurechnungsfahigkeit);
        ausgabe.add(output);

        // Design und Hinzufügen der Finalen Elemente
        this.setLayout(new BorderLayout());
        this.add(eingabe, BorderLayout.BEFORE_FIRST_LINE);
        this.add(ausgabe, BorderLayout.AFTER_LAST_LINE);

        // Aufräumen
        pack();
        // Frame sichtbar machen
        setVisible(true);
    }

    // Standartinitialisierung aus dem Skript
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Katzenabstand::new);
    }
}

