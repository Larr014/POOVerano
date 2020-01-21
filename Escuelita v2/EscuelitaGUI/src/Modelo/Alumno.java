/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author larr0
 */
public class Alumno extends Persona{
    private int edad;

    public Alumno(int edad, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.edad = edad;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
