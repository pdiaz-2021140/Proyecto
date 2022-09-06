package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FormaDePagoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    
    
    
    //Metodo Listar FormaDePago
    public List listar() {
        String sql = "select * from FormaDePago";
        List<FormaDePago> listaFormaPago = new ArrayList<>();
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                FormaDePago formP = new FormaDePago();
                formP.setCodigoFormaDePago(rs.getInt(1));
                formP.setFormaDePago(rs.getString(2));
                listaFormaPago.add(formP);
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return listaFormaPago;
    }
    
    //Metodo Agregar
    public int agregar(FormaDePago formP){
        String sql = "insert into FormaDePaGO(formaDePago) values(?)"; 
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, formP.getFormaDePago());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        } 
        
        
        return resp;
    }
    
    
}
