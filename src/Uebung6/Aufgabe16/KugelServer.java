package Uebung6.Aufgabe16;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class KugelServer {

    private static int port = 52390;

    public static void main(String[] args) throws IOException {
        Random r = new Random();
        while (true) {
            try {
                ServerSocket p = new ServerSocket(port);
                Socket c = p.accept();
                OutputStream serverOut = c.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(serverOut);
                BufferedWriter writer = new BufferedWriter(osw);
                // Datenerzeugung
                int x = r.nextInt(100,1000);
                int y = r.nextInt(100,1000);
                double kx = r.nextDouble(x-10);
                double ky = r.nextDouble(y-10);
                Color color = Color.getHSBColor(r.nextFloat(100), 0.9F, 0.8F);
                writer.write(x + "\n");
                writer.write(y + "\n");
                writer.write("" + kx + "\n");
                writer.write("" + ky + "\n");
                writer.write(color.getRed() + "\n");
                writer.write(color.getGreen() + "\n");
                writer.write(color.getBlue() + "\n");
                System.out.println("Have written to Client");
                writer.newLine();
                writer.flush();
                c.close();
                // Bad practice!
                p.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
