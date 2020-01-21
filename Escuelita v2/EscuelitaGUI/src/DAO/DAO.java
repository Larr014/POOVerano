/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Asignatura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author larr0
 */
public class DAO {
    private Connection con = null; //Para conectarse a la BDD
    private ResultSet rs = null; //resultado query
    private PreparedStatement sentencia = null;
    
    private void conectar(){
        try{
            String parametros = "com.mysql.jdbc.Driver";
            Class.forName(parametros);
            String url = "jdbc:mysql://remotemysql.com/cTARvacrlW"; //nombre bdd
            con = DriverManager.getConnection(url, "cTARvacrlW","IrpnVoBccW"); //user - pass
            
        
        }catch(SQLException el){
            System.out.println("ERROR SQL "+el.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void desconectar(){
        try{
            con.close();
        }catch(SQLException el){
            System.out.println(el.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void agregarAsignatura(String nombre){
        
        try{
            conectar();
            String query = "insert into Asignatura (nombreAsignatura, Profesor_idProfesor) "
                    + " values (?,?)";
            sentencia = con.prepareStatement(query);
            sentencia.setString(1,nombre);
            sentencia.setInt(2, 1);
            sentencia.execute();
            
            
        }catch(SQLException el){
            System.out.println(el.getMessage());
            }catch(Exception e){
            System.out.println(e.getMessage());
            }
        
        
    }
    public Asignatura buscarAsignatura(int codigo){
        Asignatura c = null;
        try{
            conectar();
            String query = "SELECT idAsignatura,nombreAsignatura"
                            +" FROM Asignatura WHERE idAsignatura = ?";
            sentencia = con.prepareStatement(query);
            sentencia.setInt(1, codigo);
            
            rs =sentencia.executeQuery();
            
            while(rs.next()){
                String nombre = rs.getString("nombreAsignatura");
                 c = new Asignatura(nombre,codigo);
            }
            
            return c;
            
            
        }catch(SQLException el){
            System.out.println(el.getMessage());
            return null;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        
        
        
    }
    
    public int eliminarAsignatura(int codigo){
        
        try{
            conectar();
            String query = "DELETE  FROM Asignatura WHERE idAsignatura=?";
            sentencia = con.prepareStatement(query);
            
            sentencia.setInt(1, codigo);
            sentencia.execute();
            return 1;
            
            
        }catch(SQLException el){
            System.out.println(el.getMessage());
            return -1;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
        
        
        
    }
    public String actualizarAsignatura(int codigo,String nombre){
        try{
            conectar();
            String query = "update Asignatura set nombreAsignatura=? where idAsignatura=?";
            sentencia = con.prepareStatement(query);
            sentencia.setString(1, nombre);
            sentencia.setInt(2,codigo);
            sentencia.execute();
            return "exito";
                      
        }catch(SQLException el){
            System.out.println(el.getMessage());
            return el.getMessage();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        
    }
    public ArrayList<Asignatura> buscarAsignaturas(){
        ArrayList<Asignatura> lista = new ArrayList<>();
        
        try{
            conectar();
            String query = "SELECT idAsignatura,nombreAsignatura FROM Asignatura ";
            sentencia = con.prepareStatement(query);
            rs =sentencia.executeQuery();
            
            while(rs.next()){
                int codigo = rs.getInt("idAsignatura");
                String nombre = rs.getString("nombreAsignatura");
                Asignatura a = new Asignatura(nombre,codigo);
                lista.add(a);
            }
            return lista;
                     
        }catch(SQLException el){
            System.out.println(el.getMessage());
            return null;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        
        
        
        
        
    }
            
            
            
            
            
            
    
}
