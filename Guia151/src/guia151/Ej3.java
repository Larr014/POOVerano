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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] valores = {1,3,5,6,7};
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese valor a buscar");
        int val = lector.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if(valores[i]==val){
                System.out.println("El valor se encuentra en la posicion "+i);
            }
        }
        
        }
        
    }
    

