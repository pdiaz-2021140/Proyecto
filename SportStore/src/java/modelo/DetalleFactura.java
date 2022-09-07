
package modelo;


public class DetalleFactura {
    private int codigoDFactura;
    private int codigoProducto;
    private int codigoFactura;

    public DetalleFactura() {
        
    }

    public DetalleFactura(int codigoDFactura, int codigoProducto, int codigoFactura) {
        this.codigoDFactura = codigoDFactura;
        this.codigoProducto = codigoProducto;
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoDFactura() {
        return codigoDFactura;
    }

    public void setCodigoDFactura(int codigoDFactura) {
        this.codigoDFactura = codigoDFactura;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    
    


    
    
    
}
