
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TipoUsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement  ps;
    ResultSet rs;
    int resp;
    
    
    
    
    
    public List listar(){
            String sql = "select * from tipoUsuario";
            List<TipoUsuario> listaTUsuario = new ArrayList<>();
            try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
                while (rs.next()) {
                TipoUsuario tpu = new TipoUsuario();
                tpu.setCodigoTUsuario(rs.getInt(1));
                tpu.setTipoUsuario(rs.getString(2));
                listaTUsuario.add(tpu);
                    
                }
                
                
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR en listar");
        }
    
    
    
    
        return listaTUsuario;
    }
    
    
    
    public int agregar (TipoUsuario tdu){
        String sql = "insert into TipoUsuario (tipoUsuario) values (?)";
                
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);   
            ps.setString(1, tdu.getTipoUsuario());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR en Agregar");
        }
    
    
    
        return resp;
    }
    
    
    public TipoUsuario listarTipoUsuario (int id){
        TipoUsuario tdu = new TipoUsuario();
        String sql = "select * from tipoUsuario where codigoTUsuario =  "+ id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                tdu.setTipoUsuario(rs.getString(2));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR en Buscar");
        }

        return tdu;
        
    }
    
    
    //mostrar en la vista:
    
    public int actualizar (TipoUsuario tu){
         
         String sql = "Update tipoUsuario set tipoUsuario = ? where codigoTUsuario = ?";
         try {
             con = cn.Conexion();
             ps = con.prepareStatement(sql);
             ps.setString(1, tu.getTipoUsuario());
             ps.setInt(2, tu.getCodigoTUsuario());
             ps.executeUpdate();
             
         } catch (Exception e) {
             e.printStackTrace();
             System.out.println("Es de DAO" + e);
         }
     
     
         return resp;
     }   
    
    
    
    
    
    public void eliminar (int id){
        String sql ="delete from tipoUsuario where codigoTUsuario =" +id;
    
    try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate(); 
        }catch(Exception e){
           
            e.printStackTrace();
           
        }
    
    }
    
    
    
    
    
    
    
    
    
}
