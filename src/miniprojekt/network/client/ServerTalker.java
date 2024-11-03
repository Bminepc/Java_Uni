package miniprojekt.network.client;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import java.io.*;
import java.net.Socket;

public class ServerTalker extends Thread{

    private Listhead<Spaceobject> spaceobjects;
    private Socket myServer;
    private Boolean resend;

    public ServerTalker(String host){
        spaceobjects = null;
        resend = false;
        try {
            myServer = new Socket(host, 52390);
            getData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(myServer.getInputStream()));

    }

    private void resend() throws IOException {
        resend = false;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(myServer.getOutputStream()));
    }

    public Listhead<Spaceobject> getSpaceobjects(){
        return spaceobjects;
    }

    public void run(){
        while(true){
            if(resend){
                try {
                    resend();
                }catch (Exception _){}
            }
        }
    }
}
