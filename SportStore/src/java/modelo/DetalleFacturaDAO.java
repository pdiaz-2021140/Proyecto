

package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DetalleFacturaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    

    
  
    

    
    //LISTAR
    
    public List listar(){
    String sql = "select * from detalleFactura";
    List<DetalleFactura> listaDetalleFactura = new ArrayList<>();
    try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while(rs.next()){
                DetalleFactura dt = new DetalleFactura();
                dt.setCodigoDFactura(rs.getInt(1));
                dt.setHoraDeEmision(rs.getString(2));
                dt.setCodigoProducto(rs.getInt(3));
                dt.setCodigoFactura(rs.getInt(4));
                listaDetalleFactura.add(dt);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return listaDetalleFactura;
    }
    
    
    //AGREGAR
    
    public int agregar (DetalleFactura dt){
      
        String sql = "insert into DetalleFactura (horaDeEmision , codigoProducto , codigoFactura) values (?,?,?)";
        
        try{  
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, dt.getHoraDeEmision());
            ps.setInt(2,dt.getCodigoProducto());
            ps.setInt(3,dt.getCodigoFactura());
            ps.executeUpdate();
            
        }catch(Exception e){
           
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        } 
        return resp;
    }
    
    
    //BUSCAR
    
    public DetalleFactura listarCodigoDetalleFactura (int id){
        DetalleFactura dtFactura = new DetalleFactura();
        String sql ="Select * from detalleFactura where codigoDFactura = "+id;
        
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                dtFactura.setHoraDeEmision(rs.getString(2));
                dtFactura.setCodigoProducto(rs.getInt(3));
                dtFactura.setCodigoFactura(rs.getInt(4));
            
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return dtFactura;
    }
    
    
    // ACTUALIZAR 
    
        public int actualizar(DetalleFactura dt){
        String sql = "Update detalleFactura set horaDeEmision = ? where codigoDFactura = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, dt.getHoraDeEmision());
            ps.setInt(2, dt.getCodigoDFactura());
            ps.executeUpdate();
           
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    
    
    // ELIMINAR
    public void eliminar (int id){
        String sql = "delete  from detalleFactura where codigoDFactura = " +id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
  
  
    
}

    


