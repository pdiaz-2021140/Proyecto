package modelo;

public class Factura {
    private int codigoFactura;
    private String fechaFactura; 
    private int estado;
    private int codigoUsuario;
    private int codigoFPago;

    public Factura() {
    }

    public Factura(int codigoFactura, String fechaFactura, int estado, int codigoUsuario, int codigoFPago) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.estado = estado;
        this.codigoUsuario = codigoUsuario;
        this.codigoFPago = codigoFPago;
    }
    
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoFPago() {
        return codigoFPago;
    }

    public void setCodigoFPago(int codigoFPago) {
        this.codigoFPago = codigoFPago;
    }

    
}
