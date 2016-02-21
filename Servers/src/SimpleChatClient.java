import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class SimpleChatClient {
    
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;
    
    public void go(){
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(scroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetWorking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);

    }
    
   private void setUpNetWorking(){
       try{
           sock = new Socket("127.0.0.1",5000);
           InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
           reader = new BufferedReader(streamReader);
           writer = new PrintWriter(sock.getOutputStream());
           System.out.println("networking established");
           
       }catch(IOException ex){
           System.out.println("error: "+ex.toString());
       }
   }
   
   public class SendButtonListener implements ActionListener{
       
       public void actionPerformed(ActionEvent e){
           
           try{
             writer.println(outgoing.getText());

             writer.flush();
           }catch(Exception ex){
               System.out.println(""+ex.toString());
           }
           //out of try-catch block
           outgoing.setText("");
           outgoing.requestFocus();
       }
   }//close SendButtonListener inner class

    public class IncomingReader implements Runnable{
        public void run(){
            String message;
            try{
                while((message = reader.readLine())!=null){
                    System.out.println("read "+message);
                    incoming.append(message+ "\n");
                    

                }
            }catch(Exception ex){
                System.out.println(" "+ex.toString());
            }
        }

    }//close inner class

   public static void main(String args[]){
       SimpleChatClient cliente =new SimpleChatClient();
       cliente.go();

   }
}
