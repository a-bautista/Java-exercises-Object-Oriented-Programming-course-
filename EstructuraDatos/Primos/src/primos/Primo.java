/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primos;

/**
 *
 * algoritmo para saber si un número es primo
 */
public class Primo {

    public boolean esPrimo(int n){
          int r;
          boolean es=true;

        for (int i=2; i<n; i++){
            r=n%i;
            if(r==0){
                es=false;
                break;
                }
           }
           return es;
      }

  }


