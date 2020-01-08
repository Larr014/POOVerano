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
public class ArreglosB {
      public static void main(String[] args) {
          
          int[][] edades = new int[3][2];
          String[][] nombres = new String[3][2];
          String[] curso = new String[3];
          Scanner lector = new Scanner(System.in);
          for (int i = 0; i < edades.length; i++) {
              System.out.println("Ingrese nombre del curso n"+(i+1));
              curso[i] = lector.next();
              System.out.println("Ingrese datos para el curso "+curso[i]);
              for (int j = 0; j < edades[i].length; j++) {
                  System.out.println("Ingrese nombre alumno n"+(j+1));
                  nombres[i][j] = lector.next();
                  System.out.println("Ingrese edad n"+(j+1));
                  edades[i][j] = lector.nextInt();
                  
              }
          }
          double acumG=0;
          for (int i = 0; i < edades.length; i++) {
              System.out.print("Curso n"+(i+1));
              System.out.println(" "+curso[i]);
              double acum = 0;
              for (int j = 0; j < edades[i].length; j++) {
                  System.out.print("Nombre: "+nombres[i][j]);
                  System.out.println(" Edad: "+edades[i][j]);
                  acum+=edades[i][j]; // acum = acum + edades[i][j]
              }
              double promedio = acum/edades[i].length;
              System.out.println("El promedio es: "+promedio);
              acumG+=promedio;
          }
          double promedioG = acumG/curso.length;
          System.out.println("El promedio general es: "+promedioG);
          
          
      }
}
