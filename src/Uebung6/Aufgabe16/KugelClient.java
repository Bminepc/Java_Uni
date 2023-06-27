package Uebung6.Aufgabe16;

import java.io.IOException;
import java.net.Socket;

public class KugelClient {
    public static void main(String[] args) throws IOException {
        try {
            Socket kugelSocket = new Socket("132.195.45.233", 52390);
        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        System.out.println("B");

    }
}
