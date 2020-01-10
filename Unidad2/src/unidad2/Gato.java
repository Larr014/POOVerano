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
public class Gato {
    private String nombre;
    private double peso;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Gato(String nombre, double peso, String raza) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
    }

    public Gato() {
    }
    
    @Override
    public String toString(){
        String retorno = "nombre: "+nombre+ " peso "+peso+" raza "+raza;
        return retorno;
    }
    
    
    
    
}
