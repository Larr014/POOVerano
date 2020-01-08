/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia151;

import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese tamaño del arreglo");
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt();
        int[] arreglo = new int[t];
        System.out.println("Ingrese multiplo");
        int m = lector.nextInt();
        //llenamos el arreglo
        for (int i = 0; i < t; i++) {
            arreglo[i]= m*(i+1);
        }
        //mostramos los datos del arreglo
        for (int i = 0; i < t; i++) {
            System.out.println(arreglo[i]);
        }
        
    }
    
}
