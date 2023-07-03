package Uebung6.Aufgabe17.Server;

import Uebung6.Aufgabe17.Assets.Kreissaver;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class ServerSocketManager extends Thread{
    private Boolean isConnected = true;
    private Socket socket;
    private ArrayList<Kreissaver> kreise = new ArrayList<>();

    private Random r = new Random();
    private int selfId = 0;
    private ConnectionWasLost cwl;

    public ServerSocketManager(Socket socket, ArrayList<Kreissaver> kreise, ConnectionWasLost cwl){
        this.socket = socket;
        this.kreise = kreise;
        this.cwl = cwl;
    }

    private void sendFirstCircles(){
        OutputStream serverOut = null;
        try {
            serverOut = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(serverOut);
            BufferedWriter writer = new BufferedWriter(osw);
            // Datenerzeugung
            int x = 600;
            int y = 600;
            double kx = r.nextDouble(50,550);
            double ky = r.nextDouble(50,550);
            Color color = Color.getHSBColor(r.nextFloat(100), 0.9F, 0.8F);
            kreise.add(new Kreissaver(kx,ky,color));
            selfId = kreise.size()-1;
            writer.write(x + "\n");
            writer.write(y + "\n");
            for(int i = 0; i < kreise.size();i++){
                writer.write("Has Next" + System.lineSeparator()); // Status
                writer.write(kreise.get(i).getX() + "\n");
                writer.write(kreise.get(i).getY() + "\n");
                writer.write(kreise.get(i).getColor().getRed() + "\n");
                writer.write(kreise.get(i).getColor().getGreen() + "\n");
                writer.write(kreise.get(i).getColor().getBlue() + "\n");
            }
            System.out.println("Have written to Client");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendCircles() {
        if (isConnected) {
            OutputStream serverOut = null;
            try {
                serverOut = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(serverOut);
                BufferedWriter writer = new BufferedWriter(osw);

                writer.write("New Data");
                for (int i = 0; i < kreise.size(); i++) {
                    writer.write("Has Next" + System.lineSeparator()); // Status
                    writer.write(kreise.get(i).getX() + "\n");
                    writer.write(kreise.get(i).getY() + "\n");
                    writer.write(kreise.get(i).getColor().getRed() + "\n");
                    writer.write(kreise.get(i).getColor().getGreen() + "\n");
                    writer.write(kreise.get(i).getColor().getBlue() + "\n");
                }
                System.out.println("Have written to Client");
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Ich habe einen Socket bekommen");
        sendFirstCircles();
        try{
            int temp = 0;
            while (true){
                if(temp < cwl.getConnectionWasLost()){
                    temp = cwl.getConnectionWasLost();
                    sendCircles();
                }
                socket.getInputStream().read();
            }
        } catch (IOException e) {
            kreise.remove(selfId);
            isConnected = false;
            cwl.ConnectionLost();
        }
    }
}
