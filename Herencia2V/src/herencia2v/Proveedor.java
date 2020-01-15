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
public class Proveedor extends Persona{
    private String rubro;
    private int codigo;

    public Proveedor(int codigo, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Proveedor{" 
                + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", rut=" + rut 
                + ", rubro=" + rubro 
                + ", codigo=" + codigo 
                + '}';
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
