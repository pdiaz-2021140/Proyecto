
package modelo;

public class Producto {
    private int codigoProducto;
    private String nombreProducto;
    private int stock;
    private Double precio;
    private int codigoMarca;
    private int codigoTalla;
    private int codigoTProducto;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, int stock, Double precio, int codigoMarca, int codigoTalla, int codigoTProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.precio = precio;
        this.codigoMarca = codigoMarca;
        this.codigoTalla = codigoTalla;
        this.codigoTProducto = codigoTProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public int getCodigoTalla() {
        return codigoTalla;
    }

    public void setCodigoTalla(int codigoTalla) {
        this.codigoTalla = codigoTalla;
    }

    public int getCodigoTProducto() {
        return codigoTProducto;
    }

    public void setCodigoTProducto(int codigoTProducto) {
        this.codigoTProducto = codigoTProducto;
    }
    
    
    
}
