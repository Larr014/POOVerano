/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2v;

import java.util.ArrayList;

/**
 *
 * @author larr0
 */
public class Empresa {
    private String nombre;
    private int codigo;
    private ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public Empresa(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
    public void agregarProveedor(String nombre, String apellido, String rut, String rubro, int codigo){
        Proveedor p = new Proveedor(codigo,nombre,apellido,rut);
        p.setRubro(rubro);
        listaProveedores.add(p);
    }
    public void mostrarProveedores(){
        System.out.println(listaProveedores.toString());
    }
    public void eliminarProveedor(String rut){
        for (Proveedor proveedor : listaProveedores) {
            if(proveedor.getRut().equals(rut)){
                listaProveedores.remove(proveedor);
                break;
            }
        }
    }
    public void eliminarProveedor(int codigo){
        for (Proveedor proveedor : listaProveedores) {
            if(proveedor.getCodigo()==codigo){
                listaProveedores.remove(proveedor);
                break;
            }
        }
        
        
    }
    public void mostrarProveedor(String rut){
        for (Proveedor proveedor : listaProveedores) {
            if(proveedor.getRut().equals(rut)){
                System.out.println(proveedor.toString());
                break;
            }
        }
    }
    public void mostrarProveedor(int codigo){
        for (Proveedor proveedor : listaProveedores) {
            if(proveedor.getCodigo()==codigo){
                System.out.println(proveedor.toString());
                break;
            }
        }
    }
    
}
