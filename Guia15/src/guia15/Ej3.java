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
public class Ej3 {
    public static void main(String[] args) {
        
        double total=0,cPerros=0,cGatos=0, cConejos=0;
        String respuesta;
        int tipo=0;
        Scanner lector;
        do {
            do {
                System.out.println("Ingrese tipo de mascota ");
                System.out.println("--1 si es Perro");
                System.out.println("--2 si es Gato");
                System.out.println("--3 si es Conejo");
                lector = new Scanner(System.in);
                tipo = lector.nextInt();
            } while (tipo!=1 && tipo!=2 && tipo!=3);
            
            switch (tipo) {
                case 1:
                    cPerros++;
                    break;
                case 2:
                    cGatos+=1;
                    break;
                case 3:
                    cConejos=cConejos+1;
                
            }
            total++;
            
            System.out.println("Desea ingresar otra mascota S/N");
            respuesta = lector.next();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("El total de mascotas es: "+total);
        System.out.println("El % de perros es: "+(cPerros/total)*100);
        System.out.println("El % de Gatos es: "+(cGatos/total)*100);
        System.out.println("El % de Conejos es: "+(cConejos/total)*100);
    }
}
