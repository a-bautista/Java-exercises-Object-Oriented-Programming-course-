/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author alejandro.bautista
 */
public class Fechas { //hay métodos únicamente

    public byte dias1(byte mes){ //metodo llamado dias1

        if(mes==1 || mes==3 || mes==5  || mes==7 || mes==8 || mes==10 || mes==12 ){
            return 31;
        }
        else if ( mes==4 || mes==6 || mes==9 || mes==11){
            return 30;

        }
        else if (mes==2){
            return 28;

        }else{ //si se omite este marca error
            return 0;
        }

    }

    public boolean valida (byte mes){

        if(mes>0 && mes<=12){
            return true;

        }else{
            return false;

        }
    }

    public byte dias2 (byte mes){  //este metodo accede al metodo valida
        if(valida(mes)==true){
          return dias1(mes);
            }
     
        else{
            return -1;
             }

        }
    //switch
  public byte dias3 (byte mes){
      switch (mes){
          case 1:
              return 31;
          case 2:
              return 28;
          case 3:
              return 31;
          case 4:
              return 30;
          case 5:
              return 31;
          case 6:
              return 30;
          case 7:
              return 31;
          case 8:
              return 31;
          case 9:
              return 30;
          case 10:
              return 31;
          case 11:
              return 30;
          case 12:
              return 31;
          default:
              return 0;
            }

      }

  }




