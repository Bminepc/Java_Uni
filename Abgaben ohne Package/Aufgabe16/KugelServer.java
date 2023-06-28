
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
        ArrayList<Kreissaver> kreise = new ArrayList<>();
        Random r = new Random();
        while (true) {
            try {
                ServerSocket p = new ServerSocket(port);
                Socket c = p.accept();
                OutputStream serverOut = c.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(serverOut);
                BufferedWriter writer = new BufferedWriter(osw);
                // Datenerzeugung
                int x = 600;
                int y = 600;
                double kx = r.nextDouble(50,550);
                double ky = r.nextDouble(50,550);
                Color color = Color.getHSBColor(r.nextFloat(100), 0.9F, 0.8F);
                kreise.add(new Kreissaver(kx,ky,color));
                writer.write(x + "\n");
                writer.write(y + "\n");
                for(int i = 0; i < kreise.size();i++){
                    writer.write("Has Next\n"); // Status
                    writer.write(kreise.get(i).getX() + "\n");
                    writer.write(kreise.get(i).getY() + "\n");
                    writer.write(kreise.get(i).getColor().getRed() + "\n");
                    writer.write(kreise.get(i).getColor().getGreen() + "\n");
                    writer.write(kreise.get(i).getColor().getBlue() + "\n");
                }
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