package modelo;


public class DetalleFactura {
    private int codigoDFactura;
    private String horaDeEmision;
    private int codigoProducto;
    private int codigoFactura;

    public DetalleFactura() {
    }

    public DetalleFactura(int codigoDFactura, String horaDeEmision, int codigoProducto, int codigoFactura) {
        this.codigoDFactura = codigoDFactura;
        this.horaDeEmision = horaDeEmision;
        this.codigoProducto = codigoProducto;
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoDFactura() {
        return codigoDFactura;
    }

    public void setCodigoDFactura(int codigoDFactura) {
        this.codigoDFactura = codigoDFactura;
    }

    public String getHoraDeEmision() {
        return horaDeEmision;
    }

    public void setHoraDeEmision(String horaDeEmision) {
        this.horaDeEmision = horaDeEmision;
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
