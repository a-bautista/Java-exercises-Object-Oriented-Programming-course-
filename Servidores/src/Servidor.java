/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexbr
 */
import java.io.*;
import java.net.*;
public class Servidor {
    
    public static final int port=5432;
    public Servidor(){
        try{
            ServerSocket server = new ServerSocket(port);
            Socket s=server.accept();
            InputStream input= s.getInputStream();
            DataInputStream data= new DataInputStream(input);
            System.out.println("Recibí de ti"+data.readUTF());
        }catch(Exception e){
            e.toString();
        }
    }
}
