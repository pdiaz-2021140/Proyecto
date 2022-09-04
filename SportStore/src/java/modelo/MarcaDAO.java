package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Marca;


public class MarcaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //Metodo para Validar
    public Marca validar(int codigoMarca, String nombreMarca){
        //Instanciar un objeto de tipo Marca
        Marca marca = new Marca();
        //Agregar una variable de tipo String para la consulta 
        String sql = "Select * from Marca where codigoMarca = ? and nombreMarca = ?";
        try{
            con= cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoMarca);
            ps.setString(2, nombreMarca);
            rs = ps.executeQuery();
            while(rs.next()){
            marca.setCodigoMarca(rs.getInt("codigoMarca"));
            marca.setNombreMarca(rs.getString("nombreMarca"));
            marca.setNumeroContacto(rs.getString("numeroContacto"));
            }
        }catch(Exception e){
            e.printStackTrace();
    }
    return marca;     //Marca Encontrada
    
    }
    
    //OPERACIONES DEL CRUD
    
    //METODO DE LISTAR
    
    public List listar(){
    String sql = "select * from  Marca";
    List<Marca> listaMarca = new ArrayList<>();
    try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Marca mc = new Marca();
            mc.setCodigoMarca(rs.getInt(1));
            mc.setNombreMarca(rs.getString(2));
            mc.setNumeroContacto(rs.getString(3));
            listaMarca.add(mc);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return listaMarca;
    }
    
    
    //METODO PARA AGREGAR
    public int agregar(Marca mc){
    String sql = "Insert into Marca (nombreMarca, numeroContacto) values(?,?)";
    try{
    con = cn.Conexion();
    ps = con.prepareStatement(sql);
    ps.setString(1, mc.getNombreMarca());
    ps.setString(2, mc.getNumeroContacto());
    ps.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("No se pudo agregar el registro");
    }
    return resp;
}
    
 // BUSCAR POR CODIGO
    public Marca listarCodigoMarca(int id){
        Marca mrc = new Marca();
        String sql = "Select * from Marca where codigoMarca = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mrc.setNombreMarca(rs.getString(2));
                mrc.setNumeroContacto(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return mrc;
    }
    
 //METODO PARA EDITAR
    public int actualizar(Marca mrc){
        String sql = "Update Marca set nombreMarca = ?, numeroContacto = ? where codigoMarca = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mrc.getNombreMarca());
            ps.setString(2, mrc.getNumeroContacto());
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
 //METODO PARA ELIMINAR
    public void eliminar (int id){
        String sql = "delete from Marca where codigoMarca = " + id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
      
    
    
}
