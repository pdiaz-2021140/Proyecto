
package modelo;


public class TipoUsuario {
    
    private int codigoTUsuario;
    private String tipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int codigoTUsuario, String tipoUsuario) {
        this.codigoTUsuario = codigoTUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getCodigoTUsuario() {
        return codigoTUsuario;
    }

    public void setCodigoTUsuario(int codigoTUsuario) {
        this.codigoTUsuario = codigoTUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
    
    
    
}
