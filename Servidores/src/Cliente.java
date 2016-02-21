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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente  {
    public static final String host= "172.19.51.227";
    public static final int port = 5432;
    
  
    public Cliente(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto;
        try {
            Socket s = new Socket(host,port);
            OutputStream os= s.getOutputStream();
            DataOutputStream data = new DataOutputStream(os);
            System.out.println("Que");
            texto=br.readLine();
            data.writeUTF(texto);
            s.close();
       }catch(Exception e){
        e.toString();
       
       }
    }
    public static void main(String args[]){
        Cliente c= new Cliente();
    }
}
