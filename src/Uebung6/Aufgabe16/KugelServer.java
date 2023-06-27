package Uebung6.Aufgabe16;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class KugelServer {

    private static int port = 52390;

    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket p = new ServerSocket(port);
            Socket c = p.accept();
            System.out.println(c.getRemoteSocketAddress());
        }
    }
}
