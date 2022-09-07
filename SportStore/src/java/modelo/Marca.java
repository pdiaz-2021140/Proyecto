package modelo;


public class Marca {
    private int codigoMarca;
    private String nombreMarca;
    private String numeroContacto;
    private String correoContacto;
    public Marca() {
    }

    public Marca(int codigoMarca, String nombreMarca, String numeroContacto, String correoContacto) {
        this.codigoMarca = codigoMarca;
        this.nombreMarca = nombreMarca;
        this.numeroContacto = numeroContacto;
        this.correoContacto = correoContacto;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

 
}
