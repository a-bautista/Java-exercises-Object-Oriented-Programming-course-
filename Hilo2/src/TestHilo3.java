import java.awt.*;
import java.awt.event.*;

public class TestHilo3 {

    //con la librería awt no necesitas poner jButton ni jTextField
    private Button  btn1,btn2,btn3,btn4;
    private TextField txt1;
    private TextArea txtA;
    private Frame frame;
    private Panel panel;
    Hilo h;
    Thread t;

    TestHilo3(){
        btn1 = new Button("start");
        btn2 = new Button("Susped");
        btn3 = new Button("Resume");
        btn4 = new Button("Exit");
        txt1 = new TextField(30);
        txtA = new TextArea(10,50);
        frame = new Frame("prueba");
        panel = new Panel();
        frame.setLayout(new BorderLayout());
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        frame.add(txt1,BorderLayout.SOUTH);
        frame.add(txtA,BorderLayout.WEST);
        frame.add(panel,BorderLayout.CENTER);
        frame.setSize(600,400);
        frame.setVisible(true);
        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());
        Thread thread[] = new Thread[100];

    }

    public class Eventos implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btn1) {
                h=new Hilo(txt1.getText(),txtA);
                t = new Thread(h);
                t.start();
            }
            if (e.getSource()==btn2) {
                t.suspend();//esto indica que ya es obsoleto
               // t.interrupt();
                t.stop();
            }
            if (e.getSource()==btn3) {
                t.resume();

                //t.run();
            }
            if (e.getSource()==btn4) {
                System.exit(0);
            }
        }
    }

    public static void main (String args[]){
        TestHilo3 t3 = new TestHilo3();


    }

}
