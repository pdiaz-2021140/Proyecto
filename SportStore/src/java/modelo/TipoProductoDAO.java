

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
                 
                   tp.setCodigoProducto(rs.getInt(1));
                   tp.setDescripcion(rs.getString(2));
                   tp.setGenero(rs.getString(3));
                   listaTipoProducto.add(tp);
               }  
            }catch(Exception e){
                e.printStackTrace();
            }
        return listaTipoProducto ;
    }
     
      public int agregar (TipoProducto emp){
      
        String sql = "insert into tipoProducto (descripcion , genero) values (?,?)";
        
        try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,emp.getDescripcion());
            ps.setString(2,emp.getGenero());
            ps.executeUpdate();
            
        }catch(Exception e){
           
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        }
                    
        
        
        return resp;
    }
          public TipoProducto listaTipoProducto (int id){
        TipoProducto tp = new TipoProducto();
             String sql = "select * from Empleado where codigoEmpleado = "+id;
      
        try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()){
                tp.setDescripcion(rs.getString(2));
                tp.setGenero(rs.getString(3));

            }
            
        }catch(Exception e){
           
            e.printStackTrace();
            
        }
        return tp;
    }
    
              public int actualizar(TipoProducto tp){
        String sql = "Update TipoProducto set descripcion = ?, genero= ? where codigoTipoProducto = ?";
        
        try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,tp.getDescripcion());
            ps.setString(2,tp.getGenero());
            ps.setInt(3,tp.getCodigoProducto());
            ps.executeUpdate();
            
           
            
            
        }catch(Exception e){
           
            e.printStackTrace();
           
        }
        
        return resp;
    }
              
              
        public void eliminar (int id){
        String sql ="delete from tipoProducto where codigoTipoProducto ="+id;
    
    try{
            
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
           
            
            
        }catch(Exception e){
           
            e.printStackTrace();
           
        }
    
    }
    
}


