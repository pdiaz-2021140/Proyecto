package modelo;


public class FormaDePago {
    private int codigoFormaDePago;
    private String formaDePago;

    public FormaDePago() {
    }

    public FormaDePago(int codigoFormaDePago, String formaDePago) {
        this.codigoFormaDePago = codigoFormaDePago;
        this.formaDePago = formaDePago;
    }

    public int getCodigoFormaDePago() {
        return codigoFormaDePago;
    }

    public void setCodigoFormaDePago(int codigoFormaDePago) {
        this.codigoFormaDePago = codigoFormaDePago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
    
   

}
