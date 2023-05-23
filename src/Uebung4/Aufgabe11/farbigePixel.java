package Uebung4.Aufgabe11;

import javax.swing.*;
import java.awt.*;

public class farbigePixel extends JFrame {
    public farbigePixel(){
        super("Farbige Pixel");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel malSpass = new JPanel();
        setLayout(new BorderLayout());
        add(malSpass, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(farbigePixel::new);
    }
}
