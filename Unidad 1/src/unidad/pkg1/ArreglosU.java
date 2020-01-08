/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad.pkg1;

import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class ArreglosU {
    
    public static void main(String[] args) {
        
      String[] nombres = new String[4];
      nombres[0]="a";
      nombres[1]="b";
      nombres[2]="c";
      
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]);
        }
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese numero de alumnos");
        int nAlumnos = lector.nextInt();
        int[] edades = new int[nAlumnos];
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("Ingrese la edad del alumno n"+(i+1));
            
            /*
            int edad = lector.nextInt();
            edades[i] = edad;
            */
            edades[i] = lector.nextInt();
        }
        System.out.println("Length: "+edades.length);
        System.out.println("nAlumnos: "+nAlumnos);
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("La edad del alumno n"+(i+1)+" es "+edades[i]);
        }
      
        
        
        
        
    }
    
    
    
    
    
}
