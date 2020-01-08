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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese tamaño del arreglo");
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt();
        String[] arreglo1 = new String[t];
        int[] arreglo2 = new int[t];
        
        for (int i = 0; i < t; i++) {
            System.out.println("Ingrese nombre");
            arreglo1[i]=lector.next();
            arreglo2[i]=arreglo1[i].length();
            
            
        }
        for (int i = 0; i < t; i++) {
            System.out.println("Nombre: "+arreglo1[i]);
            System.out.println(" Largo: "+arreglo2[i]);
        }
        
        }
        
    }
    

