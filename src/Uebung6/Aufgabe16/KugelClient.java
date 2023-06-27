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
        try {
            Socket kugelSocket = new Socket("localhost", 52390);
            InputStream clientIn = kugelSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(clientIn);
            BufferedReader reader = new BufferedReader(isr);
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
            kx = Double.parseDouble(reader.readLine());
            ky = Double.parseDouble(reader.readLine());
            c = new Color(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
            System.out.println(c);
            System.out.println(x);
            System.out.println(y);
            System.out.println(kx);
            System.out.println(ky);

        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        JFrame frame = new JFrame("Kreis");
        ClientPanel panel = new ClientPanel();
        panel.setKreis(kx,ky,c);
        panel.setSize(x,y);

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(x,y);
        frame.setVisible(true);
    }
}
