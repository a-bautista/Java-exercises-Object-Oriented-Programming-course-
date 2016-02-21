import javax.swing.*;
import java.awt.*;

public class MoveOval {

    int x=70;
    int y=70;

    public static void main(String args[]){
        MoveOval move= new MoveOval();
        move.go();
    }

    public void go(){
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i= 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();
            try{
                Thread.sleep(100);
            }catch(Exception ex){

            }
        }

    }//close go

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());//it hides the yellow smear
            g.setColor(Color.yellow);
            g.fillOval(x, y, 100, 100);
        }
    }
}
