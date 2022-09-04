
package modelo;


public class TipoProducto {
      private int codigoProducto ;
      private String descripcion;
      private int codigoMarca;

    public TipoProducto(int codigoProducto, String descripcion, int codigoMarca) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.codigoMarca = codigoMarca;
    }

    public TipoProducto() {
    }

    public int getcodigoProducto() {
        return codigoProducto;
    }

    public void setcodigoProducto(int codigoEmpleado) {
        this.codigoProducto = codigoEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }
    
}
