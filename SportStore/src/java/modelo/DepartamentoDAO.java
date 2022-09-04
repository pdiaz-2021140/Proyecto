/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Departamento;

/**
 *
 * @author mario
 */
public class DepartamentoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //Metodo para Validar
    public Departamento validar(int codigoDepartamento, String departamento, String municipio , int codigoUsuario){
        //Instanciar un objeto de tipo Departamento
        Departamento depto = new Departamento();
        //Agregar una variable de tipo String para la consulta 
        String sql = "Select * from Departamento where codigoDepartamento = ? and departamento = ?";
        try{
            con= cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoDepartamento);
            ps.setString(2, departamento);
            ps.setString(3, municipio);
            ps.setInt(4, codigoUsuario);
            rs = ps.executeQuery();
            while(rs.next()){
            depto.setCodigoDepartamento(rs.getInt("codigoDepartamento"));
            depto.setDepartamento(rs.getString("departamento"));
            depto.setMunicipio(rs.getString("municipio"));
            depto.setCodigoUsuario(rs.getInt("codigoUsuario"));
            }
        }catch(Exception e){
            e.printStackTrace();
    }
    return depto;     //Marca Encontrada
    
    }
    
    //OPERACIONES DEL CRUD
    
    //METODO DE LISTAR
    
    public List listar(){
    String sql = "select * from  Departamento";
    List<Departamento> listaDepartamento = new ArrayList<>();
    try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Departamento dep = new Departamento();
            dep.setCodigoDepartamento(rs.getInt(1));
            dep.setDepartamento(rs.getString(2));
            dep.setMunicipio(rs.getString(3));
            dep.setCodigoUsuario(rs.getInt(4));
            listaDepartamento.add(dep);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return listaDepartamento;
    }
    
    
    //METODO PARA AGREGAR
    public int agregar(Departamento dep){
    String sql = "Insert into Departamento (codigoDepartamento, departamento, municipio, codigoUsuario) values(?,?,?,?)";
    try{
    con = cn.Conexion();
    ps = con.prepareStatement(sql);
    ps.setInt(1, dep.getCodigoDepartamento());
    ps.setString(2, dep.getDepartamento());
    ps.setString(3, dep.getMunicipio());
    ps.setInt(4, dep.getCodigoUsuario());
    ps.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("No se pudo agregar el registro");
    }
    return resp;
}
    
 // BUSCAR POR CODIGO
    public Departamento listarCodigoDepto(int id){
        Departamento depart = new Departamento();
        String sql = "Select * from Departamento where codigoDepartamento = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                depart.setCodigoDepartamento(rs.getInt(1));
                depart.setDepartamento(rs.getString(2));
                depart.setMunicipio(rs.getString(3));
                depart.setCodigoUsuario(rs.getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return depart;
    }
    
 //METODO PARA EDITAR
    public int actualizar(Departamento dpt){
        String sql = "Update Departamento set departamento = ?, municipio = ?, codigoUsuario =? where codigoDepartamento = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, dpt.getDepartamento());
            ps.setString(2, dpt.getMunicipio());
            ps.setInt(3, dpt.getCodigoUsuario());
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
 //METODO PARA ELIMINAR
    public void eliminar (int id){
        String sql = "delete from Departamento where codigoDepartamento = " + id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
      
    
    
}

