/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1empresa;

import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class Ej1Empresa {
    static Scanner lector = new Scanner(System.in);
    static Empresa[] listaEmpresas = new Empresa[4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        while(true){
           do {
            System.out.println("Seleccione una opcion");
            System.out.println("1 Agregar empresa");
            System.out.println("2 Mostrar empresa");
            opcion = lector.nextInt();
            } while ( opcion<1 || opcion>2);
            switch (opcion) {
                case 1:
                    agregarEmpresa();
                    break;
                case 2:
                    mostrarEmpresas();
                    break;
                default:
                    throw new AssertionError();
            } 
        }
        
        
        
    }
    public static void agregarEmpresa(){
        System.out.println("Ingrese nombre de la empresa");
        String nombre = lector.next();
        System.out.println("Ingrese codigo de la empresa");
        int codigo = lector.nextInt();
        for (int i = 0; i < listaEmpresas.length; i++) {
            if(listaEmpresas[i]==null){
                listaEmpresas[i] = new Empresa(nombre,codigo);
                break;
            }
        }
    }
    
}
