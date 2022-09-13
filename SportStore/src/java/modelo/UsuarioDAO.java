
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //Validación de usuario y contraseña
    public Usuario validar(String usuario, String passwordU) {
        Usuario user = new Usuario();
        String sql = "Select * from Usuario where usuario = ? and passwordUser = ?";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, passwordU);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                user.setCodigoUsuario(rs.getInt("codigoUsuario"));
                user.setNombreUsuario(rs.getString("nombreUsuario"));
                user.setApellidoUsuario(rs.getString("apellidoUsuario"));
                user.setNIT(rs.getString("NIT"));
                user.setUsuario(rs.getString("usuario"));
                user.setPasswordUser(rs.getString("passwordUser"));
                user.setCorreoElectronico(rs.getString("correoElectronico"));
                user.setCodigoDepartamento(rs.getInt("codigoDepartamento"));
                user.setCodigoTUsuario(rs.getInt("codigoTUsuario"));
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
    //Operaciones CRUD
    
    //Método Listar
    
    public List listar() {
        String sql = "select * from Usuario";
        List<Usuario> listaUsuario = new ArrayList<>();
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Usuario user = new Usuario();
                user.setCodigoUsuario(rs.getInt(1));
                user.setNombreUsuario(rs.getString(2));
                user.setApellidoUsuario(rs.getString(3));
                user.setNIT(rs.getString(4));
                user.setCorreoElectronico(rs.getString(5));
                user.setUsuario(rs.getString(6));
                user.setPasswordUser(rs.getString(7));
                user.setCodigoTUsuario(rs.getInt(8));
                user.setCodigoDepartamento(rs.getInt(9));
                user.setFotoUsuario(rs.getString(10));
                listaUsuario.add(user);
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return listaUsuario;
    }
    
    
    //Método Agregar
    
    public int agregar(Usuario user) {
        String sql = "insert into Usuario(nombreUsuario, apellidoUsuario, NIT, correoElectronico, usuario, passwordUser, codigoTUsuario, codigoDepartamento, fotoUsuario) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getApellidoUsuario());
            ps.setString(3, user.getNIT());
            ps.setString(4, user.getCorreoElectronico());
            ps.setString(5, user.getUsuario());
            ps.setString(6, user.getPasswordUser());
            ps.setInt(7, user.getCodigoTUsuario());
            ps.setInt(8, user.getCodigoDepartamento());
            ps.setString(9, user.getFotoUsuario());
            ps.executeUpdate();
            
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        
        return resp;
    }
    
        public int agregarCliente(Usuario user) {
        String sql = "insert into Usuario(nombreUsuario, apellidoUsuario, NIT, correoElectronico, usuario, passwordUser,codigoDepartamento,codigoTUsuario) values(?, ?, ?, ?, ?, ?, ?,3)";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getApellidoUsuario());
            ps.setString(3, user.getNIT());
            ps.setString(4, user.getCorreoElectronico());
            ps.setString(5, user.getUsuario());
            ps.setString(6, user.getPasswordUser());
            ps.setInt(7, user.getCodigoDepartamento());
            ps.executeUpdate();
            
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        }
        
        return resp;
        
        
    }
    
    
    
    //Método buscar por código
    
    public Usuario listarCodigoUsuario(int id) {
        Usuario user = new Usuario();
        String sql = "select * from Usuario where codigoUsuario = " + id;
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                user.setNombreUsuario(rs.getString(2));
                user.setApellidoUsuario(rs.getString(3));
                user.setNIT(rs.getString(4));
                user.setCorreoElectronico(rs.getString(5));
                user.setUsuario(rs.getString(6));
                user.setPasswordUser(rs.getString(7));
                user.setCodigoTUsuario(rs.getInt(8));
                user.setCodigoDepartamento(rs.getInt(9));
               
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
    
    //Método para editar
    
    public int actualizar(Usuario user) {
        String sql = "Update Usuario set nombreUsuario = ?, apellidoUsuario = ?, NIT = ?, usuario = ?, passwordUser = ?, correoElectronico = ? where codigoUsuario = ?";
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getApellidoUsuario());
            ps.setString(3, user.getNIT());
            ps.setString(4, user.getUsuario());
            ps.setString(5, user.getPasswordUser());
            ps.setString(6, user.getCorreoElectronico());
            ps.setInt(7, user.getCodigoUsuario());
            ps.executeUpdate();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return resp;
    }
    
    
    //Método para eliminar
    
    public void eliminar(int id) {
        String sql = "delete from Usuario where codigoUsuario = " + id;
        
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
