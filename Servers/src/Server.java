import java.io.*;
import java.net.*;

public class Server {

    String [] adviceList ={"Take smaller bites","Go for the tight jeans.",
    "One word: inappropriate","Just for today, be honest.","Stroll around Interlomas"};

    public void go(){
        try{
            ServerSocket server = new ServerSocket(4242);
            //Just listen for the clients on this port

            while(true){
                //The server goes into a permanent loop waiting for (and
                //servicing) client requests.

                Socket sock = server.accept();
                //This method blocks (just sits there) until a request
                //comes in and then the method returns a Socket (on some
                //anonymous port) for communicating with the client.

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                //Use the Socket connection to the client to make a PrintWriter and
                //send it (print it) a string advice message.

                String advice = getAdvice();
                writer.println(advice);
                //write this line on the client
                writer.close();
                //we are done with this client.
                System.out.println(advice);
            }
        }catch(IOException io){
            System.out.println("error: "+io.toString());
        }
    }

    private String getAdvice(){
        int random=(int) (Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args){
        Server server = new Server();
        server.go();
    }

}
