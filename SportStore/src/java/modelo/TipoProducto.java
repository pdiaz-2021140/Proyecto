
package modelo;


public class TipoProducto {
      private int codigoProducto;
      private String descripcion;
      private String genero;

    public TipoProducto() {
    }

    public TipoProducto(int codigoProducto, String descripcion, String genero) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
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
