/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia16;

import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class Guia16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cPositivos=0;
        int[] arreglo = new int[20];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Ingrese un numero");
            arreglo[i]=lector.nextInt();
            if(arreglo[i]>=0){
                cPositivos++;
            }
        }
        System.out.println("El numero de Positivos es: "+cPositivos);
    }
    
}
