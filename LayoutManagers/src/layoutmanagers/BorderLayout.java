package layoutmanagers;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class BorderLayout {

    
    public static void main(String[] args) {
        BorderLayout button = new BorderLayout();
        button.go();
    }

    private String[] list={"one","two","three","four","five"};
    private JFrame JFrame;
    private JButton JButton, JButton2;
    private JPanel panel;
    private JScrollPane scroll;
    private JScrollPane scroll2;
    private JTextArea txtArea = new JTextArea();
    private JList JList= new JList(list);

    public void go(){
        JFrame = new JFrame("Ejemplo");
        //JFrame.setLayout((LayoutManager) new BorderLayout());
        panel = new JPanel();
        JButton = new JButton("Click me!");
        JButton2 = new JButton("Click me 2!");
        scroll = new JScrollPane(txtArea);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        JList.setVisibleRowCount(2);
        JList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        txtArea.setLineWrap(true);
        Font bigFont = new Font ("serif",Font. BOLD,28);
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(scroll);
        panel.setSize(150, 150);
        JFrame.setContentPane(panel);
        
        
        JButton.setFont(bigFont);
        panel.add(JButton);
        panel.add(JButton2);
        panel.add(JList);
        JButton.addActionListener(new Eventos());
        JButton2.addActionListener(new Eventos());
        //JList.addListSelectionListener();

        JFrame.setSize(300,300);
        JFrame.setVisible(true);

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if (e.getSource()==JButton) {
                txtArea.append("Button clicked");

            }
            if (e.getSource()==JButton2) {
                txtArea.selectAll();
            }
        }
        public void valueChanged(ListSelectionEvent lse){

        }
    }


}
/*
  panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        
        panel.add(uno);
        panel.add(dos);
        panel.add(tres);
        panel.add(cuatro);
        panel.add(cinco);
        panel.add(seis);
        panel.add(siete);
        panel.add(ocho);
        panel.add(nueve);
        panel.add(suma);
        panel.add(resta);
        panel.add(divide);
        panel.add(producto);
        panel.add(borrar);
        panel.add(punto);
        panel.add(igualdad);
        panel.add(enter);
        panel.add(display);
        
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.NORTH,display);
        //frame.add(panel,BorderLayout.WEST);
        */