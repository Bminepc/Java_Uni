package Uebung6.Aufgabe17.Client;

import Uebung6.Aufgabe17.Assets.Kreissaver;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

public class ClientManager extends Thread{
    private BufferedReader reader;
    private ClientPanel panel;
    public  ClientManager(BufferedReader reader, ClientPanel panel){
        this.reader = reader;
        this.panel = panel;
    }

    @Override
    public void run(){
        super.run();
        while(true){
            try {
                if (reader.readLine().equals("New Data")){
                    while (reader.readLine().equals("Has Next")) {
                        double kx = Double.parseDouble(reader.readLine());
                        double ky = Double.parseDouble(reader.readLine());
                        Color c = new Color(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                        panel.addKreis(kx,ky,c);
                    }
                    panel.repaint();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
