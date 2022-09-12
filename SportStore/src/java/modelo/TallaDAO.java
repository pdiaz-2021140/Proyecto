
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TallaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public List listar(){
            String sql = "select * from talla";
            List<Talla> listaTalla = new ArrayList<>();
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    Talla ta = new Talla();
                    ta.setCodigoTalla(rs.getInt(1));
                    ta.setNoTalla(rs.getString(2));
                    listaTalla.add(ta);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
                    
            return listaTalla;        
        }
        
        // Agregar
        
        public int agregar(Talla ta){
            String sql = "Insert into talla(noTalla) values(?)";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, ta.getNoTalla());
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No se pudo agregar registro de talla");
            }
            return resp;
        }
        
        // Buscar
        
        public Talla listarCodigoTalla(int id){
            Talla ta = new Talla();
            String sql = "select * from talla where codigoTalla = "+ id;
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    ta.setNoTalla(rs.getString(2));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return ta;
        }
        
        //Editar
        
        public int actualizar(Talla ta){
            String sql = "Update talla set noTalla = ? where codigoTalla = ?";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, ta.getNoTalla());
                ps.setInt(2, ta.getCodigoTalla());
            }catch(Exception e){
                e.printStackTrace();
            }
            return resp;
        }
        
        //Eliminar
        
        public void eliminar(int id){
            String sql = "delete from talla where codigoTalla = "+id;
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
}
