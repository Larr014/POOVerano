/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

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
        
        Scanner lector = new Scanner(System.in);
        Auto auto1 = new Auto();
        auto1.cc=1.6;
        auto1.marca="Toyota";
        auto1.marchas=6;
        auto1.patente="123456";
        auto1.puertas=5;
        System.out.println("Auto1");
        System.out.println("cc: "+auto1.cc);
        System.out.println("marca: "+auto1.marca);
        System.out.println("marchas: "+auto1.marchas);
        System.out.println("patente: "+auto1.patente);
        System.out.println("puertas: "+auto1.puertas);
        Auto auto2 = auto1;
        auto2.cc=5;
        auto2.marca="Chevrolet";
        System.out.println("Auto2");
        System.out.println("cc2: "+auto2.cc);
         System.out.println("cc1: "+auto1.cc);
        System.out.println("marca2: "+auto2.marca);
        System.out.println("marca1 "+auto1.marca);
        System.out.println("marchas: "+auto2.marchas);
        System.out.println("patente: "+auto2.patente);
        System.out.println("puertas: "+auto2.puertas);
        Auto auto3 = new Auto();
        auto3.cc=6;
         System.out.println("cc1: "+auto1.cc);
         System.out.println("cc2: "+auto2.cc);
         System.out.println("cc3: "+auto3.cc);
         //auto3=null;
         System.out.println("cc1: "+auto1.cc);
         System.out.println("cc2: "+auto2.cc);
         System.out.println("cc3: "+auto3.cc);
         auto3 = auto1;
         System.out.println("cc1: "+auto1.cc);
         System.out.println("cc2: "+auto2.cc);
         System.out.println("cc3: "+auto3.cc);
         Auto auto4= new Auto(4.2);
         System.out.println("cc4: "+auto4.cc);
         Auto auto5 = new Auto("654321");
         System.out.println("patente5 "+auto5.patente);
         Auto auto6 = new Auto("Toyota","1234");
         System.out.println("patente6 "+auto6.patente);
         System.out.println("marca "+auto6.marca);
         Auto auto7 = new Auto(4,"toyota",6.4);
         System.out.println("rendimiento "+auto7.rendimiento);
         
         
         
         //Gato gato1 = new Gato("michi",3,"raza1");
         Gato gato1 = new Gato();
         gato1.setNombre("michi");
         gato1.setPeso(3);
         gato1.setRaza("raza1");
         
         System.out.println("nombre g1 "+gato1.getNombre());
         System.out.println("peso g1 "+gato1.getPeso());
         System.out.println("raza g1 "+gato1.getRaza());
    }
    
}
