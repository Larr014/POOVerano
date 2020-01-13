/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1empresa;

/**
 *
 * @author larr0
 */
public class Empresa {
    private String nombre;
    private int codigo;
    private Empleado[] listaEmpleados;
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
        return "Empresa{" + "nombre=" + nombre + ", codigo=" + codigo + ", listaEmpleados=" + listaEmpleados + '}';
    }

    

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = new Empleado[6];
    }

    public void agregarEmpleado(String nombre, String apellido, String rut){
        
        for (int i = 0; i < listaEmpleados.length; i++) {
            if(listaEmpleados[i]==null){
                listaEmpleados[i] = new Empleado(nombre,apellido,rut);
                break;
            }
        }
    }
    public void mostrarEmpleados(){
        for (int i = 0; i < listaEmpleados.length; i++) {
            if(listaEmpleados[i]!=null){
                System.out.println(listaEmpleados[i].toString());
            }
        }
        
        
    }
    public void eliminarEmpleado(String rut){
        for (int i = 0; i < listaEmpleados.length; i++) {
            if(listaEmpleados[i]!=null){
                if(listaEmpleados[i].getRut().equals(rut)){
                    listaEmpleados[i]=null;
                    break;
                }
            }
        }
    }
     
}
