/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author larr0
 */
public class Auto {
    String patente;
    String marca;
    double cc;
    int puertas;
    int marchas;
    String rendimiento;
    Auto(){
        
    }
    Auto(double cc){
        this.cc=cc;
    }
    Auto(String patente){
        this.patente=patente;
    }
    Auto(String patente,String marca){
        this.marca = marca;
        this.patente = patente;
    }
    Auto(int puertas, String patente, double cc){
        this.puertas = puertas;
        this.patente = patente;
        this.cc = cc;
        if(cc>3){
            this.rendimiento="g";
        }else{
            this.rendimiento="e";
        }
        
    }


    
}
