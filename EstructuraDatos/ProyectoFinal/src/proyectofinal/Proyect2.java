package proyectofinal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Proyect2 extends JFrame {


    Insets insets_prueba; //son límites para saber dónde inicia todo

    BorderLayout border=new BorderLayout();
    Panel p=new Panel();

    private int x1, y1,l1;


    public int x[];
    public int xe2[];
    public int xe3[];
    
    public int a1, a2, a3;
   


  Proyect2(){

     setTitle("Hanoi Gráfico");
     this.setLayout(border);
     this.setBackground(Color.WHITE);
     this.add("North",p);
     setSize(500,500);
     setVisible(true);

   }

   public void paint(Graphics g){

      super.paint(g);

      //Bases

      //izuierda
      g.setColor(Color.black);
      g.fillRect(5, 450, 130, 30);

      //enmedio
      g.setColor(Color.black);
      g.fillRect(180, 450, 130, 30);

      //derecha
      g.setColor(Color.black);
      g.fillRect(360, 450, 130, 30);

      //agujas

      //1
      g.setColor(Color.gray);
      g.fillRect(65, 340, 5, 110);

      //2
      g.setColor(Color.gray);
      g.fillRect(240, 340, 5, 110);

      //3
      g.setColor(Color.gray);
      g.fillRect(420, 340, 5, 110);


       for (int i=0; i<x.length; i++){

         if(x[i]!=-1){
              y1=450-30*((x.length)-i);
              x1=5+3*((x.length)-i);
              l1=130-5*((x.length)-i);
              g.setColor(Color.red);
              g.fillRect(x1, y1, l1, 30);
            
            }
       }

      for (int i=xe2.length-1; i>=0; i--){

        if(xe2[i]!=-1){
              y1=450-30*((x.length)-i);
              x1=180+3*((x.length)-i);
              l1=130-5*((x.length)-i);
              g.setColor(Color.gray);
              g.fillRect(x1, y1, l1, 30);
           }
         }


      for (int i=xe3.length-1; i>=0; i--){
          if(xe3[i]!=-1){

              y1=450-30*((x.length)-i);
              x1=360+3*((x.length)-i);
              l1=130-5*((x.length)-i);
              g.setColor(Color.gray);

              g.fillRect(x1, y1, l1, 30);
          }
         }

      validate();

   }
   public void tamano(int a){

       x=new int [a];
       xe2=new int [a];
       xe3=new int [a];

       //llenado de torres

       for(int k=0; k<x.length; k++){
           xe2[k]=-1;
           xe3[k]=-1;

       }

   }

   public void pescar(char p, char y, char z){

       int val=0;

       if (p=='I'){

           for(int h=0; h<x.length; h++){

               if(x[h]!=-1){
                   val=x[h];
                   System.out.println(val);
                   x[h]=-1;
                   h=x.length;
                   System.out.println("oh");
               }
           }
            if(z=='D'){

               for(int h=xe3.length-1; h>=0 ;h--){
                   if(xe3[h]==-1){
                        xe3[h]=val;
                        h=-1;
                        System.out.println("ah");
                       
                   }
               }
            }else if(z=='C'){

               for(int h=xe2.length-1; h>=0; h--){
                   if(xe2[h]==-1){
                       xe2[h]=val;
                       h=-1;
                       System.out.println("eh");
                   }
                }
            }


            }else if(p=='D'){

            for(int h=0; h<xe2.length; h++){

               if(xe2[h]!=-1){
                   val=xe2[h];
                   xe2[h]=-1;
                   h=xe2.length;
                   System.out.println(val);
                        }

                    }
        for(int h=0; h<x.length; h++){
                 if(x[h]!=-1){
                   val=x[h];
                   x[h]=-1;
                   h=x.length;

                        }
                 System.out.println("vacio");
             }


                if(y=='I'){
                   for(int h=xe3.length-1; h>xe3.length; h--){
                       if(xe3[h]==-1){
                           xe3[h]=val;

                        System.out.println("dah");

                           h=xe3.length;
                             }
                            }
                        }
                     }


    repaint();
               }


    }

 

