
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public List listar(){
            String sql = "select * from producto";
            List<Producto> listaProducto = new ArrayList<>();
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    Producto pr = new Producto();
                    pr.setCodigoProducto(rs.getInt(1));
                    pr.setNombreProducto(rs.getString(2));
                    pr.setStock(rs.getInt(3));
                    pr.setPrecio(rs.getDouble(4));
                    pr.setCodigoMarca(rs.getInt(5));
                    pr.setCodigoTalla(rs.getInt(6));
                    pr.setCodigoTProducto(rs.getInt(7));
                    pr.setFotoProducto(rs.getString(8));
                    listaProducto.add(pr);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
                    
            return listaProducto;        
        }
        
        // Agregar
        
        public int agregar(Producto pr){
            String sql = "Insert into producto(nombreProducto, stock, precio, codigoMarca, codigoTalla, codigoTProducto, fotoProducto) values(?,?,?,?,?,?,?)";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, pr.getNombreProducto());
                ps.setInt(2,pr.getStock());
                ps.setDouble(3, pr.getPrecio());
                ps.setInt(4, pr.getCodigoMarca());
                ps.setInt(5, pr.getCodigoTalla());
                ps.setInt(6, pr.getCodigoTProducto());
                ps.setString(7, pr.getFotoProducto());
                
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No se pudo agregar registro");
            }
            return resp;
        }
        
        // Buscar
        
        public Producto listarCodigoProducto(int id){
            Producto pr = new Producto();
            String sql = "select * from producto where codigoProducto = "+ id;
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    pr.setCodigoProducto(rs.getInt(1));
                    pr.setNombreProducto(rs.getString(2));
                    pr.setStock(rs.getInt(3));
                    pr.setPrecio(rs.getDouble(4));
                    pr.setCodigoMarca(rs.getInt(5));
                    pr.setCodigoTalla(rs.getInt(6));
                    pr.setCodigoTProducto(rs.getInt(7));
                    pr.setFotoProducto(rs.getString(8));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return pr;
        }
        
        //Editar
        
        public int actualizar(Producto pr){
            String sql = "Update producto set nombreProducto = ?, stock = ?, precio = ? where codigoProducto = ?";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, pr.getNombreProducto());
                ps.setInt(2, pr.getStock());
                ps.setDouble(3, pr.getPrecio());
                ps.setInt(4, pr.getCodigoProducto());
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
            return resp;
        }
        
        //Eliminar
        
        public void eliminar(int id){
            String sql = "delete from Producto where codigoProducto = "+id;
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}
