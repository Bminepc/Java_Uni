package Uebung6.Aufgabe17.Server;

import Uebung6.Aufgabe17.Assets.Kreissaver;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class KugelServer {

    private static int port = 52390;

    public static void main(String[] args) throws IOException {
        // TODO Wo muss hier ein Lock für unsere Variable hin?
        ArrayList<Kreissaver> kreise = new ArrayList<>();
        ArrayList<ServerSocketManager> sockets = new ArrayList<>();
            try {
                ServerSocket p = new ServerSocket(port);
                while (true) {
                    Socket c = p.accept();
                    sockets.add(new ServerSocketManager(c, kreise));
                    sockets.get(sockets.size() - 1).start();
                    for (int i = 0; i < sockets.size() - 1; i++) {
                        sockets.get(i).sendCircles();
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

    }
}
