
package modelo;


public class TipoProducto {
      private int codigoTProducto;
      private String descripcion;
      private String genero;

    public TipoProducto() {
    }

    public TipoProducto(int codigoTProducto, String descripcion, String genero) {
        this.codigoTProducto = codigoTProducto;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public int getCodigoTProducto() {
        return codigoTProducto;
    }

    public void setCodigoTProducto(int codigoTProducto) {
        this.codigoTProducto = codigoTProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
