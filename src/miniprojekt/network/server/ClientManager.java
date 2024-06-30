package miniprojekt.network.server;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientManager extends Thread {

    private Server server;
    private Listhead<Spaceobject> spaceobjects;
    private Socket socket;
    private Boolean needResend;


    public ClientManager(Socket socket,  Server server, Listhead<Spaceobject> spaceobjects) {
        this.server = server;
        this.spaceobjects = spaceobjects;
        this.socket = socket;
        needResend = false;
    }

    public void NeedResend(){
        needResend = true;
    }

    private void resed(){

    }

    public void run() {
        super.run();
        try(InputStream is = socket.getInputStream()) {
            while (true){
                if (needResend){
                    resed();
                    needResend = false;
                }
                if(is.read() != -1){

                }
            }
        }catch (IOException e){
            System.out.println("Client wurde getrennt");
        }
    }
}
