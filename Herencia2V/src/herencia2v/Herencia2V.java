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
                opcion = lector.nextInt();
            } while (opcion<1 || opcion>4);
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
    
}
