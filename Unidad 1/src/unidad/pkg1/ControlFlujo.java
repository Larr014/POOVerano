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
public class ControlFlujo {
    
    public static void main(String[] args) {
        
        
        //IF
        boolean aburrido=true;
        if(aburrido!=true){
            System.out.println("Salir a jugar");
        }else{
            System.out.println("Quedarse en casa");
        }
        //otra forma
        if(!aburrido){
            System.out.println("Salir a jugar");
        }else{
            System.out.println("Quedarse en casa");
        }
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = lector.nextInt();
        
        if(edad<=0){
            System.out.println("No deberias tener esta edad");
        }else if(edad>=1 && edad<=5){
            System.out.println("Aun no sabes hablar");
        }
        else if(edad>5 && edad<7){
            System.out.println("Te salio tu primer diente");
        }
        else if(edad>=7 && edad<16){
            System.out.println("Tu primera fiesta");
        }
        else{
            System.out.println("Ya eres mayor de edad");
        }
        
        /*
        OR
        x / Y / R
        T / T / T
        T / F / T
        F / T / T
        F / F / F
        
        AND
        X / Y / R
        T / T / T
        F / T / F
        T / F / F
        F / F / F
        
        
        */
        int a = 5;
        
        switch (a) {
            case 1:
                System.out.println("Apretaste a");
                break;
            case 2:
                System.out.println("Apretaste b");
                break;
            case 3:
                System.out.println("Apretaste c");
                break;
            case 4:
                System.out.println("Apretaste d");
                break;
            case 5:
                System.out.println("Apretaste d");
                break;
            default:
                System.out.println("Error 404");
        }
        
        String nombre = "Juan";
        switch (nombre) {
            case "Juan":
                System.out.println("Es juan");
                break;
            default:
                System.out.println("No es Juan");
        }
        
        if(nombre.equals("Juan")){
            System.out.println("Es Juan");
        }else{
            System.out.println("No es Juan");
        }
        
    }
    
    
    
}
