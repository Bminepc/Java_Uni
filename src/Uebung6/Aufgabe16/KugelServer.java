package Uebung6.Aufgabe16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class KugelServer {

    private static int port = 52390;

    public static void main(String[] args) throws IOException {
        while (true) {
            try {
                ServerSocket p = new ServerSocket(port);
                Socket c = p.accept();
                OutputStream serverOut = c.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(serverOut);
                BufferedWriter writer = new BufferedWriter(osw);
                writer.write("Bananas");
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
