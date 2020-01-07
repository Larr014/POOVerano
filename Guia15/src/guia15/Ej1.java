/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia15;

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
        
        double menores=0,mayores=0;
        String respuesta;
        do {
            System.out.println("Ingrese edad");
            Scanner lector = new Scanner(System.in);
            int edad = lector.nextInt();
            if(edad<18){
                menores++;
            }
            else{
                mayores++;
            }
                        
            do {
                System.out.println("Desea ingresar otra edad S/N");
                respuesta = lector.next();
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
            
        } while (respuesta.equalsIgnoreCase("s"));
        double total = mayores + menores;
        System.out.println("El numero de personas mayores es: "+mayores);
        System.out.println("El porcentaje es: "+(mayores/total)*100);
        System.out.println("El numero de personas menores es: "+menores);
        System.out.println("El porcentaje es: "+(menores/total)*100);
    }
    
}
