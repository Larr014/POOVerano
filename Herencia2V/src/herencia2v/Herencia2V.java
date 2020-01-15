/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2v;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author larr0
 */
public class Herencia2V {
    static Scanner lector = new Scanner(System.in);
    //static Empresa[] listaEmpresas = new Empresa[99];
    static ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        while (true) {
            do {
                System.out.println("1 Agregar Empresa");
                System.out.println("2 Mostrar Empresas");
                System.out.println("3 Eliminar Empresa");
                System.out.println("4 Mostrar Empresa");
                System.out.println("5 Agregar Proveedor");
                System.out.println("6 Mostrar Proveedores");
                System.out.println("7 Eliminar Proveedor");
                System.out.println("8 Mostrar Proveedor");
                opcion = lector.nextInt();
            } while (opcion<1 || opcion>8);
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
                    agregarProveedor();
                    break;
                case 6:
                    mostrarProveedores();
                    break;
                case 7:
                    eliminarProveedor();
                    break;
                case 8:
                    mostrarProveedor();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
        
        
    }

    private static void agregarEmpresa() {
        System.out.println("Ingrese nombre empresa");
        String nombre = lector.next();
        System.out.println("Ingrese codigo empresa");
        int codigo = lector.nextInt();
        Empresa e = new Empresa(nombre,codigo);
        listaEmpresas.add(e);
    }

    private static void mostrarEmpresas() {
        System.out.println(listaEmpresas.toString());
    
    }

    private static void eliminarEmpresa() {
        Empresa e = buscarEmpresa();
        
        if(e!=null){
            listaEmpresas.remove(e);
        }
        else{
            System.out.println("No se encontro coincidencias");
        }
        
    }
    private static Empresa buscarEmpresa(String nombre){
        for (Empresa empresa : listaEmpresas) {
            if(empresa.getNombre().equals(nombre)){
                return empresa;
            }
        }
        return null;
    }
    private static Empresa buscarEmpresa(int codigo){
        for (Empresa empresa : listaEmpresas) {
            if(empresa.getCodigo()==codigo){
                return empresa;
            }
        }
        return null;
    }

    private static void mostrarEmpresa() {
        Empresa e = buscarEmpresa();
        if(e!=null){
            System.out.println(e.toString());
        }
        else{
            System.out.println("No se encontro coincidencias");
        }
    }
    private static Empresa buscarEmpresa(){
        Empresa e;
        int opcion;
        do {
            System.out.println("1 Para buscar por nombre");
            System.out.println("2 Para buscar por codigo");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese nombre empresa");
                String nombre = lector.next();
                e = buscarEmpresa(nombre);
                
                break;
            case 2:
                System.out.println("Ingrese codigo empresa");
                int codigo = lector.nextInt();
                e = buscarEmpresa(codigo);
                
                break;
            default:
                throw new AssertionError();
        }
       return e;
        
    }

    private static void agregarProveedor() {
        System.out.println("Ingrese nombre proveedor");
        String nombre = lector.next();
        System.out.println("Ingrese apellido proveedor");
        String apellido = lector.next();
        System.out.println("Ingrese rut proveedor");
        String rut = lector.next();
        System.out.println("Ingrese rubro proveedor");
        String rubro = lector.next();
        System.out.println("Ingrese codigo proveedor");
        int codigo = lector.nextInt();
        Empresa e = buscarEmpresa();
        if(e!=null){
            e.agregarProveedor(nombre, apellido, rut, rubro, codigo);
        }
        else{
            System.out.println("No hay coincidencias");
        }
    }

    private static void mostrarProveedores() {
        Empresa e = buscarEmpresa();
        if(e!=null){
            e.mostrarProveedores();
        }else{
            System.out.println("No hay coincidencias");
        }
        
    }

    private static void eliminarProveedor() {
        Empresa e = buscarEmpresa();
        if(e!=null){
            int opcion;
        do {
            System.out.println("1 Proveedor por rut");
            System.out.println("2 Proveedor por codigo");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese rut del proveedor");
                String rut = lector.next();
                //listaEmpresas[respuesta].eliminarProveedor(rut);
                e.eliminarProveedor(rut);
                break;
            case 2:
                System.out.println("Ingrese codigo del proveedor");
                int codigo = lector.nextInt();
                e.eliminarProveedor(codigo);
                break;
            default:
                throw new AssertionError();
        }
        }else{
            System.out.println("No se encontro coincidencias");
        }
        
        
        
        
        
        
        
    }

    private static void mostrarProveedor() {
       Empresa e = buscarEmpresa();
        if(e!=null){
            int opcion;
        do {
            System.out.println("1 Proveedor por rut");
            System.out.println("2 Proveedor por codigo");
            opcion = lector.nextInt();
        } while (opcion<1 || opcion>2);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese rut del proveedor");
                String rut = lector.next();
                //listaEmpresas[respuesta].eliminarProveedor(rut);
                e.mostrarProveedor(rut);
                break;
            case 2:
                System.out.println("Ingrese codigo del proveedor");
                int codigo = lector.nextInt();
                e.mostrarProveedor(codigo);
                break;
            default:
                throw new AssertionError();
        }
        }else{
            System.out.println("No se encontro coincidencias");
        }
        
       
    }
   
    
    
    
    
    
    
    
}
