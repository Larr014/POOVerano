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
            System.out.println("2 Mostrar empresas");
            System.out.println("3 Eliminar empresa");
            System.out.println("4 Mostrar empresa");
            System.out.println("5 Agregar Empleado");
            System.out.println("6 Mostrar Empleados x Empresa");
            System.out.println("7 Eliminar Empleado x Empresa");
            System.out.println("8 Mostrar Empleado");
            opcion = lector.nextInt();
            } while ( opcion<1 || opcion>8);
            switch (opcion) {
                case 1:
                    agregarEmpresa();
                    break;
                case 2:
                    mostrarEmpresas();
                    break;
                case 3:
                    eliminarEmpresa();
                    break;
                case 4:
                    mostrarEmpresa();
                    break;
                case 5:
                    crearEmpleado();
                    break;
                case 6:
                    mostrarEmpleados();
                    break;
                case 7:
                    eliminarEmpleado();
                    break;
                case 8:
                    mostrarEmpleado();
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
    public static void mostrarEmpresas(){
        for (int i = 0; i < listaEmpresas.length; i++) {
            if(listaEmpresas[i]!=null){
                System.out.println(listaEmpresas[i].toString());
            }
            
        }
    
    }
    public static void eliminarEmpresa(){
        int opcion;
        do {
            System.out.println("Ingrese forma de eliminacion");
            System.out.println("1 para eliminar por codigo");
            System.out.println("2 para eliminar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo a buscar");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                //if
                //else
                break;
            case 2:
                System.out.println("Ingrese nombre a buscar");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                //if
                //else
                break;
            default:
                throw new AssertionError();
                
            
        }
        if(respuesta>=0){
                    listaEmpresas[respuesta] = null;
                }
                else{
                    System.out.println("no se encontro coincidencia");
        }
        
    }
    public static int buscarEmpresa(int codigo){
        for (int i = 0; i < listaEmpresas.length; i++) {
            if(listaEmpresas[i]!=null){
                if(listaEmpresas[i].getCodigo()==codigo){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int buscarEmpresa(String nombre){
        for (int i = 0; i < listaEmpresas.length; i++) {
            if(listaEmpresas[i]!=null){
                if(listaEmpresas[i].getNombre().equals(nombre)){
                    return i;
                }
            }
        }
        return -1;
        
    }
    public static void mostrarEmpresa(){
        int opcion;
        do {
            System.out.println("Ingrese forma de busqueda");
            System.out.println("1 para buscar por codigo");
            System.out.println("2 para buscar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                break;
            case 2:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                break;
            default:
                throw new AssertionError();
        }
        if(respuesta>=0){
            System.out.println(listaEmpresas[respuesta].toString());
        }
        else{
            System.out.println("No se encontraron coincidencias");
        }
    }
    public static void crearEmpleado(){
        System.out.println("Indique a que empresa se desea agregar empleado");
        int opcion;
        do {
            System.out.println("Ingrese forma de busqueda");
            System.out.println("1 para buscar por codigo");
            System.out.println("2 para buscar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                break;
            case 2:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Ingrese nombre del empleado");
        String nombre = lector.next();
        System.out.println("Ingrese apellido del empleado");
        String apellido = lector.next();
        System.out.println("Ingrese rut del empleado");
        String rut = lector.next();
        listaEmpresas[respuesta].agregarEmpleado(nombre, apellido, rut);
        
    }
    public static void mostrarEmpleados(){
        System.out.println("Indique a que empresa pertenecen"
                + " los empleados");
        int opcion;
        do {
            System.out.println("Ingrese forma de busqueda");
            System.out.println("1 para buscar por codigo");
            System.out.println("2 para buscar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                break;
            case 2:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                break;
            default:
                throw new AssertionError();
        }
        listaEmpresas[respuesta].mostrarEmpleados();
    }
    public static void eliminarEmpleado(){
        System.out.println("Indique a que empresa pertenecen"
                + " los empleados");
        int opcion;
        do {
            System.out.println("Ingrese forma de busqueda");
            System.out.println("1 para buscar por codigo");
            System.out.println("2 para buscar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                break;
            case 2:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Ingrese rut del empleado a eliminar");
        String rut = lector.next();
        listaEmpresas[respuesta].eliminarEmpleado(rut);
    }
    public static void mostrarEmpleado(){
        System.out.println("Indique a que empresa pertenecen"
                + " los empleados");
        int opcion;
        do {
            System.out.println("Ingrese forma de busqueda");
            System.out.println("1 para buscar por codigo");
            System.out.println("2 para buscar por nombre");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        int respuesta=-1;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                respuesta = buscarEmpresa(codigo);
                break;
            case 2:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                respuesta = buscarEmpresa(nombre);
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Ingrese rut del empleado a eliminar");
        String rut = lector.next();
        listaEmpresas[respuesta].mostrarEmpleado(rut);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
