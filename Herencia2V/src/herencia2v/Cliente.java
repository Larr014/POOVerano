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
public class Cliente extends Persona {

    public Cliente(String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + '}';
    }
    
    
}
