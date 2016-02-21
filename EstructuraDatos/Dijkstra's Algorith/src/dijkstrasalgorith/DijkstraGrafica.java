package dijkstrasalgorith;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DijkstraGrafica extends JFrame {

    int puntos[][]=new int[5][4];
    int adyacencia[][]=new int[5][5];
    Insets insets;
    JLabel lb1, lb2, lb3, lb4;
    JTextField txt1, txt2, txt3, txt4;
    JButton btn1, btn2;
    Container pantalla;

    BorderLayout border=new BorderLayout();
    int figura=0;
    Panel p=new Panel();

  DijkstraGrafica(){

    this.setLayout(border);
    lb1=new JLabel("Etiqueta 1");
    lb2=new JLabel("Etiqueta 2");

    txt1=new JTextField(10);
    txt2=new JTextField(10);

    btn1=new JButton("Dijkstra's");
    btn2=new JButton("Boton 2");

    btn1.addActionListener(new Eventos());
    btn2.addActionListener(new Eventos());

    p.add(lb1); p.add(txt1);
    p.add(lb2); p.add(txt2);
    p.add(btn1); p.add(btn2);

    this.add("South",p);
    setSize(900,500);
    setVisible(true);
}

public int minimo(){

    int p=-1;
    int menor=99999;

    for(int i=1;i<puntos.length;i++){
        if(puntos[i][1]<menor && puntos[i][2]==0){
            menor=puntos[i][1];
            p=i;
        }
    }
    return p;
}

public void Inicializa(){

    adyacencia[1][1]=0;
    adyacencia[1][2]=3;
    adyacencia[1][3]=1;
    adyacencia[1][4]=0;
    adyacencia[2][1]=3;
    adyacencia[2][2]=0;
    adyacencia[2][3]=1;
    adyacencia[2][4]=2;
    adyacencia[3][1]=1;
    adyacencia[3][2]=1;
    adyacencia[3][3]=0;
    adyacencia[3][4]=5;
    adyacencia[4][1]=0;
    adyacencia[4][2]=2;
    adyacencia[4][3]=5;
    adyacencia[4][4]=0;

    for(int i=1;i<puntos.length;i++){
        puntos[i][1]=99999;
        puntos[i][2]=0;
    }
    puntos[1][1]=0;
}

public void RutaMasCorta(){

    Inicializa();
    boolean vacia=false;
    int u;

    while(vacia==false){
        u=minimo();

        if(u==-1){
            vacia=true;
        }else{
            for(int k=1;k<adyacencia.length;k++){
                if(adyacencia[u][k]!=0 && puntos[u][2]==0){
                    if(adyacencia[u][k]+puntos[u][1]<puntos[k][1]){
                       puntos[k][1]=adyacencia[u][k]+puntos[u][1];
                    }
                }
            }
            puntos[u][2]=1;

        }
    }
}

public void Imprime(){
    System.out.println("Matriz de puntos");
    for(int j=1; j<puntos.length; j++ ){
        System.out.println("Renglón j"+"\t"+j+"\t"+puntos[j][1]+"\t"+puntos[j][2]+"\t"+puntos[j][3]);
    }
}

public class Eventos implements ActionListener{
    public void actionPerformed (ActionEvent e){

        if(e.getSource()==btn1){
            RutaMasCorta();
            Imprime();
        }
        if(e.getSource()==btn2){
            System.exit(0);
        }

    }
  }

}










