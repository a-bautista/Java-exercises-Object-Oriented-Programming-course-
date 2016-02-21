import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class TestModelo extends JFrame{
    Container pantalla;
    GridBagLayout gbl=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    JButton btn1,btn2;
    JTable jt;
    JScrollPane scroll;
    Modelo modelo = new Modelo();
    int reg=0;

    public TestModelo(){
       pantalla=getContentPane();
       pantalla.setLayout(gbl);
       btn1=new JButton("Altas");
       btn2=new JButton("Bajas");
       btn1.addActionListener(new Eventos());
       btn2.addActionListener(new Eventos());
       jt= new JTable(modelo);
       scroll=new JScrollPane(jt);
       gbc.weightx=2;
       gbc.weighty=10;
       gbc.fill=GridBagConstraints.BOTH;
       plantilla(scroll,1,1,2,1);
       gbc.weighty=1;
       plantilla(btn1,1,12,1,1);
       plantilla(btn2,2,12,1,1);
       this.pack();
       this.validate();
       this.setVisible(true);
       this.setSize(400,400);
    }
    public void plantilla(Component obj,int coordx, int coordy, int anchura,int altura){
        gbc.gridx=coordx;
        gbc.gridy=coordy;
        gbc.gridwidth=anchura;
        gbc.gridheight=altura;
        gbl.setConstraints(obj, gbc);
        pantalla.add(obj);
    }
    public class Eventos implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btn1){
               Persona p = new Persona("roberto", "landeta",reg);
               modelo.agregaPersona(p);
               reg++;
            }
            if (e.getSource()==btn2){
                modelo.borraPersona(0);
                reg--;
            }
        }
    }
    public static void main(String args[]){
        TestModelo tm = new TestModelo();
        tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}