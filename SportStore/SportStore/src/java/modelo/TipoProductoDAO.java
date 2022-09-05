
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
     public List listar (){
        String sql = "select * from tipoProducto";
        List <TipoProducto> listaTipoProducto = new ArrayList<>();  
            try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery();
               
               while(rs.next()){
                   TipoProducto tp = new TipoProducto();
                 
                   tp.setcodigoProducto(rs.getInt(1));
                   tp.setDescripcion(rs.getString(2));
                   tp.setCodigoMarca(rs.getInt(3));
                   listaTipoProducto.add(tp);
               }  
            }catch(Exception e){
                e.printStackTrace();
            }
        return listaTipoProducto ;
    }
     
      public int agregar (TipoProducto emp){
      
        String sql = "insert into tipoProducto (descripcion , codigoMarca) values (?,?)";
        
        try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,emp.getDescripcion());
            ps.setInt(2,emp.getCodigoMarca());
            ps.executeUpdate();
            
        }catch(Exception e){
           
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        }
                    
        
        
        return resp;
    }
    
}


