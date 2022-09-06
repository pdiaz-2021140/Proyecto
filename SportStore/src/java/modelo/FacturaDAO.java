
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FacturaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    // Listar Factura
    public List listar() {
        String sql = "select * from Factura";
        List<Factura> listaFactura = new ArrayList<>();
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Factura fact = new Factura();
                fact.setCodigoFactura(rs.getInt(1));
                fact.setFechaFactura(rs.getString(2));
                fact.setEstado(rs.getInt(3));
                fact.setCodigoUsuario(rs.getInt(4));
                fact.setCodigoFPago(rs.getInt(5));
                listaFactura.add(fact);
            }   
        } catch(Exception e) {
            e.printStackTrace();
        }
        return listaFactura;
    }   
    
    // Agregar Factura
    
    public int agregar(Factura fact) {
        String sql = "Insert into Factura(fechaFactura, estado, codigoUsuario, codigoFormaDePago) values (?, ?, ?, ?)";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, fact.getFechaFactura());
            ps.setInt(2, fact.getEstado());
            ps.setInt(3, fact.getCodigoUsuario());
            ps.setInt(4, fact.getCodigoFPago());
            ps.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo Fact");
        }
        
        return resp;
    }    
    
    // Método buscar por código
    public Factura listarCodigoFactura(int id) {
        Factura fact = new Factura();
        String sql = "Select * from Factura where codigoFactura = " + id;
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                
                fact.setFechaFactura(rs.getString(2));
                fact.setEstado(rs.getInt(3));
                fact.setCodigoUsuario(rs.getInt(4));
                fact.setCodigoFPago(rs.getInt(5));
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return fact;
    }    
    
    // Método para editar factura
    
    public int actualizar(Factura fact) {
        String sql = "Update Factura set fechaFactura = ?, estado = ? where codigoFactura = ?";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, fact.getFechaFactura());
            ps.setInt(2, fact.getEstado());
            ps.setInt(3, fact.getCodigoFactura());
            ps.executeUpdate();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return resp;
    }    
    
    public void eliminar(int id) {
        String sql = "delete from Factura where codigoFactura = " + id;
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
