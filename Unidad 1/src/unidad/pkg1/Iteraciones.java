/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg1;

/**
 *
 * @author larr0
 */
public class Iteraciones {
    
      public static void main(String[] args) {
          /*
          a=a+1;
          a++;
          a+=1;
          */
          int val1=0;
          int val2=0;
          while (val1<10) {
              
              System.out.println("Hola "+(val1++)+" "+(++val2));
                      
          }
          System.out.println("Val1 "+val1+" val2 "+val2);
          for (int i = 0; i < 10; i++) {
              System.out.println("Chao "+(val1--)+" "+(--val2));
          }
          
          boolean z = true;
          int c=0;
          do {
              System.out.println("hola");
              c++;
          } while (z && c<10);
          
          z = false;
          while (z) {
              System.out.println("chao");
          }
          
          for (int i = 0; i < 10; i++) {
              if(i==4 || i==6){
                  continue;
              }
              else if(i==8){
                  break;
              }
              System.out.println("Iteracion n"+i);
          }
          
          
          
          
          
          
          
      }
}
