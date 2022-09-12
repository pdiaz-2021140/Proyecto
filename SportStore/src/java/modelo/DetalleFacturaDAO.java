
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
                dt.setCodigoProducto(rs.getInt(2));
                dt.setCodigoFactura(rs.getInt(3));
                listaDetalleFactura.add(dt);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return listaDetalleFactura;
    }
    
    
    //AGREGAR
    
    public int agregar (DetalleFactura dt){
      
        String sql = "insert into DetalleFactura (codigoProducto , codigoFactura) values (?,?)";
        
        try{  
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,dt.getCodigoProducto());
            ps.setInt(2,dt.getCodigoFactura());
            ps.executeUpdate();
            
        }catch(Exception e){
           
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        } 
        return resp;
    }
    
}

    


