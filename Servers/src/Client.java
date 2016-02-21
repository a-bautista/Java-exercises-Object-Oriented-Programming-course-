import java.net.*;
import java.io.*;

public class Client {

    public void go(){
        try{
            Socket s = new Socket("127.0.0.1",4242);
            //Listen in this port.
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader (streamReader);

            String advice=reader.readLine();
            //get the advice from the server.

            System.out.println("Today you should: "+advice);
            reader.close();
        }catch(IOException io){
            System.out.println("error: "+io.toString());
        }


    }

    public static void main(String args[]){
        Client cliente = new Client();
        cliente.go();
    }
}
