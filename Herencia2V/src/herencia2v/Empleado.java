/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2v;

/**
 *
 * @author larr0
 */
public class Empleado extends Persona{
    private String cargo;

    public Empleado(String cargo, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" 
                + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", rut=" + rut 
                + ", cargo=" + cargo 
                + '}';
    }
    
    
}
