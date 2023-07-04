package Uebung6.Aufgabe16;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class KugelClient {
    public static void main(String[] args) throws IOException {
        int x = 0, y = 0;
        double kx = 0.0, ky = 0.0;
        Color c = new Color(0,0,0);
        JFrame frame = new JFrame("Kreis");
        ClientPanel panel = new ClientPanel();
        try {
            // erstelle neues Socket mit BufferedReader zum auslesen
            Socket kugelSocket = new Socket("localhost", 52390);
            InputStream clientIn = kugelSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(clientIn);
            BufferedReader reader = new BufferedReader(isr);
            //lese X und Y Koordinaten aus dem InputStream
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
            // lese weitere Daten ein, solange weitere Daten verfügbar
            while (reader.readLine().equals("Has Next")) {
                kx = Double.parseDouble(reader.readLine());
                ky = Double.parseDouble(reader.readLine());
                c = new Color(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                panel.addKreis(kx,ky,c);
            }

        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        // Standard Fenster formatierungen
        panel.setSize(x,y);
        panel.repaint();
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(x,y);
        frame.setVisible(true);
    }
}
