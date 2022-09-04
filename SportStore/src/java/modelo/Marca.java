package modelo;


public class Marca {
    private int codigoMarca;
    private String nombreMarca;
    private String numeroContacto;

    public Marca() {
    }

    public Marca(int codigoMarca, String nombreMarca, String numeroContacto) {
        this.codigoMarca = codigoMarca;
        this.nombreMarca = nombreMarca;
        this.numeroContacto = numeroContacto;
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
    
}
