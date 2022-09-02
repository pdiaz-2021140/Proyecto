
package modelo;

public class Usuario {
    private int codigoUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String NIT;
    private String telefonoContacto;
    private String usuario;
    private String passwordU;
    private int codigoTUsuario;

    public Usuario() {
    }

    public Usuario(int codigoUsuario, String nombreUsuario, String apellidoUsuario, String NIT, String telefonoContacto, String usuario, String passwordU, int codigoTUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.NIT = NIT;
        this.telefonoContacto = telefonoContacto;
        this.usuario = usuario;
        this.passwordU = passwordU;
        this.codigoTUsuario = codigoTUsuario;
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

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    public int getCodigoTUsuario() {
        return codigoTUsuario;
    }

    public void setCodigoTUsuario(int codigoTUsuario) {
        this.codigoTUsuario = codigoTUsuario;
    }
    
    
}
