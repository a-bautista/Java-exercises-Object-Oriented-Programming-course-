
package mouse;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.border.*;



public class Mov extends JFrame implements MouseMotionListener, MouseListener{
  //la palabra implements

    private JFrame jf=new JFrame("Ejemplo del mouse");
    private JLabel lb;
    private JTextField jt;

    Mov(){
        lb=new JLabel ("Mensaje");
        jt=new JTextField(10);


    }

    public void ConstruyeMoviemiento(){
        jf.add(lb,BorderLayout.NORTH);
        jf.add(jt,BorderLayout.SOUTH);
        jf.setSize(400,400);
        jf.addMouseMotionListener(this);
        jf.addMouseListener(this);
        jf.setVisible(true);
    }

    public void mouseEntered(MouseEvent e){
        jt.setText("el mouseentro");

    }
    public void mouseExited(MouseEvent e){
        jt.setText("se salió el mouse");

    }

    public void mouseDragged(MouseEvent e){
        jt.setText("x="+e.getX()+"y="+e.getY());
    }

    public void mouseMoved(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}


}
