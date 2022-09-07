
package modelo;

public class Usuario {
    private int codigoUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String NIT;
    private String usuario;
    private String passwordUser;
    private String correoElectronico;
    private int codigoTUsuario;
    private int codigoDepartamento;

    public Usuario() {
    }

    public Usuario(int codigoUsuario, String nombreUsuario, String apellidoUsuario, String NIT, String usuario, String passwordUser, String correoElectronico, int codigoTUsuario, int codigoDepartamento) {
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.NIT = NIT;
        this.usuario = usuario;
        this.passwordUser = passwordUser;
        this.correoElectronico = correoElectronico;
        this.codigoTUsuario = codigoTUsuario;
        this.codigoDepartamento = codigoDepartamento;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCodigoTUsuario() {
        return codigoTUsuario;
    }

    public void setCodigoTUsuario(int codigoTUsuario) {
        this.codigoTUsuario = codigoTUsuario;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
    
    
    
}
