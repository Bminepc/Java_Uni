package Uebung6.Aufgabe16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class KugelClient {
    public static void main(String[] args) throws IOException {
        try {
            Socket kugelSocket = new Socket("localhost", 52390);
            InputStream clientIn = kugelSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(clientIn);
            BufferedReader reader = new BufferedReader(isr);
            System.out.println(reader.readLine());
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }
}
