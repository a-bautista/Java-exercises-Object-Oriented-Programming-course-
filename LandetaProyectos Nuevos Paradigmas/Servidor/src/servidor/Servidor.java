

package servidor;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class Servidor extends JFrame{


    private JTextField introduce;
    private JTextArea areaPantalla;

    private ObjectOutputStream salida;   /*
                                          * Input y Output serán necesarios para que exista una comunicación
                                          * entre cliente-servidor.
                                          */
    private ObjectInputStream entrada;
    private ServerSocket servidor;
    private Socket conexion;
    private int contador = 1;
    private JScrollPane scroll;




    public Servidor(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container pantalla = getContentPane();

        pantalla.setLayout(new FlowLayout());

        introduce = new JTextField(10);
        introduce.setEditable(false);
        introduce.addActionListener(new Eventos());
        pantalla.add(introduce);

        areaPantalla = new JTextArea();
        scroll = new JScrollPane(areaPantalla);

        setSize(500,500);
        setVisible(true);

        pantalla.add(areaPantalla);



    }



    public void ejecutaServidor(){

        try{

            servidor = new ServerSocket(12345,100);

            while (true){

                try{

                    esperarConexion();
                    obtenerFlujos();
                    procesarConexion();
                }catch(EOFException exceptionEOF){

                    mostrarMensaje("terminó la conexión");
                }
                finally
                        {
                    cerrarConexion();
                    contador++;

                }
            }
        }
        catch(IOException excepcionES){
            excepcionES.printStackTrace();
        }

    }

    private void esperarConexion() throws IOException {

        mostrarMensaje("Esperando conexión\n");
        conexion = servidor.accept();
        mostrarMensaje("Conexión"+contador+"recibida de:"+ conexion.getInetAddress().getHostAddress());
    }

    private void obtenerFlujos()throws IOException {

        salida = new ObjectOutputStream(conexion.getOutputStream());

        salida.flush();

        entrada = new ObjectInputStream(conexion.getInputStream());

        mostrarMensaje("Se obtuvieron los flujos E/S");

    }

    private void procesarConexion() throws IOException{

        String mensaje = "Conexión exitosa";
        enviarDatos(mensaje);

        setTextFieldEditable(true);


        do{
            try
                    {
                mensaje = (String) entrada.readObject();
                mostrarMensaje("mensaje");

            }catch(ClassNotFoundException excepcionClaseNoEncontrada){
                mostrarMensaje("objeto desconocido");
            }
        }while(!mensaje.equals("CLIENTE>>TERMINAR"));

    }


    private void cerrarConexion(){

        mostrarMensaje("Terminando conexion");
        setTextFieldEditable(false);

        try{
            salida.close();
            entrada.close();
            conexion.close();
        }catch(IOException excepcionES){

            excepcionES.printStackTrace();

        }


    }


    private void enviarDatos(String mensaje){

        try{
            salida.writeObject("SERVIDOR>>>"+mensaje);
            salida.flush();
            mostrarMensaje("Servidor"+mensaje);


    }catch(IOException excepcionES){

       areaPantalla.append("Error al escribir objeto");

        }
    }

    private void mostrarMensaje(final String mensajeAMostrar){

        SwingUtilities.invokeLater(

                new Runnable()
                {
                public void run(){
                    areaPantalla.append(mensajeAMostrar);
                }
             }
          );
    }

    private void setTextFieldEditable(final Boolean editable){

        SwingUtilities.invokeLater(

                new Runnable()
                {
                 public void run(){
                     introduce.setEditable(editable);
                 }

                }

                );
    }


    public class Eventos implements ActionListener{

        public void actionPerformed (ActionEvent e){

            enviarDatos(e.getActionCommand());
            introduce.setText("");
        }
    }

        public static void main(String args[]){

        Servidor h1 = new Servidor();

        h1.setVisible(true);
        h1.setSize(500,500);
    }
}
